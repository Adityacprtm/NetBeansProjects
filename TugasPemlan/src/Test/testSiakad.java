package Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Calendar;

import Siakad.*;

public class testSiakad {

	public static Mahasiswa createDummyMahasiswa(){
		Mahasiswa mhs = new Mahasiswa();
		mhs.setNIM("150000001");
		mhs.setName("Mahasiswa A");
		mhs.setEntryYear(2015);
		mhs.setSex(true); // male

		Address address = new Address("Jl. Pelan-Pelan Banyak Anak Kecil", "Malang", "Jawa Timur", "Indonesia");
		address.setGpsLatitude(-7.955083);
		address.setGpsLongitude(112.610824);
		mhs.setAddress(address);
		
		Calendar birthdate = Calendar.getInstance();
		birthdate.set(1997, 06, 15);
		mhs.setBirthDate(birthdate);
		mhs.setBirthPlace("Malang");
		
		mhs.setEntryYear(2015);
		mhs.setStudyProgram("S1 Ilmu Komputer");
		mhs.setDepartment("Ilmu Komputer");
		mhs.setFaculty("Fakultas Ilmu Komputer");	
		return mhs;
	}
	
	public static void printLoginStatus(int loginstatus){
		switch (loginstatus){
			case UserLogin.LOGGED_ID:
				System.out.println(">>> Reason: 1");
				break;
			case UserLogin.LOGGED_ID_ALREADY:
				System.out.println(">>> Reason: Already logged in.");
				break;
			case UserLogin.NOT_LOGGED_IN_NOT_ACTIVATED:
				System.out.println(">>> Reason: User is not activated.");
				break;
			case UserLogin.NOT_LOGGED_IN_BANNED:
				System.out.println(">>> Reason: User is banned.");
				break;
			case UserLogin.NOT_LOGGED_IN_WRONG_PASSWORD:
			default:
				System.out.println(">>> Reason: Wrong password.");
				break;
		}
		
	}

	public static void main(String[] args) throws UnsupportedEncodingException, FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		Mahasiswa mhsA = createDummyMahasiswa();
		UserLogin userlogin = new UserLogin(mhsA);

		System.out.println(mhsA.getName() + " login status: " + (userlogin.isLoggedIn() ? "LOGGED IN":"not logged in"));

		userlogin.setPassword("password");

		userlogin.activate("terserah");
		
		//log in
		int loginstatus = userlogin.login("password");
		System.out.println(mhsA.getName() + " login status: " + (userlogin.isLoggedIn() ? "LOGGED IN":"not logged in"));
		System.out.println(mhsA.getName() + " last login date: " + ((userlogin.getLastLoginDate() == null) ? "": userlogin.getLastLoginDate().getTime()));
		
		System.out.println("mhsA.toString(): " + mhsA);		

		System.out.println("======== SAVING TO FILE =============");
		mhsA.saveToFile("d:\\test_mhs.txt");

		System.out.println("======== LOADING FROM STRING ========");
		mhsA.loadFromFile("d:\\test_mhs.txt");
		mhsA.loadFromString("150000001#Mahasiswa ABC#true#1997/07/15#Malang#Jl. Pelan-Pelan Banyak Anak Kecil#Malang#Jawa Timur#Indonesia#null#-7.955083#112.610824#S1 Ilmu Komputer#Ilmu Komputer#Fakultas Ilmu Komputer#");

		System.out.println("=====================================");
		
		//change password
		boolean success = userlogin.changePassword("pass", "password1", "password1");
		if (success)
			System.out.println(">>> Password was successfully changed.");
		else
			System.out.println(">>> Failed to change password.");
			
		success = userlogin.changePassword("password", "password1", "password1");
		if (success)
			System.out.println(">>> Password was successfully changed.");
		else
			System.out.println(">>> Failed to change password.");
		
		//log out
		userlogin.logout();
		System.out.println(mhsA.getName() + " login status: " + (userlogin.isLoggedIn() ? "LOGGED IN":"not logged in"));
		System.out.println(mhsA.getName() + " last logout date: " + ((userlogin.getLastLogoutDate() == null)? "": userlogin.getLastLogoutDate().getTime()));

		loginstatus = userlogin.login("password1");
		System.out.println(mhsA.getName() + " login status: " + (userlogin.isLoggedIn() ? "LOGGED IN":"not logged in"));
		printLoginStatus(loginstatus);
		userlogin.logout();
		System.out.println(mhsA.getName() + " last logout date: " + ((userlogin.getLastLogoutDate() == null)? "": userlogin.getLastLogoutDate().getTime()));

		System.out.println("\n======== Try to ban user. ========");
		loginstatus = userlogin.login("password");
		System.out.println(mhsA.getName() + " login status: " + (userlogin.isLoggedIn() ? "LOGGED IN":"not logged in"));
		printLoginStatus(loginstatus);
		loginstatus = userlogin.login("password");
		System.out.println(mhsA.getName() + " login status: " + (userlogin.isLoggedIn() ? "LOGGED IN":"not logged in"));
		printLoginStatus(loginstatus);
		loginstatus = userlogin.login("password");
		System.out.println(mhsA.getName() + " login status: " + (userlogin.isLoggedIn() ? "LOGGED IN":"not logged in"));
		printLoginStatus(loginstatus);
		loginstatus = userlogin.login("password1");
		System.out.println(mhsA.getName() + " login status: " + (userlogin.isLoggedIn() ? "LOGGED IN":"not logged in"));
		printLoginStatus(loginstatus);
	}

}
