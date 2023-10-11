package com.hiber3.demo.daoimpl;
import java.util.List;

import java.util.Scanner;

import org.hibernate.Session;

import org.hibernate.Transaction;

import org.hibernate.query.Query;

import com.hiber3.demo.config.HiberUtil;

import com.hiber3.demo.dao.EmployeeDao;

import com.hiber3.demo.entity.Employee;


public class EmployeeDaoImpl implements EmployeeDao 

{



	Scanner sc=new Scanner(System.in);

	@Override

	public void addEmp() {

		// TODO Auto-generated method stub

		Session session=HiberUtil.getSessionFactory().openSession();

		Transaction tx = session.beginTransaction();

		

		String empName, surname, address, designation;

		int empid;

		long empPhone;

		System.out.println("Enter the Id");

		empid=sc.nextInt();

		

		System.out.println("Enter the name");

		empName=sc.next();

		

		System.out.println("Enter the Surname");

		surname=sc.next();

		

		System.out.println("Enter the address");

		address=sc.next();

		

		System.out.println("Enter the designation");

		designation=sc.next();

		

		System.out.println("Enter the Phone");

		empPhone=sc.nextLong();

//		

		Employee emp=new Employee();

		emp.setEmpid(empid);

	    emp.setEmpName(empName);

	    emp.setEmpSurname(surname);

	    emp.setEmpaddr(address);

		emp.setDesignation(designation);

		emp.setEmpPhone(empPhone);

		

		session.save(emp);

		tx.commit();

		session.close();

		System.out.println("Employee data added successfully");

		

		

	}



	@Override

	public void deleteEmp() {

		// TODO Auto-generated method stub

		Session session=HiberUtil.getSessionFactory().openSession();

		Transaction tx = session.beginTransaction();

		

		String empName, surname, address, designation;

		int empid;

		long phone;

		System.out.println("Enter the Id");

		empid=sc.nextInt();

		



		

		Employee emp = session.get(Employee.class, empid);

		emp.setEmpid(empid);

	

		//session.save(emp);

		session.delete(emp);

		tx.commit();

		session.close();

		System.out.println("Employee data deleted successfully");

		

	}



	@Override

	public void editEmp() {

		// TODO Auto-generated method stub

		Session session=HiberUtil.getSessionFactory().openSession();

		Transaction tx = session.beginTransaction();

		

		String empName, surname, address, designation;

		int empid;

		long phone;

		

		System.out.println("Enter the Id");

		empid=sc.nextInt();

		

		

		



		

		Employee emp = session.get(Employee.class, empid);

		if (emp != null) {

	        // Allow the user to modify employee information

			System.out.println("Enter the name");

			empName=sc.next();

	        emp.setEmpName(empName);

		    

	        

	        System.out.println("Enter the address");

			address=sc.next();

			  emp.setEmpaddr(address);

	

		//session.save(emp);

		session.update(emp);

		tx.commit();

		System.out.println("Employee data uodated successfully");

	}

		session.close();

		//System.out.println("Employee data uodated successfully");

	}



	@Override

	public void displayEmp() {

		// TODO Auto-generated method stub

		Session session=HiberUtil.getSessionFactory().openSession();

		Transaction tx = session.beginTransaction();

		String hql = "FROM Employee";

		Query<Employee> query = session.createQuery(hql, Employee.class);

		List<Employee> resultList = query.getResultList();

		for (Employee entity : resultList) {

			System.out.println("empid " + entity.getEmpid());

			System.out.println("FirstName " + entity.getEmpName());

			System.out.println("empSurname " + entity.getEmpSurname());

			System.out.println("designation " + entity.getDesignation());

			System.out.println("empPhone " + entity.getEmpPhone());

			System.out.println("empaddr " + entity.getEmpaddr());

		}

	



	}



	

   

}

