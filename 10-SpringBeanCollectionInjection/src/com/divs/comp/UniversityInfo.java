package com.divs.comp;

import java.util.Date;
import java.util.Map;
import java.util.Properties;

public class UniversityInfo {
	
	private Map<Integer,String> facultyDetails;
	private Map<Integer,Date>  dateList;
	private Properties iplInfo;
	

	public void setIplInfo(Properties iplInfo) {
		this.iplInfo = iplInfo;
	}
	public void setFacultyDetails(Map<Integer, String> facultyDetails) {
		this.facultyDetails = facultyDetails;
		System.out.println("Implementation class is::"+facultyDetails.getClass().getName());
	}
	public void setDateList(Map<Integer, Date> dateList) {
		this.dateList = dateList;
	}
	@Override
	public String toString() {
		return "UniversityInfo [facultyDetails=" + facultyDetails + ", dateList=" + dateList + ", iplInfo=" + iplInfo
				+ "]";
	}
	
	

}
