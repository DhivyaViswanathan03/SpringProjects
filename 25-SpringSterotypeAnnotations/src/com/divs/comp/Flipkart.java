package com.divs.comp;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = "com/divs/commons/application.properties")
@Scope("singleton")
public class Flipkart {
	
	static {
		System.out.println("Flipkart class is loading...");
	}
	
	public Flipkart() {
		System.out.println("Flipkart zero parm is called...");
	}
	
	//Dependant class
	
	@Autowired
	private Courier courier;
	
	@Value("${flipkart.info.discount}")
	private Float discount;
	
	

	@Override
	public String toString() {
		return "Flipkart [courier=" + courier + ", discount=" + discount + "]";
	}
	
	
	


}
