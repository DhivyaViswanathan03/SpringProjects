package com.divs.comp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

//Target Class
public class Flipkart {
	
	static {
		System.out.println("Flipkart class is loading...");
	}
	
	public Flipkart() {
		System.out.println("Flipkart zero parm is called...");
	}
	
	//Dependant class
	
	private Courier courier;
	private Float discount;
	
	@Autowired
	public Flipkart(@Qualifier("bDart")Courier courier) {
		this.courier = courier;
		System.out.println("Flipkart two param constructor is called...");
	}
	@Override
	public String toString() {
		return "Flipkart [courier=" + courier + ", discount=" + discount + "]";
	}
	
	
	
	


}
