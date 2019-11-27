package com.company;

import java.util.Scanner;

public class ComparingIntegers {
    public static void main(String[] args) {
        int number1;
        int number2;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        number1 = input.nextInt();
        System.out.println("Enter second number: ");
        number2 = input.nextInt();

        if (number1 > number2) {
            System.out.printf("\n%d is larger", number1);
        }
        if (number2 > number1) {
            System.out.printf("\n%d is larger", number2);
        }
        if (number1 == number2) {
            System.out.println("These numbers are equal");
        }
    }


}

