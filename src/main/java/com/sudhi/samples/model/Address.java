package com.sudhi.samples.model;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

import org.eclipse.persistence.annotations.UuidGenerator;

/**
 * Entity implementation class for Entity: Address
 *
 */
@Entity
@Table(name="Address")
@IdClass(AddressPK.class)
public class Address implements Serializable {

	@UuidGenerator(name="uuid")   
	@Id
	@GeneratedValue(generator="uuid")
	private String AddressNumber;   
	@Id
	private String Id;
	private String Street1;
	private String Street2;
	private Integer HouseNumber;
	private String PostalCode;
	private String City;
	private String Country;
	private String CountryCode;
	private String EmailAddress;
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="Id", referencedColumnName="Id", updatable=false, insertable=false, nullable=false)
	private Person person;
	private static final long serialVersionUID = 1L;

	public Address() {
		super();
	}   
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
	public String getStreet1() {
		return this.Street1;
	}

	public void setStreet1(String Street1) {
		this.Street1 = Street1;
	}   
	public String getStreet2() {
		return this.Street2;
	}

	public void setStreet2(String Street2) {
		this.Street2 = Street2;
	}   
	public Integer getHouseNumber() {
		return this.HouseNumber;
	}

	public void setHouseNumber(Integer HouseNumber) {
		this.HouseNumber = HouseNumber;
	}   
	public String getPostalCode() {
		return this.PostalCode;
	}

	public void setPostalCode(String PostalCode) {
		this.PostalCode = PostalCode;
	}   
	public String getCity() {
		return this.City;
	}

	public void setCity(String City) {
		this.City = City;
	}   
	public String getCountry() {
		return this.Country;
	}

	public void setCountry(String Country) {
		this.Country = Country;
	}   
	public String getCountryCode() {
		return this.CountryCode;
	}

	public void setCountryCode(String CountryCode) {
		this.CountryCode = CountryCode;
	}   
	public String getEmailAddress() {
		return this.EmailAddress;
	}

	public void setEmailAddress(String EmailAddress) {
		this.EmailAddress = EmailAddress;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
    
}
