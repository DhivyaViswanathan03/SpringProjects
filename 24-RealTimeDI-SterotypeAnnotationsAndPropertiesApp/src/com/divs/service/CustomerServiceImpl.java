package com.divs.service;

import com.divs.bo.CustomerBo;
import com.divs.dao.ICustomerDao;
import com.divs.dto.CustomerDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value="service")
public class CustomerServiceImpl implements ICustomerService {
	
	@Autowired
	private ICustomerDao dao;
	
	static {
		System.out.println("CustomerServiceImpl is loading...");
	}
	
	public CustomerServiceImpl() {
		System.out.println("CustomerServiceImpl 0 param is called");
	}
	

	@Override
	public String toString() {
		return "CustomerServiceImpl [dao=" + dao + "]";
	}

	@Override
	public String calculateSimpleInterest(CustomerDto dto) throws Exception {
		Float intAMount=(dto.getpAmt()*dto.getRate()*dto.getTime())/100.0f;
		CustomerBo bo=new CustomerBo();
		bo.setCusName(dto.getCusName());
		bo.setCusAddr(dto.getCusAddr());
		bo.setpAmt(dto.getpAmt());
		bo.setRate(dto.getRate());
		bo.setTime(dto.getTime());
		bo.setIntrAmount(intAMount);
		int count=dao.save(bo);
		return count==0?"Registration failed..":"Registration success:: with interest amount is "+intAMount;
	}

	
}
