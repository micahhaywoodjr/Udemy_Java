package com.micahhaywood;

public class Main {

    public static void main(String[] args) {

        byte myByte = 10;
        short myShort = 20;
        int myInt = 50;
        long myNewLongValue = 50000L + 10L * (myByte + myShort + myInt);
        short myShortTotal = (short) (1000 + 10*(myByte + myShort + myInt));
        System.out.println(myNewLongValue);
        System.out.println(myShortTotal);

    }
}
