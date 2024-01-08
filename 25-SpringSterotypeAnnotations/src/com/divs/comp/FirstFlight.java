package com.divs.comp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component(value="fFlight")
@Primary
public class FirstFlight implements Courier {

	static {
		System.out.println("FirstFlight is loading....");
	}
	
	public FirstFlight() {
		System.out.println("FirstFlight zeroi parm is called...");
	}
	
	@Override
	public String deliver(int oid) {
		// TODO Auto-generated method stub
		return "FirstFlight delivered with order id is::"+oid;
	}

}
