package com.hiber.demo;

import java.util.HashSet;



import org.hibernate.Session;

import org.hibernate.SessionFactory;

import org.hibernate.Transaction;

import org.hibernate.cfg.Configuration;



/**

 * Hello world!

 *

 */

public class App 

{

	 public static void main( String[] args ) {

		 Configuration cfg=new Configuration(); cfg.configure("hibernate1.cfg.xml");

			

		  SessionFactory factory=cfg.buildSessionFactory(); Session

		session=factory.openSession(); Transaction tx=session.beginTransaction();

		

       

       

       Parent p1=new Parent();

       p1.setpId(1);

       p1.setpName("Amitabh");

       

       Childs ch1=new Childs();

       ch1.setcId(1);

       ch1.setcName("Abhishek");

       ch1.setParent(p1);

       

       Childs ch2=new Childs();

       ch2.setcId(2);

       ch2.setcName("sakshi");

       ch2.setParent(p1);

       

       HashSet<Childs> childset=new HashSet<Childs>();

       childset.add(ch1);

       childset.add(ch2);

       session.save(ch1);

       session.save(ch2);

       

       

       p1.setChild(childset);

       

       session.save(p1);

       

       tx.commit();

       session.close();

       System.out.println("Data store ho gaya");





	 }

}