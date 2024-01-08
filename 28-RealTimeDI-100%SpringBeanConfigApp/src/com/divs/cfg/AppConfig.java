package com.divs.cfg;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = {"com.divs"})
@Import(value = PersistenceConfig.class)
public class AppConfig {
	static {
		System.out.println("AppConfig class is loading..");
	}
	
	public AppConfig() {
		System.out.println("AppConfig class is instantiated..");
	}

}
