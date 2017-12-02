package com.sudhi.samples.model;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

import org.eclipse.persistence.annotations.UuidGenerator;

/**
 * Entity implementation class for Entity: Person
 *
 */
@Entity
@Table(name="Person")
public class Person implements Serializable {

	@UuidGenerator(name="uuid")   
	@Id
	@GeneratedValue(generator="uuid")
	private String Id;
	private String FName;
	private String LName;
	private String MName;
	@OneToMany(fetch=FetchType.EAGER, cascade=CascadeType.ALL, orphanRemoval=true, mappedBy="person")
	private List<Address> address;
	private static final long serialVersionUID = 1L;

	public Person() {
		super();
	}   
	public String getId() {
		return this.Id;
	}

	public void setId(String Id) {
		this.Id = Id;
	}   
	public String getFName() {
		return this.FName;
	}

	public void setFName(String FName) {
		this.FName = FName;
	}   
	public String getLName() {
		return this.LName;
	}

	public void setLName(String LName) {
		this.LName = LName;
	}   
	public String getMName() {
		return this.MName;
	}

	public void setMName(String MName) {
		this.MName = MName;
	}
	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}
    
}
