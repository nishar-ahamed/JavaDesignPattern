package com.javadesignpattern.behavioral.interpreter;

public class IntToHexExpression implements Expression {

    private int i;

    public IntToHexExpression(String str) {
        this.i = Integer.parseInt(str.substring(0, str.indexOf(" ")));
    }

    @Override
    public String interpret(InterpreterContext ic) {
        return ic.getHexadecimalFormat(i);
    }

}

