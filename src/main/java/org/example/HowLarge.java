package org.example;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class HowLarge {

    // Method to return the size of the list
    public int getSize(List<String> inputs) {
        return inputs.size();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();

        System.out.println("Please enter strings, press enter with an empty string to stop.");

        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            inputs.add(input);
        }

        HowLarge howLarge = new HowLarge();
        System.out.println("The total amount of items in the list was: " + howLarge.getSize(inputs));
        scanner.close();
    }
}
