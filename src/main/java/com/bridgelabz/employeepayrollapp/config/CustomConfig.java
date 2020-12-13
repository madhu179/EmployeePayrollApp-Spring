package com.bridgelabz.employeepayrollapp.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.bridgelabz.employeepayrollapp.interceptor.CustomInterceptor;

@Component
public class CustomConfig extends WebMvcConfigurerAdapter{
	
	@Autowired
	CustomInterceptor customInterceptor;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(customInterceptor);
	}

}
