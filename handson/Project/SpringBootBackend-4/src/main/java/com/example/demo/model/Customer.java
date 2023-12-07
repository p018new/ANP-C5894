package com.example.demo.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customer {
	@Id
	 private int id;
	 @Column
	 private String username;
	 @Column
	 private String password;

	 public Customer() {
	
		 
}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Customer(int id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}
	
}