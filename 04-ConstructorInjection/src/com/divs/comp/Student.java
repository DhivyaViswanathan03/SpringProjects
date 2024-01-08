package com.divs.comp;

import java.io.Serializable;

public class Student implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer sno;
	private String sname;
	private String saddr;
	private Float avg;
	
	static {
		System.out.println("Student class is loading...");
	}
	public Student(Integer sno, String sname, String saddr, Float avg) {
		this.sno = sno;
		this.sname = sname;
		this.saddr = saddr;
		this.avg = avg;
		System.out.println("Student class object is initialized...");
	}
	public Integer getSno() {
		return sno;
	}
	public void setSno(Integer sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSaddr() {
		return saddr;
	}
	public void setSaddr(String saddr) {
		this.saddr = saddr;
	}
	public Float getAvg() {
		return avg;
	}
	public void setAvg(Float avg) {
		this.avg = avg;
	}
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", saddr=" + saddr + ", avg=" + avg + "]";
	}

}
