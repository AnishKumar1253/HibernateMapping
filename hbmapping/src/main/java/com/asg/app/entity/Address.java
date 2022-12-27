package com.asg.app.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Address
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int a_id;
	private String state;
	private String city;
	private int pincode;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Customer> cust=new ArrayList<Customer>();
	
	public Address() {}

	public Address(int a_id, String state, String city, int pincode, List<Customer> cust) {
		super();
		this.a_id = a_id;
		this.state = state;
		this.city = city;
		this.pincode = pincode;
		this.cust = cust;
	}

	public int getA_id() {
		return a_id;
	}

	public void setA_id(int a_id) {
		this.a_id = a_id;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public List<Customer> getCust() {
		return cust;
	}

	public void setCust(List<Customer> cust) {
		this.cust = cust;
	}

	@Override
	public int hashCode() {
		return Objects.hash(a_id, city, cust, pincode, state);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		return a_id == other.a_id && Objects.equals(city, other.city) && Objects.equals(cust, other.cust)
				&& pincode == other.pincode && Objects.equals(state, other.state);
	}

	
	
	
	
	
}