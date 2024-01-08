package com.divs.comp;

import java.util.Date;
import java.util.Set;

public class ContactInfo {
	
	private Set<Long> phoneNumbers;
	private Set<Date> dateList;
	
	public void setPhoneNumbers(Set<Long> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
		System.out.println("Implementation class is ::"+phoneNumbers.getClass().getName());
	}
	public void setDateList(Set<Date> dateList) {
		this.dateList = dateList;
		
	}
	
	@Override
	public String toString() {
		return "ContactInfo [phoneNumbers=" + phoneNumbers + ", dateList=" + dateList + "]";
	}
	
	

}
