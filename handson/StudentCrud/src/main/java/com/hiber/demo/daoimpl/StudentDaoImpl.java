package com.hiber4.demo.daoimpl;
import java.util.List;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.sql.Date;
import org.hibernate.query.Query;


import com.hiber4.demo.config.HiberUtil;
import com.hiber4.demo.dao.StudentDao;
import com.hiber4.demo.entity.Student;
public class StudentDaoImpl implements StudentDao 
{
	Scanner sc=new Scanner(System.in);
	@Override
	public void addStd() {
		// TODO Auto-generated method stub
		Session session=HiberUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
        
        int stdid;
        String stdname, stdsurname, stdgender, stdemail, dob;
        long stdphone;
        
        System.out.println("Enter the Id");
		stdid=sc.nextInt();
		
		System.out.println("Enter the name");
		stdname=sc.next();
		
		System.out.println("Enter the Surname");
		stdsurname=sc.next();
		
		System.out.println("Enter a date (yyyy-MM-dd): ");
		 dob = sc.next();
		 
		System.out.println("Enter the gender");
		stdgender=sc.next();
		
		System.out.println("Enter the mail Id");
		stdemail=sc.next();
		
		System.out.println("Enter the Phone");
		stdphone=sc.nextLong();
//		
		Student std=new Student();
		std.setStdid(stdid);
	    std.setStdname(stdname);
	    std.setStdsurname(stdsurname);
	    std.setDob(dob);
		std.setStdgender(stdgender);
		std.setStdemail(stdemail);
		std.setStdphone(stdphone);
		
		session.save(std);
		tx.commit();
		session.close();
		System.out.println("Student data added successfully");
		
	}

	@Override
	public void deleteStd() {
		// TODO Auto-generated method stub
		Session session=HiberUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		
		   int stdid;
	        String stdname, stdsurname, stdgender, stdemail, dob;
	        long stdphone;
	        
	        System.out.println("Enter the Id");
			stdid=sc.nextInt();
		
		

		
			Student std=  session.get(Student.class, stdid);
			std.setStdid(stdid);
	
		//session.save(emp);
		session.delete(std);
		tx.commit();
		session.close();
		System.out.println("Student data deleted successfully");
	}

	@Override
	public void editStd() {
		// TODO Auto-generated method stub
		Session session=HiberUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		
		   int stdid;
	        String stdname, stdsurname, stdgender, stdemail, dob;
	        long stdphone;
	        
	        System.out.println("Enter the Id");
			stdid=sc.nextInt();
		    Student std=  session.get(Student.class, stdid);
		    System.out.println("1. Name 2. Surname 3. DOB 4. Gender 5. mailId 6. PhoneNo 7.exit");
			System.out.println("Enter your choice");
			int p=sc.nextInt();
			switch(p) {
			case 1:
			{
				System.out.println("Enter the name");
				stdname=sc.next();
				 std.setStdname(stdname);
		        session.update(std);
				tx.commit();
				System.out.println("Student data updated successfully");
				break;
			}
			case 2:
			{
				System.out.println("Enter the Surname");
				stdsurname=sc.next();
				 std.setStdsurname(stdsurname);
		        session.update(std);
				tx.commit();
				session.close();
				System.out.println("Student data updated successfully");
				break;
			}
			case 3:
			{
				System.out.println("Enter a date (yyyy-MM-dd): ");
				 dob = sc.next();
				 std.setDob(dob);
		        session.update(std);
				tx.commit();
				session.close();
				System.out.println("Student data updated successfully");
				break;
			}
			case 4:
			{
				System.out.println("Enter the gender");
				stdgender=sc.next();
				 std.setStdgender(stdgender);
		        session.update(std);
				tx.commit();
				session.close();
				System.out.println("Student data updated successfully");
				break;
			}
			
			case 5:
			{
				System.out.println("Enter the mail Id");
				stdemail=sc.next();
				 std.setStdemail(stdemail);
		        session.update(std);
				tx.commit();
				session.close();
				System.out.println("Student data updated successfully");
				break;
			}
			case 6:
			{
				System.out.println("Enter the Phone");
				stdphone=sc.nextLong();
				 std.setStdphone(stdphone);
		        session.update(std);
				tx.commit();
				session.close();
				System.out.println("Student data updated successfully");
				break;
			}
			
				
			case 7:
			
			
				System.exit(0);
				break;
			}
			}

	

	@Override
	public void displayStd() {
		// TODO Auto-generated method stub
		Session session=HiberUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
	
		String hql = "FROM Student";
		System.out.println("Student's data ");
		Query<Student> query = session.createQuery(hql, Student.class);
		List<Student> resultList = query.getResultList();
		for (Student entity : resultList) {
			System.out.println("stdid " + entity.getStdid());
			System.out.println("stdName " + entity.getStdname());
			System.out.println("stdSurname " + entity.getStdsurname());
			System.out.println("dob " + entity.getDob());
			System.out.println("stdgender " + entity.getStdgender());
			System.out.println("stdemail " + entity.getStdemail());
			System.out.println("stdphone " + entity.getStdphone());
		}
	
	}
    
}
