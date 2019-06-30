package com.javadesignpatterns.creational.factorymethod;

import com.javadesignpatterns.creational.factorymethod.message.Message;
import com.javadesignpatterns.creational.factorymethod.message.TextMessage;

/**
 * Provides implementation for creating Text messages
 */
public class TextMessageCreator extends MessageCreator {

	@Override
	public Message createMessage() {
		return new TextMessage();
	}



}
