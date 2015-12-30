package com.vst.trc.handler.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vst.trc.handler.ApplicationServiceHandler;
import com.vst.trc.model.CustomerVO;
import com.vst.trc.service.RestfulService;

@Component
public class ApplicationServiceHandlerImpl implements ApplicationServiceHandler {

	public ApplicationServiceHandlerImpl(){
		
	}
	@Autowired
	RestfulService restfulService;
	@Override
	public List<CustomerVO> getCustomers() {
				
		return restfulService.getCustomers();
	}
	public RestfulService getRestfulService() {
		return restfulService;
	}
	public void setRestfulService(RestfulService restfulService) {
		this.restfulService = restfulService;
	}

	
}
