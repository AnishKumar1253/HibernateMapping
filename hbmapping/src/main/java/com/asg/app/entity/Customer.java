package com.asg.app.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.CascadeType;
import javax.persistence.ManyToMany;

@Entity
public class Customer
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cid;
	private String cname;
	private String mobile;
	private String email;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Address> adds=new ArrayList<Address>();
	
	public Customer() {}

	public Customer(int cid, String cname, String mobile, String email, List<Address> adds) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.mobile = mobile;
		this.email = email;
		this.adds = adds;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Address> getAdds() {
		return adds;
	}

	public void setAdds(List<Address> adds) {
		this.adds = adds;
	}

	@Override
	public int hashCode() {
		return Objects.hash(adds, cid, cname, email, mobile);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(adds, other.adds) && cid == other.cid && Objects.equals(cname, other.cname)
				&& Objects.equals(email, other.email) && mobile == other.mobile;
	}

	
	
	
}