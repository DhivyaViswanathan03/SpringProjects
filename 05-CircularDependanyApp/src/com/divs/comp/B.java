package com.divs.comp;

public class B {
	private A a;
	
	static {
		System.out.println("B class is loading..");
	}
	
	public B() {
		System.out.println("B 0 param...");
	}
	

	public B(A a) {
		this.a = a;
		System.out.println("B 1 param is called..");
	}


	public void setA(A a) {
		this.a = a;
		System.out.println("B.setA()");
	}

	@Override
	public String toString() {
		return "B [a=" + a + "]";
	}
	
	

}
