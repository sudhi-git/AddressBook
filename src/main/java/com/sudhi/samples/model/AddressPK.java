package com.sudhi.samples.model;

import java.io.Serializable;
import java.lang.String;

/**
 * ID class for entity: Address
 *
 */ 
public class AddressPK  implements Serializable {   
   
	         
	private String AddressNumber;         
	private String Id;
	private static final long serialVersionUID = 1L;

	public AddressPK() {}

	

	public String getAddressNumber() {
		return this.AddressNumber;
	}

	public void setAddressNumber(String AddressNumber) {
		this.AddressNumber = AddressNumber;
	}
	

	public String getId() {
		return this.Id;
	}

	public void setId(String Id) {
		this.Id = Id;
	}
	
   
	/*
	 * @see java.lang.Object#equals(Object)
	 */	
	public boolean equals(Object o) {
		if (o == this) {
			return true;
		}
		if (!(o instanceof AddressPK)) {
			return false;
		}
		AddressPK other = (AddressPK) o;
		return true
			&& (getAddressNumber() == null ? other.getAddressNumber() == null : getAddressNumber().equals(other.getAddressNumber()))
			&& (getId() == null ? other.getId() == null : getId().equals(other.getId()));
	}
	
	/*	 
	 * @see java.lang.Object#hashCode()
	 */	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (getAddressNumber() == null ? 0 : getAddressNumber().hashCode());
		result = prime * result + (getId() == null ? 0 : getId().hashCode());
		return result;
	}
   
   
}
