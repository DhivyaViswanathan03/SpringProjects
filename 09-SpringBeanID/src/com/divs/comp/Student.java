package com.divs.comp;

public class Student {
	
	private Integer sid;
	private String sname;
	private String saddress;
	
	static {
		System.out.println("Student class is loading..");
	}
	
	public Student() {
		System.out.println("Student obj is instantiated...");
	}

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSaddress() {
		return saddress;
	}

	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", saddress=" + saddress + "]";
	}
	
	

}
