package com.divs.comp;

public class A {
	
	private B b;
	
	static {
		System.out.println("A class is loading..");
	}
	
	public A() {
		System.out.println("A 0 parm called...");
	}
	

	public A(B b) {
		this.b = b;
		System.out.println("A 1 param is called..");
	}


	public void setB(B b) {
		this.b = b;
		System.out.println("A.setB()");
	}

	@Override
	public String toString() {
		return "A [b=" + b + "]";
	}
	
	
	

}
