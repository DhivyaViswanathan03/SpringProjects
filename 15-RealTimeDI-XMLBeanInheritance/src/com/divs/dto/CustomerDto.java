package com.divs.dto;

public class CustomerDto {

	private String cusName;
	private String cusAddr;
	private Float pAmt;
	private Float time;
	private Float rate;
	
	static {
		System.out.println("CustomerDto is loading...");
	}
	
	public CustomerDto() {
		System.out.println("CustomerDto obj is instantiated...");
	}
	
	public String getCusName() {
		return cusName;
	}
	public void setCusName(String cusName) {
		this.cusName = cusName;
	}
	public String getCusAddr() {
		return cusAddr;
	}
	public void setCusAddr(String cusAddr) {
		this.cusAddr = cusAddr;
	}
	public Float getpAmt() {
		return pAmt;
	}
	public void setpAmt(Float pAmt) {
		this.pAmt = pAmt;
	}
	public Float getTime() {
		return time;
	}
	public void setTime(Float time) {
		this.time = time;
	}
	public Float getRate() {
		return rate;
	}
	public void setRate(Float rate) {
		this.rate = rate;
	}
	@Override
	public String toString() {
		return "CustomerDto [cusName=" + cusName + ", cusAddr=" + cusAddr + ", pAmt=" + pAmt
				+ ", time=" + time + ", rate=" + rate + "]";
	}
	
	
	
}
