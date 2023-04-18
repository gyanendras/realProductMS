package com.ness.ms.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ness.ms.domain.Order;
import com.ness.ms.domain.Product;
import com.ness.ms.service.ProductService;

import io.micrometer.observation.annotation.Observed;
import jakarta.servlet.http.HttpServletRequest;

@Observed
@RestController
public class ProductController {
	
	private static final Logger logger = LoggerFactory.getLogger(ProductController.class);
	
	@Autowired 
	ProductService prodService ;
	
	@Value("${server.port}")
	String port;
	
	@GetMapping("/product/info")
	String getInfo(HttpServletRequest req) {
		return req.getRemoteHost()+ " " +req.getRequestURI() + " "+port+" "+prodService.getServiceLevel();
	}
	
		
	@GetMapping("/product/{id}")
	Product getProduct(@PathVariable Long id){
		logger.debug("Default order to be created");
		return prodService.getProduct(id);
	}
	
	
}
