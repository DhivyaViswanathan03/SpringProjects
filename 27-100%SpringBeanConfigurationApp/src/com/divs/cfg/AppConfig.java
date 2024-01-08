package com.divs.cfg;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.divs"})
public class AppConfig {
	static {
		System.out.println("AppConfig is loading...");
	}
	
	public AppConfig() {
		System.out.println("AppConfig is instantiated...");
	}
	
	@Bean
	public LocalDateTime createDate1() {
		System.out.println("AppConfig.createDate1()");
		return LocalDateTime.now();
	}
	
	@Bean
	public LocalDateTime createDate2() {
		System.out.println("AppConfig.createDate2()");
		return LocalDateTime.now();
	}


}
