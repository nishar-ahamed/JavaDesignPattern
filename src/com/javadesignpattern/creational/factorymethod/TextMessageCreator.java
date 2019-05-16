package com.javadesignpattern.creational.factorymethod;

import com.javadesignpattern.creational.factorymethod.message.Message;
import com.javadesignpattern.creational.factorymethod.message.TextMessage;

/**
 * Provides implementation for creating Text messages
 */
public class TextMessageCreator extends MessageCreator {

	@Override
	public Message createMessage() {
		return new TextMessage();
	}



}
