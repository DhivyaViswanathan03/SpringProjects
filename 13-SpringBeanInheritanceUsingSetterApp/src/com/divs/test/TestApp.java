package com.divs.test;

import java.io.IOException;
import java.util.Arrays;

import com.divs.comp.Car;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

	public static void main(String[] args) throws IOException {
		
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("com/divs/cfg/applicationConext.xml");
		System.out.println("Bean names::"+Arrays.toString(factory.getBeanDefinitionNames()));
		
		System.in.read();
		
		Car car1=factory.getBean("car1", Car.class);
		System.out.println(car1);
		Car car2=factory.getBean("car2", Car.class);
		System.out.println(car2);
		Car baseCar=factory.getBean("baseCar", Car.class);
		System.out.println(baseCar);
	}

}
