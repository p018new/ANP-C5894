package com.hiber.demo;

import javax.persistence.Entity;

import javax.persistence.Id;

import javax.persistence.ManyToOne;

@Entity

public class Childs {

	@Id

	private int cId;

	private String cName;

	@ManyToOne

	private Parent parent;

	

	public int getcId() {

		return cId;

	}

	public void setcId(int cId) {

		this.cId = cId;

	}

	public String getcName() {

		return cName;

	}

	public void setcName(String cName) {

		this.cName = cName;

	}

	public Parent getParent() {

		return parent;

	}

	public void setParent(Parent parent) {

		this.parent = parent;

	}

}

