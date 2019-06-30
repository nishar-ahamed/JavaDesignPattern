package com.javadesignpatterns.creational.factorymethod;

import com.javadesignpatterns.creational.factorymethod.message.JSONMessage;
import com.javadesignpatterns.creational.factorymethod.message.Message;

/**
 * Provides implementation for creating JSON messages
 */
public class JSONMessageCreator extends MessageCreator {

	@Override
	public Message createMessage() {
		return new JSONMessage();
	}

	
}
