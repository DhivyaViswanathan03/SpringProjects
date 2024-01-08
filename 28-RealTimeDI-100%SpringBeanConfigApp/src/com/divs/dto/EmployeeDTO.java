package com.divs.dto;

public class EmployeeDTO {
	
	private Integer eId;
	private String eName;
	private Integer eAge;
	private String eAddress;
	private Float eSalary;
	private Float eHike;
	
	static {
		System.out.println("EmployeeDTO class is loading..");
	}
	
	public EmployeeDTO() {
		System.out.println("EmployeeDTO class is instantiated..");
	}

	public Integer geteId() {
		return eId;
	}

	public void seteId(Integer eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public Integer geteAge() {
		return eAge;
	}

	public void seteAge(Integer eAge) {
		this.eAge = eAge;
	}

	public String geteAddress() {
		return eAddress;
	}

	public void seteAddress(String eAddress) {
		this.eAddress = eAddress;
	}

	public Float geteSalary() {
		return eSalary;
	}

	public void seteSalary(Float eSalary) {
		this.eSalary = eSalary;
	}

	public Float geteHike() {
		return eHike;
	}

	public void seteHike(Float eHike) {
		this.eHike = eHike;
	}

	@Override
	public String toString() {
		return "EmployeeDTO [eId=" + eId + ", eName=" + eName + ", eAge=" + eAge + ", eAddress=" + eAddress
				+ ", eSalary=" + eSalary + ", eHike=" + eHike + "]";
	}
	
}
