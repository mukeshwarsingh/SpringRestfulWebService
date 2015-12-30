package com.vst.trc.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vst.trc.dao.CustomerDAO;
import com.vst.trc.model.CustomerVO;
import com.vst.trc.service.RestfulService;

@Service
public class RestfulServiceImpl implements RestfulService{

	public RestfulServiceImpl(){
		
	}
	@Autowired
	private CustomerDAO customerDAO;
	
	public List<CustomerVO> getCustomers(){
		
		return new ArrayList<CustomerVO>(customerDAO.getCustomerMap().values());
	}
	public CustomerDAO getCustomerDAO() {
		return customerDAO;
	}
	public void setCustomerDAO(CustomerDAO customerDAO) {
		this.customerDAO = customerDAO;
	}
}

