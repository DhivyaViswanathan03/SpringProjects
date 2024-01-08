package com.divs.bo;

public class CustomerBo {

	private String cusName;
	private String cusAddr;
	private Float pAmt;
	private Float time;
	private Float rate;
	
	private float intrAmount;

	static {
		System.out.println("CustomerBo is loading...");
	}
	
	public CustomerBo() {
		System.out.println("CustomerBo obj is instantiated...");
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

	public float getIntrAmount() {
		return intrAmount;
	}

	public void setIntrAmount(float intrAmount) {
		this.intrAmount = intrAmount;
	}

	@Override
	public String toString() {
		return "CustomerBo [cusName=" + cusName + ", cusAddr=" + cusAddr + ", pAmt=" + pAmt + ", time="
				+ time + ", rate=" + rate + ", intrAmount=" + intrAmount + "]";
	}
	
	
	
}
