package com.ness.ms.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

import com.ness.ms.domain.Category;
import com.ness.ms.domain.Product;

@Service
@RefreshScope
public class ProductService {
	
	private static final Logger logger = LoggerFactory.getLogger(ProductService.class);
	
	@Value("${application.service.level}")
	String serviceLevel;
	
		
	public Product getProduct(Long prodId){
		return new Product(1l, "prodcut1", "prod1Des",11.11,22.22,new Category(1l,"Sports"));
	}
	
	public String getServiceLevel() {
		return serviceLevel;
	}

	public void setServiceLevel(String serviceLevel) {
		this.serviceLevel = serviceLevel;
	}

}
