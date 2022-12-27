package com.masai.app.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "collage")
public class Collage {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int collageId;
	private String collageName;
	private String collageAddress;
	
	
	@OneToMany(mappedBy = "collage",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private List<Student> students=new ArrayList<Student>();


	public int getCollageId() {
		return collageId;
	}


	public void setCollageId(int collageId) {
		this.collageId = collageId;
	}


	public String getCollageName() {
		return collageName;
	}


	public void setCollageName(String collageName) {
		this.collageName = collageName;
	}


	public String getCollageAddress() {
		return collageAddress;
	}


	public void setCollageAddress(String collageAddress) {
		this.collageAddress = collageAddress;
	}


	public List<Student> getStudents() {
		return students;
	}


	public void setStudents(List<Student> students) {
		this.students = students;
	}


	


	public Collage(int collageId, String collageName, String collageAddress, List<Student> students) {
		super();
		this.collageId = collageId;
		this.collageName = collageName;
		this.collageAddress = collageAddress;
		this.students = students;
	}


	public Collage() {
	
		
	}
	
	
	
	
	
	
}
