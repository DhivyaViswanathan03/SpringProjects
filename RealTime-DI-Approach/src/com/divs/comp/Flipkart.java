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
	
	public String doShopping(String[] items, Float prices[]) {
		System.out.println("Flipkart.doShopping()..");
		System.out.println("Implementation class is :"+courier.getClass().getName());
		Float billamount=0f;
		for(Float price:prices) {
			billamount=billamount+price;
		}
		
		Random random = new Random();
		int oid = random.nextInt(100);	
		String msg=courier.deliver(oid);
		return msg+" for the amount "+billamount+" for the items"+Arrays.toString(items);
	}

}
