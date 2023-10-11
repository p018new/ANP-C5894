package com.fireplay.hiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmpData 

{
	
public static void main( String[] args)


{
System.out.println("Connection Established!!!");

Configuration cfg = new Configuration();

cfg.configure("hibernate.cfg.xml");

SessionFactory factory = cfg.buildSessionFactory();

Session session = factory.openSession();

Transaction ts = session.beginTransaction();

Employee c=new Employee();
Employee o=new Employee();
Employee m=new Employee();
c.setEmpId(1);

c.setEmpName("Grizel");

c.setEmpDesignation("Senior Associate");

c.setEmpPhoneNumber("8624751346");

c.setSalary1(652222);



o.setEmpId(2);

o.setEmpName("Samuel");

o.setEmpDesignation("H.R");

o.setEmpPhoneNumber("8644751345");

o.setSalary1(754829);



o.setEmpId(3);

o.setEmpName("Kai");

o.setEmpDesignation("C.E.O");

o.setEmpPhoneNumber("8644751345");

o.setSalary1(754829);




session.save(c);

session.save(o);

session.save(m);


ts.commit();

session.close();

System.out.println("Employee data Saved Successfully");


}
}