package com.fireplay.hiber;

import org.hibernate.Session;

import org.hibernate.SessionFactory;

import org.hibernate.Transaction;

import org.hibernate.cfg.Configuration;



public class StudentData

{

	public static void main( String[] args )

    {

    	System.out.println("Connection Started..");

        Configuration cfg = new Configuration();

        cfg.configure("hibernate.cfg.xml");

        

        SessionFactory factory = cfg.buildSessionFactory();

        Session session = factory.openSession();

        Transaction ts = session.beginTransaction();

        Student p=new Student();
        Student a=new Student();
        Student r=new Student();
        a.setStdId(1);

        a.setStdName("Prasanna");

        a.setStdDegree("B.E.");

        a.setStdGender("M");

        a.setStdPhoneNumber(78998976);

        

        p.setStdId(2);

        p.setStdName("Pooja");

        p.setStdDegree("B.E.");

        p.setStdGender("F");

        p.setStdPhoneNumber(627848454);
        
        r.setStdId(3);

        r.setStdName("Aishwarya");

        r.setStdDegree("B.E.");

        r.setStdGender("F");

        r.setStdPhoneNumber(746577594);

        

        

        session.save(a);

    	session.save(p);

        ts.commit();

        session.close();

        System.out.println("Student data Saved Successfully");





    }

}


