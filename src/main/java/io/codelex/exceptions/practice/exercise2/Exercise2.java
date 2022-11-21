package io.codelex.exceptions.practice.exercise2;

public class Exercise2 {
    public static void methodA() throws ArithmeticException {
        try {
            methodB();
        } catch (ArithmeticException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void methodB() throws ArithmeticException {
        try {
            methodC();
        } catch (ArithmeticException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void methodC() throws ArithmeticException {
        try {
            int statement = 1 / 0;
        } catch (ArithmeticException e) {
            e.printStackTrace();
            throw e;
        }
    }
}

