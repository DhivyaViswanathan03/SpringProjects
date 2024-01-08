package com.divs.test;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import com.divs.cfg.AppConfig;
import com.divs.controller.MainController;
import com.divs.vo.EmployeeVO;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestApp {

	public static void main(String[] args) throws IOException {
		
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
		Scanner in=new Scanner(System.in);
		System.out.print("Enter Employee name:: ");
		String eName=in.next();
		System.out.print("Enter Employee Address:: ");
		String eAddr=in.next();
		System.out.print("Enter Employee age:: ");
		String eAge=in.next();
		System.out.print("Enter Employee Salary:: ");
		String eSalary=in.next();
		EmployeeVO vo=new EmployeeVO();
		vo.seteName(eName);
		vo.seteAge(eAge);
		vo.seteAddress(eAddr);
		vo.seteSalary(eSalary);
		
		MainController con=context.getBean(MainController.class);
		EmployeeVO voResult=con.getHike(vo);
		System.out.println(voResult);
		
		((ConfigurableApplicationContext) context).close();
		
		
		
		
	

	}

}
