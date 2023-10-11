package com.spring.demo;

public class Restaurant {

	

	HotDrink hotDrink;

	String welcomeNote;

	

	public Restaurant(HotDrink hotDrink)

	{

		super();

		this.hotDrink=hotDrink;

	}



	public String getWelcomeNote() {

		return welcomeNote;

	}



	public void setWelcomeNote(String welcomeNote) {

		this.welcomeNote = welcomeNote;

	}

	

	

	public void prepareDrink()

	{

		hotDrink.prepareHotDrink();

	}

	

	public void greetmessage()

	{

		System.out.println(welcomeNote);

	}

}


