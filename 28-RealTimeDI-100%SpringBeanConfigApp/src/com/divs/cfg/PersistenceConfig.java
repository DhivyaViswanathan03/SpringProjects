package com.divs.cfg;

import com.zaxxer.hikari.HikariDataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource(value = "com/divs/commons/application.properties")
public class PersistenceConfig {
	
	@Autowired
	private Environment env;
	
	static {
		System.out.println("PersistenceConfig class is loading...");
	}
	
	public PersistenceConfig() {
		System.out.println("PersistenceConfig is instantiated...");
	}
	
	@Bean(value="datasource")
	public HikariDataSource createSource() {
		HikariDataSource source=new HikariDataSource();
		source.setUsername(env.getProperty("jdbc.username"));
		source.setPassword(env.getProperty("jdbc.password"));
		source.setJdbcUrl(env.getProperty("jdbc.url"));
		source.setDriverClassName(env.getProperty("jdbc.driverClassName"));
		source.setMaximumPoolSize(Integer.parseInt(env.getProperty("jdbc.minimumIdle")));
		source.setMaximumPoolSize(Integer.parseInt(env.getProperty("jdbc.maximumPoolSize")));
		source.setConnectionTimeout(Integer.parseInt(env.getProperty("jdbc.connectionTimeout")));
		return source;
		
	}
	
	

}
