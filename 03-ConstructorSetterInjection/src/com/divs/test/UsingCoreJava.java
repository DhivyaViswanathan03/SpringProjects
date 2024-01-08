package com.divs.test;


import com.divs.comp.WishMessagegenerator;

public class UsingCoreJava {

	public static void main(String[] args) {
		
		
		java.util.Date d=new java.util.Date();
		WishMessagegenerator generator=new WishMessagegenerator(d);
		
		System.out.println("Generator After setter injection::"+generator);
		System.out.println();
		
		String message=generator.generateMessage("Dhivya");
		System.out.println(message);

	}

}
