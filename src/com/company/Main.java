/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Makiya Thomas
 */
package com.company;

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is the order amount? ");
        int amount = input.nextInt();

        System.out.print("What is the state? ");
        String state = input.nextLine();

        double subtotal = amount * 1.00;
        double tax = .55;
        double total = subtotal + tax;

        System.out.printf("The subtotal is $%.2f\n", subtotal);

        System.out.printf("The tax is $%.2f.\n", tax );
        System.out.printf("The total is $%.2f.\n", total );

    }
}
