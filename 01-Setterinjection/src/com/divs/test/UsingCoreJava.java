package com.divs.test;


import com.divs.comp.WishMessagegenerator;

public class UsingCoreJava {

	public static void main(String[] args) {
		WishMessagegenerator generator=new WishMessagegenerator();
		System.out.println("Generator before setter injection::"+generator);
		
		java.util.Date d=new java.util.Date();
		generator.setDate(d);
		
		System.out.println("Generator After setter injection::"+generator);
		System.out.println();
		
		String message=generator.generateMessage("Dhivya");
		System.out.println(message);

	}

}
