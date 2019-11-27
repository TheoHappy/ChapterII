package com.company;

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        int number1;
        int number2;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        number1 = input.nextInt();
        System.out.println("Enter second number: ");
        number2 = input.nextInt();
        if (number2 % number1 == 0)
            System.out.println("Result of division is " + number2 / number1);
        else System.out.printf("\n%d is not multiply of %d ", number1, number2);
    }

}
