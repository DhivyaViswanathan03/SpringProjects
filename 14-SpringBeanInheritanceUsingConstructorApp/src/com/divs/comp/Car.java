package com.divs.comp;

public class Car {
	
	public String regNo;
	private String engineNo;
	private String model;
	private String type;
	private String company;
	private Integer engineCC;
	private String color;
	private String owner;
	private String fuelType;
	
	static {
		System.out.println("Car class is loading...");
	}
	
	public Car() {
		System.out.println("Car object is instantiated...");
	}
	
	
	public Car(String regNo, String engineNo, String model, String type, String company, Integer engineCC, String color,
			String owner, String fuelType) {
		System.out.println("9 param constructor is called...");
		
		this.regNo = regNo;
		this.engineNo = engineNo;
		this.model = model;
		this.type = type;
		this.company = company;
		this.engineCC = engineCC;
		this.color = color;
		this.owner = owner;
		this.fuelType = fuelType;
	}


	@Override
	public String toString() {
		return "Car [regNo=" + regNo + ", engineNo=" + engineNo + ", model=" + model + ", type=" + type + ", company="
				+ company + ", engineCC=" + engineCC + ", color=" + color + ", owner=" + owner + ", fuelType="
				+ fuelType + "]";
	}
}
