package com.divs.comp;

import java.util.Arrays;
import java.util.Random;

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
	
	
	
	public Flipkart(Courier courier, Float discount) {
		this.courier = courier;
		this.discount = discount;
		System.out.println("Flipkart 2 param constructor is called...");
		System.out.println(this);
	}



	@Override
	public String toString() {
		return "Flipkart [courier=" + courier + ", discount=" + discount + "]";
	}
	


}
