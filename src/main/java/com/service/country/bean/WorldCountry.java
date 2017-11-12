package com.service.country.bean;

public class WorldCountry {
	
	private String CountryName;
	private String CapitalName;
	private String CapitalLatitude;
	private String CapitalLongitude;
	private String CountryCode;
	private String ContinentName;
	
	
	
	public String getCountryName() {
		return CountryName;
	}



	public void setCountryName(String countryName) {
		CountryName = countryName;
	}



	public String getCapitalName() {
		return CapitalName;
	}



	public void setCapitalName(String capitalName) {
		CapitalName = capitalName;
	}



	public String getCapitalLatitude() {
		return CapitalLatitude;
	}



	public void setCapitalLatitude(String capitalLatitude) {
		CapitalLatitude = capitalLatitude;
	}



	public String getCapitalLongitude() {
		return CapitalLongitude;
	}



	public void setCapitalLongitude(String capitalLongitude) {
		CapitalLongitude = capitalLongitude;
	}



	public String getCountryCode() {
		return CountryCode;
	}



	public void setCountryCode(String countryCode) {
		CountryCode = countryCode;
	}



	public String getContinentName() {
		return ContinentName;
	}



	public void setContinentName(String continentName) {
		ContinentName = continentName;
	}



	public String toString () {
		 return "country: '" + getCountryName() + "', capital: '" + getCapitalName() + "', latitude: '" + getCapitalLatitude() + "', longitude: '"+ getCapitalLongitude() + "', code: '"+ getCountryCode()  + "', continent: '"+ getContinentName();
	}

}
