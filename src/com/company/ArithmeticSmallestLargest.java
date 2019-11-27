package com.company;

import java.util.Scanner;

public class ArithmeticSmallestLargest {
    public static void main(String[] args) {
        int number1;
        int number2;
        int number3;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        number1 = input.nextInt();
        System.out.println("Enter second number: ");
        number2 = input.nextInt();
        System.out.println("Enter third number: ");
        number3 = input.nextInt();

        System.out.println("Sum is " + sum(number1, number2, number3));
        System.out.println("Average is " + average(number1,number2,number3));
        System.out.println("Smallest is " + getMin(number1,number2,number3));
        System.out.println("Largest is " + getMax(number1,number2,number3));

    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static int average(int a, int b, int c) {
        return (a + b + c) / 3;
    }

    public static int product(int a, int b, int c) {
        return a * b * c;
    }

    public static int getMin(int a, int b, int c) {
        return Math.min(Math.min(a, b), c);
    }

    public static int getMax(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }
}
