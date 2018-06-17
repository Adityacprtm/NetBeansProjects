package Siakad;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author Hikaru Yuuki
 * @version 1.0
 * @created 13-Mar-2016 4:41:05 PM
 */
public class Mahasiswa {

	private Address address;
	private Calendar birthDate;
	private String birthPlace;
	private String department;
	private int entryYear;
	private String faculty;
	private int id;
	private String name;
	private String NIM;
	private boolean sex;
	private String studyProgram;

	public Mahasiswa(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param NIM
	 * @param name
	 * @param entryYear
	 */
	public Mahasiswa(String NIM, String name, int entryYear){
		clearField();
		this.NIM = NIM;
		this.name = name;
		this.entryYear = entryYear;
	}

	public void clearField(){
		this.NIM = "";
		this.name = "";
		this.faculty = "";
		this.department = "";
		this.studyProgram = "";
		this.entryYear = Calendar.getInstance().get(Calendar.YEAR);
		this.birthPlace = "";
		this.sex = true; //default to Male
	}

	public Address getAddress(){
		return this.address;
	}

	public Calendar getBirthDate(){
		return this.birthDate;
	}

	public String getBirthPlace(){
		return this.birthPlace;
	}

	public String getDepartment(){
		return this.department;
	}

	public int getEntryYear(){
		return this.entryYear;
	}

	public String getFaculty(){
		return this.getFaculty();
	}

	public int getId(){
		return this.id;
	}

	public String getName(){
		return this.name;
	}

	public String getNIM(){
		return this.NIM;
	}

	public boolean getSex(){
		return this.sex;
	}

	public String getStudyProgram(){
		return this.studyProgram;
	}

	/**
	 * 
	 * @param filename
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 * @throws UnsupportedEncodingException 
	 */
	public void loadFromFile(String filename) throws FileNotFoundException, IOException{
		try(BufferedReader br = new BufferedReader(new FileReader(filename))) {
		    String line = br.readLine();
	    	this.loadFromString(line);
		}	
	}

	/**
	 * 
	 * @param s
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public void loadFromString(String s) {
		String[] fields = s.split("#");
	   	 
		/*
		 * 
		 * this.NIM, this.name, String.valueOf(this.sex), 
				this.birthDate.toString(), this.birthPlace, 
				this.address.getStreet(),this.address.getCity(),this.address.getRegion(),this.address.getCountry(),
				this.address.getPoBox(),this.address.getGpsLatitude(), this.address.getGpsLongitude()),
				this.studyProgram, this.department, this.faculty;
				
		 */

		this.NIM = fields[0];
		this.name = fields[1];
		this.sex = Boolean.parseBoolean(fields[2]);

		SimpleDateFormat format1 = new SimpleDateFormat("yyyy/MM/dd");

		try {
			this.birthDate.setTime(format1.parse(fields[3]));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		this.birthPlace = fields[4];
		this.address.setStreet(fields[5]);
		this.address.setCity(fields[6]);
		this.address.setRegion(fields[7]);
		this.address.setCountry(fields[8]);
		this.address.setPoBox(fields[9]);
		this.address.setGpsLatitude(Double.parseDouble(fields[10]));
		this.address.setGpsLongitude(Double.parseDouble(fields[11]));
		
		this.studyProgram = fields[12];
		this.department = fields[13];
		this.faculty = fields[14];
	}

	/**
	 * 
	 * @param filename
	 */
	public void saveToFile(String filename) throws UnsupportedEncodingException, FileNotFoundException, IOException{
		try (Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filename), "utf-8"))) 
		{
			writer.write(this.toString());
		}

	}

	/**
	 * 
	 * @param address
	 */
	public void setAddress(Address address){
		this.address = address;
	}

	/**
	 * 
	 * @param birthDate
	 */
	public void setBirthDate(Calendar birthDate){
		this.birthDate = birthDate;
	}

	/**
	 * 
	 * @param birthPlace
	 */
	public void setBirthPlace(String birthPlace){
		this.birthPlace = birthPlace;
	}

	/**
	 * 
	 * @param department
	 */
	public void setDepartment(String department){
		this.department = department;
	}

	/**
	 * 
	 * @param year
	 */
	public void setEntryYear(int year){
		this.entryYear = year;
	}

	/**
	 * 
	 * @param faculty
	 */
	public void setFaculty(String faculty){
		this.faculty = faculty;
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
	 * @param name
	 */
	public void setName(String name){
		this.name = name;
	}

	/**
	 * 
	 * @param nim
	 */
	public void setNIM(String nim){
		this.NIM = nim;
	}

	/**
	 * 
	 * @param sex
	 */
	public void setSex(boolean sex){
		this.sex = sex;
	}

	/**
	 * 
	 * @param studyProgram
	 */
	public void setStudyProgram(String studyProgram){
		this.studyProgram = studyProgram;
	}

	public String toString(){
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy/MM/dd");
		String formatted = format1.format(this.birthDate.getTime());
		String s = String.format("%s#%s#%s#%s#%s#%s#%s#%s#%s#%s#%s#%s#%s#%s#%s#", 
				this.NIM, this.name, String.valueOf(this.sex), 
				formatted, this.birthPlace, 
				this.address.getStreet(),this.address.getCity(),this.address.getRegion(),this.address.getCountry(),
				this.address.getPoBox(),this.address.getGpsLatitude(), this.address.getGpsLongitude(),
				this.studyProgram, this.department, this.faculty);
		return s;
	}

}