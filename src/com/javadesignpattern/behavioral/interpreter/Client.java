package com.javadesignpattern.behavioral.interpreter;

public class Client {

    public InterpreterContext ic;

    public Client(InterpreterContext i) {
        this.ic = i;
    }

    public String interpret(String str) {
        Expression exp = null;
        //create rules for expressions
        if (str.contains("Hexadecimal")) {
            exp = new IntToHexExpression(str);
        } else if (str.contains("Binary")) {
            exp = new IntToBinaryExpression(str);
        } else return str;

        return exp.interpret(ic);
    }

    public static void main(String args[]) {
        String str1 = "28 in Binary";
        String str2 = "28 in Hexadecimal";

        Client ec = new Client(new InterpreterContext());
        System.out.println(str1 + " = " + ec.interpret(str1));
        System.out.println(str2 + " = " + ec.interpret(str2));

    }
}
