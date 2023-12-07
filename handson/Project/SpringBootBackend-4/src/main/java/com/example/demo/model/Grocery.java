package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="InstaMart00")



public class Grocery {
	@Id
	private int id;
	
	@Column(name="Veggies")
	private String vegName;
	
	@Column(name="Dairy")
	private String dName;
	
	@Column(name="Colddrinks")
	private String coldName;
	
	@Column(name="Fruits")
	private String fruits;
	
	@Column(name="Dal")
    private String dal;
	
	@Column(name="FrozenFood")
	private String froz;
	
	@Column(name="Cosmetics")
	private String cos;
	
	@Column(name="Detergents")
	private String det;
	
	public Grocery() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Grocery(int id, String vegName, String dName, String coldName, String fruits, String dal, String froz,
			String cos, String det) {
		super();
		this.id = id;
		this.vegName = vegName;
		this.dName = dName;
		this.coldName = coldName;
		this.fruits = fruits;
		this.dal = dal;
		this.froz = froz;
		this.cos = cos;
		this.det = det;
	}


		
	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getVegName() {
		return vegName;
	}


	public void setVegName(String vegName) {
		this.vegName = vegName;
	}


	public String getdName() {
		return dName;
	}


	public void setdName(String dName) {
		this.dName = dName;
	}


	public String getColdName() {
		return coldName;
	}


	public void setColdName(String coldName) {
		this.coldName = coldName;
	}


	public String getFruits() {
		return fruits;
	}


	public void setFruits(String fruits) {
		this.fruits = fruits;
	}


	public String getDal() {
		return dal;
	}


	public void setDal(String dal) {
		this.dal = dal;
	}


	public String getFroz() {
		return froz;
	}


	public void setFroz(String froz) {
		this.froz = froz;
	}


	public String getCos() {
		return cos;
	}


	public void setCos(String cos) {
		this.cos = cos;
	}


	public String getDet() {
		return det;
	}


	public void setDet(String det) {
		this.det = det;
	}
}
