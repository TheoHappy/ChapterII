package com.company;

import java.util.Scanner;

public class SeparatingTheDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter one number consisting of five digits ");
        int number = input.nextInt();

        int n1 = number / 10000;
        int n2 = number % 10000 / 1000;
        int n3 = number % 1000 / 100;
        int n4 = number % 100 / 10;
        int n5 = number % 10;

        System.out.printf("%d %d %d %d %d ", n1, n2, n3,n4,n5);
    }
}
