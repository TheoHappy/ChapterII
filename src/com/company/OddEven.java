package com.company;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1;
        System.out.println("Enter integer ");
        number1 = input.nextInt();
        System.out.printf("Number %d is %s", number1, oddOrEven(number1));
    }

    public static String oddOrEven(int a) {
        if (a % 2 == 0) return "even";
        else return "odd";
    }
}
