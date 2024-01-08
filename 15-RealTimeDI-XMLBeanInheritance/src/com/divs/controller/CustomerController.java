package com.divs.controller;

import com.divs.dto.CustomerDto;
import com.divs.service.ICustomerService;
import com.divs.vo.CustomerVo;

public class CustomerController {
	
	private ICustomerService service;
	

	public ICustomerService getService() {
		return service;
	}

	public void setService(ICustomerService service) {
		this.service = service;
	}
	
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

	public CustomerController(ICustomerService service) {
		this.service = service;
		System.out.println("CustomerController 1 param is called...."+service.getClass().getName());
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
