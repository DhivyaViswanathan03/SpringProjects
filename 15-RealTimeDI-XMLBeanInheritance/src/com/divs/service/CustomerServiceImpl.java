package com.divs.service;

import com.divs.bo.CustomerBo;
import com.divs.dao.ICustomerDao;
import com.divs.dto.CustomerDto;

public class CustomerServiceImpl implements ICustomerService {
	
	private ICustomerDao dao;
	
	static {
		System.out.println("CustomerServiceImpl is loading...");
	}
	
	public CustomerServiceImpl() {
		System.out.println("CustomerServiceImpl 0 param is called");
	}
	
	
	public CustomerServiceImpl(ICustomerDao dao) {
		this.dao = dao;
		System.out.println("CustomerServiceImpl 1 param is called....");
	}


	public ICustomerDao getDao() {
		return dao;
	}

	public void setDao(ICustomerDao dao) {
		this.dao = dao;
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
