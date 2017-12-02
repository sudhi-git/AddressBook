package com.sudhi.samples.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AddressDto {
	@JsonProperty("Street1")
	private String Street1;
	@JsonProperty("Street2")
	private String Street2;
	@JsonProperty("HouseNumber")
	private Integer HouseNumber;
	@JsonProperty("PostalCode")
	private String PostalCode;
	@JsonProperty("City")
	private String City;
	@JsonProperty("Country")
	private String Country;
	@JsonProperty("EmailAddress")
	private String EmailAddress;
	@JsonProperty("CountryCode")
	private String CountryCode;
	public String getStreet1() {
		return Street1;
	}
	public void setStreet1(String street1) {
		Street1 = street1;
	}
	public String getStreet2() {
		return Street2;
	}
	public void setStreet2(String street2) {
		Street2 = street2;
	}
	public Integer getHouseNumber() {
		return HouseNumber;
	}
	public void setHouseNumber(Integer houseNumber) {
		this.HouseNumber = houseNumber;
	}
	public String getPostalCode() {
		return PostalCode;
	}
	public void setPostalCode(String postalCode) {
		this.PostalCode = postalCode;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		this.City = city;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		this.Country = country;
	}
	public String getEmailAddress() {
		return EmailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.EmailAddress = emailAddress;
	}
	public String getCountryCode() {
		return CountryCode;
	}
	public void setCountryCode(String countryCode) {
		this.CountryCode = countryCode;
	}
}
