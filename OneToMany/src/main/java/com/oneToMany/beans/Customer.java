package com.oneToMany.beans;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Customer {

	@Id
	private int id;
	private String name;
	private long ac_no;
	
	

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Customer(int id, String name, long ac_no) {
		super();
		this.id = id;
		this.name = name;
		this.ac_no = ac_no;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public long getAc_no() {
		return ac_no;
	}



	public void setAc_no(long ac_no) {
		this.ac_no = ac_no;
	}

	
	
	
	
	
	
}
