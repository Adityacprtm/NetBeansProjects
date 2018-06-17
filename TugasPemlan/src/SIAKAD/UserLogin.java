package Siakad;

import java.util.Calendar;

/**
 * @author Hikaru Yuuki
 * @version 1.0
 * @created 13-Mar-2016 4:26:19 PM
 */
public class UserLogin {

	private boolean banned;
	private int id;
	private Calendar lastLoginDate;
	private Calendar lastLogoutDate;
	private String lastPassword;
	private int lastWrongPasswordCount;
	private Calendar lastWrongPasswordDate;
	private boolean loggedIn;
	private Mahasiswa mahasiswa;
	private String password;
	private boolean activated;
	
	public static final int LOGGED_ID = 1000;
	public static final int LOGGED_ID_ALREADY = 1001;
	public static final int NOT_LOGGED_IN_WRONG_PASSWORD = 2000;
	public static final int NOT_LOGGED_IN_NOT_ACTIVATED = 2002;
	public static final int NOT_LOGGED_IN_BANNED = 2001;
	
	
	public UserLogin(){
		this.lastWrongPasswordCount = 0;
		this.banned = false;
		this.activated = false;
	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param mhs
	 */
	public UserLogin(Mahasiswa mhs){
		this.mahasiswa = mhs;
		this.lastWrongPasswordCount = 0;
		this.banned = false;
		this.activated = false;
	}

	/**
	 * 
	 * @param mhs
	 * @param password
	 */
	public UserLogin(Mahasiswa mhs, String password){
		this.mahasiswa = mhs;
		this.password = password;
		this.banned = false;
		this.activated = false;
	}

	/**
	 * 
	 * @param oldPassword
	 * @param newPassword
	 * @param newConfirmPassword
	 */
	public boolean changePassword(String oldPassword, String newPassword, String newConfirmPassword){
		if (this.isLoggedIn()){
			if (oldPassword.equals(this.password))
			{
				if (newPassword.equals(newConfirmPassword))
				{
					this.password = newPassword;
					return true;
				}
			}
		}
		
		return false;
	}

	public int getId(){
		return this.id;
	}

	public boolean isActivated()
	{
		return this.activated;
	}
	
	public boolean getActivated()
	{
		return this.activated;
	}
	
	public Calendar getLastLoginDate(){
		return this.lastLoginDate;
	}

	public Calendar getLastLogoutDate(){
		return this.lastLogoutDate;
	}

	public String getLastPassword(){
		return this.lastPassword;
	}

	public int getLastWrongPasswordCount(){
		return this.lastWrongPasswordCount;
	}

	public Calendar getLastWrongPasswordDate(){
		return this.getLastWrongPasswordDate();
	}

	public String getPassword(){
		return this.password;
	}

	public boolean isBanned(){
		return this.banned;
	}

	public boolean isLoggedIn(){
		return this.loggedIn;
	}
	/**
	 * 
	 * @param password
	 */
	public int login(String password){
		if (this.password.equals(password)){
			if (this.isActivated()){
				if (!this.loggedIn)
				{
					if (this.isBanned())
					{
						return UserLogin.NOT_LOGGED_IN_BANNED;
					}
					this.lastLoginDate = Calendar.getInstance();
					this.loggedIn = true;
					return UserLogin.LOGGED_ID; 
				}
				else
					return UserLogin.LOGGED_ID_ALREADY; 
			}
			else 
			{
				return UserLogin.NOT_LOGGED_IN_NOT_ACTIVATED; ///not activated
			}
				
				
		}
		else{
			if (this.isActivated()){
				this.lastWrongPasswordDate = Calendar.getInstance();
				this.lastWrongPasswordCount++;
				if (this.lastWrongPasswordCount >= 3)
				{
					this.banned = true;
				}
				this.loggedIn = false;
				if (this.isBanned())
				{
					return UserLogin.NOT_LOGGED_IN_BANNED;
				}
				else
					return UserLogin.NOT_LOGGED_IN_WRONG_PASSWORD;
			}
			else 
			{
				return UserLogin.NOT_LOGGED_IN_NOT_ACTIVATED; ///not activated
			}
		}
	}
	public void activate(String code){
		this.activated = true;
	}
	public void logout(){
		if (this.isLoggedIn()){
			this.lastLogoutDate = Calendar.getInstance();
			this.loggedIn = false;
		}
	}

	/**
	 * 
	 * @param id
	 */
	public void setId(int id){
		this.id = id;
	}

	/**
	 * 
	 * @param password
	 */
	public void setPassword(String password){
		this.password = password;
	}

}