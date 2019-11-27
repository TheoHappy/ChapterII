package com.company;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        int number1 = scanner.nextInt();
        System.out.println("Enter second number:");
        int number2 = scanner.nextInt();
        System.out.println("Sum is " + sum(number1, number2));
        System.out.println("Product is " + product(number1, number2));
        System.out.println("Mod is " + mod(number1, number2));
        System.out.println("Division is " + division(number1, number2));

    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int product(int a, int b) {
        return a * b;
    }

    public static int mod(int a, int b) {
        return a % b;
    }

    public static int division(int a, int b) {
        return a / b;
    }
}
