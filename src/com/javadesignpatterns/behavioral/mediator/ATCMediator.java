package com.javadesignpatterns.behavioral.mediator;

public interface ATCMediator {
    public void sendMessage(String msg, AirCraft airCraft);
    void addAirCraft(AirCraft airCraft);
}
