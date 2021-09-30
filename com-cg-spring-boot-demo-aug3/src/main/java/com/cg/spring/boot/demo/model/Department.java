package com.cg.spring.boot.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "departments")

public class Department {

	@Id
	@Column(name = "department_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int did;
	@Column(name = "department_name")
	private String dname;
	@Column(name = "city")
	private String city;

	public Department(int did, String dname, String city) {
		super();
		this.did = did;
		this.dname = dname;
		this.city = city;
	}

	public Department() {
		super();
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	// set validations above and create suitable constructors, getters, setters etc
	// below

}
