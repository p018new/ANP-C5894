package com.fireplay.hiber;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Employee 
{
	@Id
	private int EmpId;
	
	@Column(name="Name")
	private String EmpName;
	
	@Column(name="Designation")
	private String EmpDesignation;
	
	@Column(name="PhoneNo")
	private String EmpPhoneNumber;
	
	@Column(name="Salary")
	private double Salary;
	
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public String getEmpDesignation() {
		return EmpDesignation;
	}
	public void setEmpDesignation(String empDesignation) {
		EmpDesignation = empDesignation;
	}
	public String getEmpPhoneNumber() {
		return EmpPhoneNumber;
	}
	public void setEmpPhoneNumber(String empPhoneNumber) {
		EmpPhoneNumber = empPhoneNumber;
	}
	public double getSalary() {
		return Salary;
	}
	
	public void setSalary1(double string) {
		Salary = string;
	}

@Override	
public String toString() {
	return "Employee [EmpId=" + EmpId + ", EmpName=" + EmpName + ", EmpDesignation=" + EmpDesignation + ", EmpPhoneNumber="
			+ EmpPhoneNumber + ", EmpSalary=" + Salary + "]";
}

	
	
}

	
	

