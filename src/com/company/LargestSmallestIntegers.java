package com.company;

import java.util.Scanner;

public class LargestSmallestIntegers {
    public static void main(String[] args) {
        int number1;
        int number2;
        int number3;
        int number4;
        int number5;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        number1 = input.nextInt();
        System.out.println("Enter second number: ");
        number2 = input.nextInt();
        System.out.println("Enter third number: ");
        number3 = input.nextInt();
        System.out.println("Enter 4th number: ");
        number4 = input.nextInt();
        System.out.println("Enter 5th number: ");
        number5 = input.nextInt();
        System.out.println("The smallest number is " + getMinimum(number1, number2, number3, number4, number5));
        System.out.println("The largest number is " + getMaximum(number1, number2, number3, number4, number5));

    }

    public static int getMinimum(int a, int b, int c, int d, int e) {
        return Math.min(Math.min(Math.min(Math.min(a, b), c), d), e);
    }

    public static int getMaximum(int a, int b, int c, int d, int e) {
        return Math.max(Math.max(Math.max(Math.max(a, b), c), d), e);
    }
}
