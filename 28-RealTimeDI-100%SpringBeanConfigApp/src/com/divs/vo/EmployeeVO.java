package com.divs.vo;

public class EmployeeVO {
	
	private String eId;
	private String eName;
	private String eAge;
	private String eAddress;
	private String eSalary;
	private String eHike;
	
	static {
		System.out.println("EmployeeVO class is loading..");
	}
	
	public EmployeeVO() {
		System.out.println("EmployeeVO class is instantiated..");
	}
	
	public String geteId() {
		return eId;
	}

	public void seteId(String eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String geteAge() {
		return eAge;
	}

	public void seteAge(String eAge) {
		this.eAge = eAge;
	}

	public String geteAddress() {
		return eAddress;
	}

	public void seteAddress(String eAddress) {
		this.eAddress = eAddress;
	}

	public String geteSalary() {
		return eSalary;
	}

	public void seteSalary(String eSalary) {
		this.eSalary = eSalary;
	}

	public String geteHike() {
		return eHike;
	}

	public void seteHike(String eHike) {
		this.eHike = eHike;
	}

	@Override
	public String toString() {
		return "EmployeeVO [eId=" + eId + ", eName=" + eName + ", eAge=" + eAge + ", eAddress=" + eAddress
				+ ", eSalary=" + eSalary + ", eHike=" + eHike + "]";
	}

}
