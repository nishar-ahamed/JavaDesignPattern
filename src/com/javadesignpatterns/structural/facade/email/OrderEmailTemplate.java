package com.javadesignpatterns.structural.facade.email;

public class OrderEmailTemplate extends Template {

	@Override
	public String format(Object obj) {
		return "TEMPLATE";
	}

	
}
