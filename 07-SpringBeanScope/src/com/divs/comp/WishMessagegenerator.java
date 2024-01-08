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

	
	
	public WishMessagegenerator(Date date) {
		this.date = date;
		System.out.println("1 param onstructor is getting called...");
	
}

	@Override
	public String toString() {
		return "WishMessagegenerator [date=" + date + "]";
	}
	
	

}
