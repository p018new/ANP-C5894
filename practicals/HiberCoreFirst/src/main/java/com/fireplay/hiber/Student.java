package com.fireplay.hiber;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_detail")
public class Student {
	@Id
	private int StdId;
	@Column(name="Name")
	private String StdName;
	@Column(name="Degree")
	private String StdDegree;
	@Column(name="Gender")
	private String StdGender;
	@Column(name="PhoneNumber")
	private double StdPhoneNumber;
	public int getStdId() {
		return StdId;
	}
	public void setStdId(int stdId) {
		StdId = stdId;
	}
	public String getStdName() {
		return StdName;
	}
	public void setStdName(String stdName) {
		StdName = stdName;
	}
	public String getStdDegree() {
		return StdDegree;
	}
	public void setStdDegree(String stdDegree) {
		StdDegree = stdDegree;
	}
	public String getStdGender() {
		return StdGender;
	}
	public void setStdGender(String stdGender) {
		StdGender = stdGender;
	}
	public double getStdPhoneNumber() {
		return StdPhoneNumber;
	}
	public void setStdPhoneNumber(double stdPhoneNumber) {
		StdPhoneNumber = stdPhoneNumber;
	}
	@Override
	public String toString() {
		return "Student [StdId=" + StdId + ", StdName=" + StdName + ", StdDegree=" + StdDegree + ", StdGender="
				+ StdGender + ", StdPhoneNumber=" + StdPhoneNumber + "]";
	}

}

