package com.example.airports.model;
// "fs": "HTY",
// "iata": "HTY",
// "icao": "LTDA",
// "name": "Hatay Airport",
// "street1": "31000",
// "city": "Antakya",
// "countryCode": "TR",
// "countryName": "Turkey",
// "regionName": "Europe",
// "timeZoneRegionName": "Europe/Istanbul",
// "localTime": "2015-01-06T10:05:07.018",
// "utcOffsetHours": 2,
// "latitude": 36.364544,
// "longitude": 36.28057,
// "elevationFeet": 250,
// "classification": 4,
// "active": true,
// "delayIndexUrl": "https://api.flightstats.com/flex/delayindex/rest/v1/json/airports/HTY?codeType=fs",
// "weatherUrl": "https://api.flightstats.com/flex/weather/rest/v1/json/all/HTY?codeType=fs"

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "airports")
public class Airport {
	
	//@Id
	private String _id;

	private String fs;

	private String iata;

	private String icao;

	private String faa;

	private String name;

	private String street1;

	private String city;

	private String cityCode;

	private String stateCode;

	private String postalCode;

	private String countryName;

	private String regionName;

	private String timeZoneRegionName;

	private String localTime;

	private int utcOffsetHours;

	private int latitude;

	private int longitude;

	private int elevationFeet;

	private int classification;

	private boolean active;

	private String delayIndexUrl;

	private String weatherUrl;

	public Airport(String _id, String fs, String iata, String icao, String faa, String name, String street1,
			String city, String cityCode, String stateCode, String postalCode, String countryName,
			String regionName, String timeZoneRegionName, String localTime, int utcOffsetHours,
			int latitude, int longitude, int elevationFeet, int classification, boolean active,
			String delayIndexUrl, String weatherUrl) {
		this._id = _id;
		this.fs = fs;
		this.iata = iata;
		this.icao = icao;
		this.faa = faa;
		this.name = name;
		this.street1 = street1;
		this.city = city;
		this.cityCode = cityCode;
		this.stateCode = stateCode;
		this.postalCode = postalCode;
		this.countryName = countryName;
		this.regionName = regionName;
		this.timeZoneRegionName = timeZoneRegionName;
		this.localTime = localTime;
		this.utcOffsetHours = utcOffsetHours;
		this.latitude = latitude;
		this.longitude = longitude;
		this.elevationFeet = elevationFeet;
		this.classification = classification;
		this.active = active;
		this.delayIndexUrl = delayIndexUrl;
		this.weatherUrl = weatherUrl;
	}

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getFs() {
		return fs;
	}

	public void setFs(String fs) {
		this.fs = fs;
	}

	public String getIata() {
		return iata;
	}

	public void setIata(String iata) {
		this.iata = iata;
	}

	public String getIcao() {
		return icao;
	}

	public void setIcao(String icao) {
		this.icao = icao;
	}

	public String getFaa() {
		return faa;
	}

	public void setFaa(String faa) {
		this.faa = faa;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStreet1() {
		return street1;
	}

	public void setStreet1(String street1) {
		this.street1 = street1;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCityCode() {
		return cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getStateCode() {
		return stateCode;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	public String getTimeZoneRegionName() {
		return timeZoneRegionName;
	}

	public void setTimeZoneRegionName(String timeZoneRegionName) {
		this.timeZoneRegionName = timeZoneRegionName;
	}

	public String getLocalTime() {
		return localTime;
	}

	public void setLocalTime(String localTime) {
		this.localTime = localTime;
	}

	public int getUtcOffsetHours() {
		return utcOffsetHours;
	}

	public void setUtcOffsetHours(int utcOffsetHours) {
		this.utcOffsetHours = utcOffsetHours;
	}

	public int getLatitude() {
		return latitude;
	}

	public void setLatitude(int latitude) {
		this.latitude = latitude;
	}

	public int getLongitude() {
		return longitude;
	}

	public void setLongitude(int longitude) {
		this.longitude = longitude;
	}

	public int getElevationFeet() {
		return elevationFeet;
	}

	public void setElevationFeet(int elevationFeet) {
		this.elevationFeet = elevationFeet;
	}

	public int getClassification() {
		return classification;
	}

	public void setClassification(int classification) {
		this.classification = classification;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getDelayIndexUrl() {
		return delayIndexUrl;
	}

	public void setDelayIndexUrl(String delayIndexUrl) {
		this.delayIndexUrl = delayIndexUrl;
	}

	public String getWeatherUrl() {
		return weatherUrl;
	}

	public void setWeatherUrl(String weatherUrl) {
		this.weatherUrl = weatherUrl;
	}


	

}
