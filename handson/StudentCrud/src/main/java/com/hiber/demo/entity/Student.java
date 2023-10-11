package com.hiber.demo.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name="Student Database")

 public class Student 
 {
	@Id  //marks it as identifier for this entity
	 private int Roll_no;
	@Column(name="First_Name")
    private String stdname;
	
	@Column(name="Surname")
    private String stdsurname;
	
	@Column(name="DOB")
    private Date dob;
	
	@Column(name="Phone_No")
    private long stdphone;
	
	@Column(name="Email")
    private String stdemail;
	
	@Column(name="Gender")
    private String stdgender;
	
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int roll_no, String stdname, String stdsurname, Date dob, long stdphone, String stdemail,
			String stdgender) {
		super();
		Roll_no = roll_no;
		this.stdname = stdname;
		this.stdsurname = stdsurname;
		this.dob = dob;
		this.stdphone = stdphone;
		this.stdemail = stdemail;
		this.stdgender = stdgender;
	}

	public int getRoll_no() {
		return Roll_no;
	}

	public void setRoll_no(int roll_no) {
		this.Roll_no = roll_no;
	}

	public String getStdname() {
		return stdname;
	}

	public void setStdname(String stdname) {
		this.stdname = stdname;
	}

	public String getStdsurname() {
		return stdsurname;
	}

	public void setStdsurname(String stdsurname) {
		this.stdsurname = stdsurname;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getStdgender() {
		return stdgender;
	}

	public void setStdgender(String stdgender) {
		this.stdgender = stdgender;
	}

	public String getStdemail() {
		return stdemail;
	}

	public void setStdemail(String stdemail) {
		this.stdemail = stdemail;
	}

	public long getStdphone() {
		return stdphone;
	}

	public void setStdphone(long stdphone) {
		this.stdphone = stdphone;
	}
 }

