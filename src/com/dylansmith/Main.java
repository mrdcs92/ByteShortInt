package com.dylansmith;

public class Main {

    public static void main(String[] args) {

        // int has a width of 32
        int myMinValue = 34;

        // byte has a width of 8
        byte myByteValue = -128;
        byte myNewBtyeVaule = (byte) (myByteValue / 2); // you have to cast first to divide my integer

        // short has a width of 16
        short myShortValue = 32767;

        // long has a width of 64
        long myLongValue = 100L;

        // denote floats with f afterwards
        float myFloatValue = 5.25f;
        myFloatValue = myFloatValue / 2f;

        // denote double with d afterwards
        double myDoubleValue = 5.25d;
        myDoubleValue = myDoubleValue / 2d;

        // char can only be one character
        char myChar = 'S';

        boolean myBoolean = false;

        String myString = "Hello";

        int topScore = 81;
        if ((topScore < 82) && (topScore > 1)) { // && is and
            System.out.println("hello");
        }

        if ((topScore < 82) || (topScore > 1)) { // || is or
            System.out.println("hello");
        }

        boolean isTrue = true;
        boolean wasTrue = isTrue ? true : false;

        // functions
        public static void printHello() {
            System.out.println("Hello");
        }
    }
}
