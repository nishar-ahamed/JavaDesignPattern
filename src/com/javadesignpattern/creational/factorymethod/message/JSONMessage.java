package com.javadesignpattern.creational.factorymethod.message;

public class JSONMessage extends Message {

	@Override
	public String getContent() {
		return "{\"JSON]\":[]}";
	}
	
}
