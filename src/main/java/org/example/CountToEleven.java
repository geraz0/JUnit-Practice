package org.example;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountToEleven {

    public List<Integer> countToEleven(int num) {
        List<Integer> result = new ArrayList<>();
        int end = 11;
        for (int i = num; i <= end; i++) {
            result.add(i);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        do {
            System.out.println("Enter a number less than 11.");
            num = input.nextInt();
            if (num >= 11) {
                System.out.println("The number is greater than or equal to 11. Please try again.");
            }
        } while (num >= 11);

        CountToEleven counter = new CountToEleven();
        List<Integer> result = counter.countToEleven(num);
        result.forEach(System.out::println);
    }
}

