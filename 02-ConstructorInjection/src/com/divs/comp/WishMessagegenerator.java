package com.divs.comp;

import java.util.Date;

//Target class(userDefined)
public class WishMessagegenerator {
	
	//dependant class(predefined -->java.util.Date)
	private Date date;
	
	static {
		System.out.println("WishMessagegenerator class is loading...");
	}
	
	public WishMessagegenerator() {
		System.out.println("WishMessagegenerator class object is initialized");
	}

	public void setDate(Date date) {
		this.date = date;
		System.out.println("WishMessagegenerator.setDate() is called..");
		System.out.println(this);
	}
	

	public WishMessagegenerator(Date date) {
		this.date = date;
	    System.out.println("Constructor is getting called...");
	    System.out.println(this);
    }

	@Override
	public String toString() {
		return "WishMessagegenerator [date=" + date + "]";
	}
	
	

}
