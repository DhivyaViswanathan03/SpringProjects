package com.divs.comp;

public class DTDC implements Courier {
	
	static {
		System.out.println("DTDC is loading....");
	}
	
	public DTDC() {
		System.out.println("DTDC zeroi parm is called...");
	}

	@Override
	public String deliver(int oid) {
		// TODO Auto-generated method stub
		return "DTDC delivered with order id is::"+oid;
	}

}
