package com.divs.comp;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = "com/divs/commons/application.properties")
public class Vote {
	
	static {
		System.out.println("Vote class is loading");
	}
	
	public Vote() {
		System.out.println("Vote.Vote() is instantiated..");
	}
	
	@Value("${Vote.info.name}")
	private String name;
	
	@Value("${Vote.info.age}")
	private Integer age;
	
	private Date dov;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("Vote.setName()");
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
		System.out.println("Vote.setAge()");
	}

	public Date getDov() {
		return dov;
	}

	public void setDov(Date dov) {
		this.dov = dov;
		System.out.println("Vote.setDov()");
	}
	
	@PostConstruct
	public void myInit() {
		dov=new Date();
		System.out.println("Vote.myInit()");
		boolean flag=false;
		if(name==null) {
			System.out.println("Name must not be null");
			flag=true;
		}
		if(age<0) {
			age=age*-1;
		}
		if(age>100) {
			System.out.println("age not more than 100");
			flag=true;
		}
		if(flag) {
			throw new IllegalArgumentException("not valid");
		}
	}
	public String checkVotingEligibility() {
		String messag="";
		
		if(age>=18) {
			return name+" u r eligible ,age is "+age+".......>on"+dov;
		}
		else {
			return name+" u r not eligible ,age is "+age+".......>on"+dov;
		}	
	}
	
	@PreDestroy
	public void myDestory() {
		System.out.println("Vote.myDestory()");
	}

	@Override
	public String toString() {
		return "Vote [name=" + name + ", age=" + age + ", dov=" + dov + "]";
	}


}
