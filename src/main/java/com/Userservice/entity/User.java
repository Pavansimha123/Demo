package com.Userservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userid;
	private String firstname;
	private String lastname;
	private Long Departmentid;
	public User() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	public User( String firstname, String lastname, Long departmentid) {
		super();
		
		this.firstname = firstname;
		this.lastname = lastname;
		this.Departmentid = departmentid;
	}
	public Long getUserid() {
		return userid;
	}
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Long getDepartmentid() {
		return Departmentid;
	}
	public void setDepartmentid(Long departmentid) {
		this.Departmentid = departmentid;
	}
	
	
}
