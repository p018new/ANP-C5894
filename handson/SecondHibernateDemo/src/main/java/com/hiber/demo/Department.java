package com.hiber.demo;
import java.util.Set;



import javax.persistence.Column;

import javax.persistence.Entity;

import javax.persistence.Id;

import javax.persistence.JoinColumn;

import javax.persistence.OneToMany;

@Entity

public class Department 

{



	@Id

	@Column(name = "department_id")

	private int dId;

	@Column

	private String dName;

	@OneToMany

	private Set<Employee1> employee;

	



	public int getdId() {

		return dId;

	}





	public void setdId(int dId) {

		this.dId = dId;

	}





	public String getdName() {

		return dName;

	}





	public void setdName(String dName) {

		this.dName = dName;

	}





	public Set<Employee1> getEmployee() {

		return employee;

	}





	public void setEmployee(Set<Employee1> employee) {

		this.employee = employee;

	}





	@Override

	public String toString() {

		return "Department [dId=" + dId + ", dName=" + dName + ", employee=" + employee + "]";

	}





	

	

	

}
