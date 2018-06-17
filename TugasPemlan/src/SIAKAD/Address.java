package Siakad;

/**
 * @author Hikaru Yuuki
 * @version 1.0
 * @created 13-Mar-2016 4:39:40 PM
 */
public class Address {

	private String city;
	private String country;
	private double gpsLatitude;
	private double gpsLongitude;
	private int id;
	private String poBox;
	private String region;
	private String street;

	public Address(){

	}

	/**
	 * 
	 * @param street
	 * @param city
	 * @param region    country
	 * @param country
	 */
	public Address(String street, String city, String region, String country){
		this.street = street;
		this.city = city;
		this.region = region;
		this.country = country;
	}

	/**
	 * 
	 * @param latitude
	 * @param longitude    longitude
	 */
	public Address(double latitude, double longitude){
		this.gpsLatitude = latitude;
		this.gpsLongitude = longitude;
	}

	/**
	 * 
	 * @exception Throwable
	 */
	public void finalize()
	  throws Throwable{

	}

	public String getCity(){
		return this.city;
	}

	public String getCountry(){
		return this.country;
	}

	public double getGpsLatitude(){
		return this.gpsLatitude;
	}

	public double getGpsLongitude(){
		return this.gpsLongitude;
	}

	public int getId(){
		return this.id;
	}

	public String getPoBox(){
		return this.poBox;
	}

	public String getRegion(){
		return this.region;
	}

	public String getStreet(){
		return this.street;
	}

	/**
	 * 
	 * @param city    city
	 */
	public void setCity(String city){
		this.city = city;
	}

	/**
	 * 
	 * @param country    country
	 */
	public void setCountry(String country){
		this.country = country;
	}

	/**
	 * 
	 * @param latitude    latitude
	 */
	public void setGpsLatitude(double latitude){
		this.gpsLatitude = latitude;
	}

	/**
	 * 
	 * @param longitude    longitude
	 */
	public void setGpsLongitude(double longitude){
		this.gpsLongitude = longitude;
	}

	/**
	 * 
	 * @param poBox    poBox
	 */
	public void setPoBox(String poBox){
		this.poBox = poBox;
	}

	/**
	 * 
	 * @param region    region
	 */
	public void setRegion(String region){
		this.region = region;
	}

	/**
	 * 
	 * @param street    street
	 */
	public void setStreet(String street){
		this.street = street;
	}

}