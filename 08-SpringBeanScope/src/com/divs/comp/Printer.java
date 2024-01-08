package com.divs.comp;

public class Printer {
	
	private static Printer INSTANCE=null;
	
	static {
		System.out.println("Printer class is loading...");
	}
	
	private Printer() {
		System.out.println("Printer is instantiated..");
	}
	
	public static Printer getInstance() {
		System.out.println("Printer instance method is getting called..");
		if(INSTANCE==null) {
			INSTANCE=new Printer();
		}
		return INSTANCE;
	}

	

}
