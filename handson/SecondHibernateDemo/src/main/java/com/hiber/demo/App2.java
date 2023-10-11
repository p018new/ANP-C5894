package com.hiber.demo;
import java.util.HashSet;
import org.hibernate.Session;

import org.hibernate.SessionFactory;

import org.hibernate.Transaction;

import org.hibernate.cfg.Configuration;





public class App2

{

	 public static void main( String[] args ) {

		 Configuration cfg=new Configuration(); 

		// cfg.configure("hibernate2.cfg.xml");

		 cfg.configure("hibernate1.cfg.xml");

			

		  SessionFactory factory=cfg.buildSessionFactory(); 

		  Session session=factory.openSession(); 

		  Transaction tx=session.beginTransaction();

		

       

       

       Department d1=new Department();

       d1.setdId(1);

       d1.setdName("SAP");

       

       Employee1 e1=new Employee1();

       e1.seteId(1);

       e1.setEname("Prasanna");

       e1.setDepartment(d1);

       

       Employee1 e2=new Employee1();

       e2.seteId(2);

       e2.setEname("Pooja");

       e2.setDepartment(d1);

       

       

     

       

       HashSet<Employee1> employee2set=new HashSet<Employee1>();

       employee2set.add(e1);

       employee2set.add(e2);

       session.save(e1);

       session.save(e2);

       

       

       d1.setEmployee(employee2set);

       

       session.save(d1);

       

       tx.commit();

       session.close();

       System.out.println("Data store sucessfully");





	 }

}


