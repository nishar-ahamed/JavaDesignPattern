package com.javadesignpatterns.structural.flyweight;

//Interface implemented by Flyweights
public interface ErrorMessage {
	//Get error message
	public String getText(String code);
}
