package com.service.country.bean;

public class WorldCountry {
	
	private String countryName;
	private String capitalName;
	private String capitalLatitude;
	private String capitalLongitude;
	private String countryCode;
	private String continentName;
	
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getCapitalName() {
		return capitalName;
	}
	public void setCapitalName(String capitalName) {
		this.capitalName = capitalName;
	}
	public String getCapitalLatitude() {
		return capitalLatitude;
	}
	public void setCapitalLatitude(String capitalLatitude) {
		this.capitalLatitude = capitalLatitude;
	}
	public String getCapitalLongitude() {
		return capitalLongitude;
	}
	public void setCapitalLongitude(String capitalLongitude) {
		this.capitalLongitude = capitalLongitude;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getContinentName() {
		return continentName;
	}
	public void setContinentName(String continentName) {
		this.continentName = continentName;
	}
	
	public String toString () {
		 return "country: '" + getCountryName() + "', capital: '" + getCapitalName() + "', latitude: '" + getCapitalLatitude() + "', longitude: '"+ getCapitalLongitude() + "', code: '"+ getCountryCode()  + "', continent: '"+ getContinentName();
	}

}
