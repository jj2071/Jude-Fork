package com.incture.ictm.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
	
	@Id
	private String empID;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "email_id")
	private String email_ID;
	
	@Column(name = "alligned_to")
	private String proj_manager;
	
	@Column(name = "password")
	private String password;

	public String getEmpID() {
		return empID;
	}

	public void setEmpID(String empID) {
		this.empID = empID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail_ID() {
		return email_ID;
	}

	public void setEmail_ID(String email_ID) {
		this.email_ID = email_ID;
	}

	public String getProj_manager() {
		return proj_manager;
	}

	public void setProj_manager(String proj_manager) {
		this.proj_manager = proj_manager;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
