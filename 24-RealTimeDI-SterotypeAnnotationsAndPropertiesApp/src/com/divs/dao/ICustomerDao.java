package com.divs.dao;

import com.divs.bo.CustomerBo;

public interface ICustomerDao {
	
	public int save(CustomerBo bo) throws Exception;

}
