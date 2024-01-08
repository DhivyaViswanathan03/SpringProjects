package com.divs.controller;

import java.util.Scanner;

import com.divs.dto.EmployeeDTO;
import com.divs.service.IEmployeeService;
import com.divs.vo.EmployeeVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "controller")
public class MainController {
	
	static {
		System.out.println("MainController class is loading..");
	}
	
	public MainController() {
		System.out.println("MainController class is instantiated...");
	}
	
	@Autowired
	private IEmployeeService service;
	
	public EmployeeVO getHike(EmployeeVO vo) {
		
		
		EmployeeDTO dto=new EmployeeDTO();
		dto.seteName(vo.geteName());
		dto.seteAge(Integer.parseInt(vo.geteAge()));
		dto.seteAddress(vo.geteAddress());
		dto.seteSalary(Float.parseFloat(vo.geteSalary()));
		
		EmployeeDTO dtoResult=service.calculateHike(dto);
		EmployeeVO voResult=new EmployeeVO();
		voResult.seteId(dtoResult.geteId().toString());
		voResult.seteName(dtoResult.geteName());
		voResult.seteAge(dtoResult.geteAge().toString());
		voResult.seteAddress(dtoResult.geteAddress());
		voResult.seteSalary(dtoResult.geteSalary().toString());
		voResult.seteHike(dtoResult.geteHike().toString());
		
		return voResult;
	}

	@Override
	public String toString() {
		return "MainController [service=" + service + "]";
	}
	
	
	
	

}
