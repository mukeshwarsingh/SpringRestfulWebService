package com.vst.trc.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vst.trc.handler.ApplicationServiceHandler;
import com.vst.trc.model.CustomerVO;

@RestController
public class RestfulControler {

	Logger LOGGER = LoggerFactory.getLogger(RestfulControler.class);
		
	@Autowired
	ApplicationServiceHandler serviceHandler;
	
	@RequestMapping(value="/customers", method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public List<CustomerVO> getCustomerDetails(){
				
		return serviceHandler.getCustomers();
		
	}
	
}
