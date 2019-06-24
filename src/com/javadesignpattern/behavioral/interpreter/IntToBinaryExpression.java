package com.javadesignpattern.behavioral.interpreter;

public class IntToBinaryExpression implements Expression {

    private int i;

    public IntToBinaryExpression(String str) {
        this.i = Integer.parseInt(str.substring(0, str.indexOf(" ")));
    }

    @Override
    public String interpret(InterpreterContext ic) {
        return ic.getBinaryFormat(this.i);
    }

}

