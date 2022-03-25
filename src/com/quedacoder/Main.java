package com.quedacoder;

public class Main {

    public static void main(String[] args) {
	    String numberAsString = "2018a";
        System.out.println("numberAsString = " + numberAsString);

        int numberFromString = Integer.parseInt(numberAsString);
        System.out.println("numberAsInteger = " + numberFromString);

        numberAsString += 1;
        numberFromString += 1;

        System.out.println("numberAsString = " + numberAsString);
        System.out.println("numberAsInteger = " + numberFromString);

        double doubleNumber = Double.parseDouble("123.45");
        System.out.println("doubleNumber = " + doubleNumber);
    }
}
