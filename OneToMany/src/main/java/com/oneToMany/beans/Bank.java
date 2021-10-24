package com.oneToMany.beans;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Bank {

	@Id
	private int ifsc;
	private String name;
	private String branch;
	
	@OneToMany
	private List<Customer> customer=new ArrayList<Customer>();
	
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bank(int ifsc, String name, String branch, List<Customer> customer) {
		super();
		this.ifsc = ifsc;
		this.name = name;
		this.branch = branch;
		this.customer = customer;
	}

	public int getIfsc() {
		return ifsc;
	}

	public void setIfsc(int ifsc) {
		this.ifsc = ifsc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public List<Customer> getCustomer() {
		return customer;
	}

	public void setCustomer(List<Customer> customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Bank [ifsc=" + ifsc + ", name=" + name + ", branch=" + branch + ", customer=" + customer + "]";
	}
	
	
	
	
	
}
