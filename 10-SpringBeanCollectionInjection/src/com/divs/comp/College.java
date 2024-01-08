package com.divs.comp;

import java.util.Date;
import java.util.List;

public class College {
	
	private List<String> snames;
	private List<Date> dateList;
	
	public void setSnames(List<String> snames) {
		this.snames = snames;
		System.out.println("Implementation class is ::"+snames.getClass().getName());
	}
	public void setDateList(List<Date> dateList) {
		this.dateList = dateList;
	}
	@Override
	public String toString() {
		return "College [snames=" + snames + ", dateList=" + dateList + "]";
	}
	
	
	

}
