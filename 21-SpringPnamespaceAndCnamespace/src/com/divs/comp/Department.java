package com.divs.comp;

import java.util.Date;

public class Department {
	
	private Integer dno;
	private String dname;
	private Date doj;
	
	public Department(Integer dno, String dname, Date doj) {
		this.dno = dno;
		this.dname = dname;
		this.doj = doj;
	}
	@Override
	public String toString() {
		return "Department [dno=" + dno + ", dname=" + dname + ", doj=" + doj + "]";
	}
	
	

}
