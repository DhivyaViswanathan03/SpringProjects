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

//	public void setDate(Date date) {
//		System.out.println("WishMessagegenerator.setDate() is called..");
//		this.date = date;
//	}
	
	
	//Bussiness logic 
	public String generateMessage(String userName) {
		int hour=date.getHours();
		if(hour<12) {
			return "Good Morning ::"+userName;
		}else if(hour<16) {
			return "Good Noon::"+userName;
		}else if(hour<20) {
			return "Good Evening::"+userName;
		}else {
			return "Good Night::"+userName;
		}
	}

	public WishMessagegenerator(Date date) {
		System.out.println("Constructor is getting called...");
	this.date = date;
}

	@Override
	public String toString() {
		return "WishMessagegenerator [date=" + date + "]";
	}
	
	

}
