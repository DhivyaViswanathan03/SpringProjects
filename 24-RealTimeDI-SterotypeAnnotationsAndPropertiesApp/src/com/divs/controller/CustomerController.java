package com.divs.controller;

import com.divs.dto.CustomerDto;
import com.divs.service.ICustomerService;
import com.divs.vo.CustomerVo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="controller")
public class CustomerController {
	
	@Autowired
	private ICustomerService service;
	

	
	
	@Override
	public String toString() {
		return "CustomerController [service=" + service + "]";
	}


	static {
		System.out.println("CustomerController is loading...");
	}
	
	public CustomerController() {
		System.out.println("CustomerController 0 param is called....");
	}

	
	public String processCustomer(CustomerVo vo) throws Exception{
		CustomerDto dto=new CustomerDto();
		dto.setCusName(vo.getCusName());
		dto.setCusAddr(vo.getCusAddr());
		dto.setpAmt(Float.parseFloat(vo.getpAmt()));
		dto.setRate(Float.parseFloat(vo.getRate()));
		dto.setTime(Float.parseFloat(vo.getTime()));
		String message=service.calculateSimpleInterest(dto);
		return message;
		
	}
	
	

}
