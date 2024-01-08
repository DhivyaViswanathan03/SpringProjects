package com.divs.comp;

public class BlueDart implements Courier {

	static {
		System.out.println("BlueDart is loading....");
	}
	
	public BlueDart() {
		System.out.println("BlueDart zeroi parm is called...");
	}
	@Override
	public String deliver(int oid) {
		// TODO Auto-generated method stub
		return "BlueDart delivered with order id is::"+oid;
	}

}
