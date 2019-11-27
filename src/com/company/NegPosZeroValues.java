package com.company;

import java.util.Scanner;

public class NegPosZeroValues {
    public static void main(String[] args) {
        int number1;
        int number2;
        int number3;
        int number4;
        int number5;

        int negCount = 0;
        int posCount = 0;
        int zeroCount = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number ");
        number1 = input.nextInt();
        System.out.println("Enter second number ");
        number2 = input.nextInt();
        System.out.println("Enter third number ");
        number3 = input.nextInt();
        System.out.println("Enter 4th number ");
        number4 = input.nextInt();
        System.out.println("Enter 5th number ");
        number5 = input.nextInt();

        if (number1 > 0) posCount++;
        else if (number1 < 0) negCount++;
        else zeroCount++;

        if (number2 > 0) posCount++;
        else if (number2 < 0) negCount++;
        else zeroCount++;

        if (number3 > 0) posCount++;
        else if (number3 < 0) negCount++;
        else zeroCount++;

        if (number4 > 0) posCount++;
        else if (number4 < 0) negCount++;
        else zeroCount++;

        if (number5 > 0) posCount++;
        else if (number5 < 0) negCount++;
        else zeroCount++;


        System.out.println("The number of negative numbers input is " + negCount);
        System.out.println("The number of positive numbers input is " + posCount);
        System.out.println("The number of zero input is " + zeroCount);

    }
}
