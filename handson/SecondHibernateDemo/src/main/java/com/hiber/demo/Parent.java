package com.hiber.demo;

import java.util.Set;

import javax.persistence.Column;

import javax.persistence.Entity;

import javax.persistence.Id;

import javax.persistence.OneToMany;

@Entity

public class Parent 
{



	@Id

	private int pId;

	@Column

	private String pName;

	@OneToMany

	private Set<Childs> child;

	

	public int getpId() 
	{

		return pId;

	}

	public void setpId(int pId) 
	{

		this.pId = pId;

	}

	public String getpName() 
	{

		return pName;

	}

	public void setpName(String pName) 
	{

		this.pName = pName;

	}

	public Set<Childs> getChild()
	{

		return child;

	}

	public void setChild(Set<Childs> child) 
	{

		this.child = child;

	}

	@Override

	public String toString() 
	{

		return "Parent [pId=" + pId + ", pName=" + pName + ", child=" + child + "]";

	}

}

	

	

	



