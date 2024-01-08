package com.divs.service;

import com.divs.bo.EmployeeBO;
import com.divs.dao.IEmployeeDao;
import com.divs.dto.EmployeeDTO;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value="service")
public class EmployeeServiceImpl implements IEmployeeService {
	
	static {
		System.out.println("EmployeeServiceImpl class is loading..");
	}
	
	public EmployeeServiceImpl() {
		System.out.println("EmployeeServiceImpl is instantiated...");
	}

	@Autowired
	private IEmployeeDao dao;
	

	@Override
	public String toString() {
		return "EmployeeServiceImpl [dao=" + dao + "]";
	}
	
	public EmployeeDTO calculateHike(EmployeeDTO dto) {
		Float hike=dto.geteSalary()*30000.0f;
		EmployeeBO bo=new EmployeeBO();
		BeanUtils.copyProperties(dto, bo);
		bo.seteHike(hike);
		
		EmployeeBO boResult=dao.save(bo);
		EmployeeDTO dtoResult=new EmployeeDTO();
	     BeanUtils.copyProperties(boResult, dtoResult);
		
		return dtoResult;
		
	}
	
	
}
