package com.javadesignpatterns.behavioral.chainofresponsibility;

import java.time.LocalDate;

import com.javadesignpatterns.behavioral.chainofresponsibility.LeaveApplication.Type;

public class Client {

	public static void main(String[] args) {
	   LeaveApplication application = LeaveApplication.getBuilder().withType(Type.Sick)
			   	                      .from(LocalDate.now()).to(LocalDate.of(2019, 10, 28))
			   	                      .build();
	   System.out.println(application);
	   System.out.println("**************************************************");
	   LeaveApprover approver = createChain();
	   approver.processLeaveApplication(application);
	   System.out.println(application);
	}

	private static LeaveApprover createChain() {
		Director director = new Director(null);
		Manager manager = new Manager(director);
		ProjectLead lead = new ProjectLead(manager);
		return lead;
	}
	
}
