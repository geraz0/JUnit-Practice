package org.example;

import java.util.Scanner;

public class PositiveNumbers {

    // Method to check if a number is positive
    public String checkNumber(int num) {
        if (num < 0) {
            return "Number must be a positive number";
        } else {
            return "Number is " + num;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 1;

        while (num != 0) {
            System.out.println("Enter a number:");
            num = input.nextInt();
            System.out.println(new PositiveNumbers().checkNumber(num));
        }
        input.close();
    }
}