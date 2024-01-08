package com.divs.comp;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value="wmg")
public class WishMessageGeneratorApp {
	
	static {
		System.out.println("WishMessageGeneratorApp is loading..");
	}
	
	public WishMessageGeneratorApp() {
		System.out.println("WishMessageGeneratorApp is instantiated...");
	}
	
	@Autowired(required = true)
	@Qualifier(value="createDate2")
	private LocalDateTime date;

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "WishMessageGeneratorApp [date=" + date + "]";
	}

	public String generateMessage(String userName) {
		int h=date.getHour();
		if(h<12)
			return "Good Morning "+userName;
		else if(h<16)
			return "Good Noon "+userName;
		else if(h<20)
			return "Good Evening "+userName;
		else
			return "Good Night "+userName;
	}

}
