package com.oneToMany.test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.oneToMany.beans.Bank;
import com.oneToMany.beans.Customer;

public class save {

	public static void main(String[] args) {
		
		
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		session.beginTransaction();
		
		Customer sourabh=new Customer(1, "sourabh gorule", 767211);
		Customer manoj=new Customer(2, "manoj ilake", 766211);
		
		List<Customer> customers=new ArrayList<Customer>();
		
		customers.add(sourabh);
		customers.add(manoj);
		
		Bank bank = new Bank(1244, "BOI", "Uttur", customers);
		
		
		session.save(sourabh);
		session.save(manoj);
		
		session.save(bank);
		
		session.getTransaction().commit();
		session.close();
		
		
		
	}
	
}
