package com.divs.vo;

public class CustomerVo {
	
	private String cusName;
	private String cusAddr;
	private String pAmt;
	private String time;
	private String rate;
	static {
		System.out.println("CustomerVo is loading...");
	}
	
	public CustomerVo() {
		System.out.println("CustomerVo obj is instantiated...");
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
	public String getpAmt() {
		return pAmt;
	}
	public void setpAmt(String pAmt) {
		this.pAmt = pAmt;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	@Override
	public String toString() {
		return "CustomerVo [cusName=" + cusName + ", cusAddr=" + cusAddr + ", pAmt=" + pAmt + ", time="
				+ time + ", rate=" + rate + "]";
	}
	
	

}
