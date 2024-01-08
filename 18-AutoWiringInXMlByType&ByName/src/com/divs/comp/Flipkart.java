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
	
	public Courier getCourier() {
		return courier;
	}
	public void setCourier(Courier courier) {
		System.out.println("Flipkart.setCourier()");
		
		this.courier = courier;
		System.out.println("SetCourier impl class is::"+courier.getClass().getName());
	}
	public Float getDiscount() {
		return discount;
	}
	public void setDiscount(Float discount) {
		System.out.println("Flipkart.setDiscount()");
		this.discount = discount;
	}
	@Override
	public String toString() {
		return "Flipkart [courier=" + courier + ", discount=" + discount + "]";
	}
	


}
