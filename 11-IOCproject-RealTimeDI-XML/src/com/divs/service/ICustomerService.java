package com.divs.service;

import com.divs.dto.CustomerDto;

public interface ICustomerService {

	public String calculateSimpleInterest(CustomerDto dto)throws Exception;
}
