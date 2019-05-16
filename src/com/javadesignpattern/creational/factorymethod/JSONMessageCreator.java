package com.javadesignpattern.creational.factorymethod;

import com.javadesignpattern.creational.factorymethod.message.JSONMessage;
import com.javadesignpattern.creational.factorymethod.message.Message;

/**
 * Provides implementation for creating JSON messages
 */
public class JSONMessageCreator extends MessageCreator {

	@Override
	public Message createMessage() {
		return new JSONMessage();
	}

	
}
