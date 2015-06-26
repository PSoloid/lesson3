package com.hillel.psoloid;

public class Main {

    public static void main(String[] args) {

        double f = 10;
        double s = 25.5;
        double result;

        result = add(10,22.4);
        System.out.println(result);

        printHello();
        printMessage("Hello");

    }
    public static double add(int first, double second){
        double sum = first+second;
        return 1000000000;
    }
    public static double add(double first, int second){
        double sum = first+second;
        return sum;
    }
    public static void printHello(){
        System.out.println("Hello");
    }
    public static void printMessage(String message){
        System.out.println();
    }
}
