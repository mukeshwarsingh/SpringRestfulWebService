package com.vst.trc.dao;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vst.trc.model.CustomerVO;

@Repository
public class CustomerDAO {

	private HashMap<String, CustomerVO> CustomerMap = new HashMap<String, CustomerVO>();

	@Autowired
	private CustomerVO customerVO;
	
	public CustomerDAO(){
		
	}
	public HashMap<String, CustomerVO> getCustomerMap() {

		CustomerMap.put(customerVO.getCustID(), customerVO);
		return CustomerMap;
	}

	public CustomerVO getCustomerVO() {
		return customerVO;
	}

	public void setCustomerVO(CustomerVO customerVO) {
		this.customerVO = customerVO;
	}

}
