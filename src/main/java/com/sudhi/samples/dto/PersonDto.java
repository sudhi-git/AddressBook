package com.sudhi.samples.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PersonDto {
	@JsonProperty("FName")
	private String FName;
	@JsonProperty("MName")
	private String MName;
	@JsonProperty("LName")
	private String LName;
	@JsonProperty("Address")
	private List<AddressDto> Address;
	public String getFName() {
		return FName;
	}
	public void setFName(String fName) {
		FName = fName;
	}
	public String getMName() {
		return MName;
	}
	public void setMName(String mName) {
		MName = mName;
	}
	public String getLName() {
		return LName;
	}
	public void setLName(String lName) {
		LName = lName;
	}
	public List<AddressDto> getAddress() {
		return Address;
	}
	public void setAddress(List<AddressDto> address) {
		this.Address = address;
	}

}
