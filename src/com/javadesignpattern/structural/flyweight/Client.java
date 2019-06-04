package com.javadesignpattern.structural.flyweight;

import com.javadesignpattern.structural.flyweight.ErrorMessageFactory.ErrorType;

public class Client {

	public static void main(String[] args) {
		//intrinsic state
		SystemErrorMessage msg1 = ErrorMessageFactory.getInstance().getError(ErrorType.GenericSystemError);
		System.out.println(msg1.getText("4056"));

		//extrinsic state
		UserBannedErrorMessage msg2 = ErrorMessageFactory.getInstance().getUserBannedMessage("1202");
		System.out.println(msg2.getText(null));
	}

}
