package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FifthItem {

    // Method to get the fifth item from the list
    public String getFifthItem(List<String> inputs) {
        if (inputs.size() >= 5) {
            return "The fifth item in the list is: " + inputs.get(4);
        } else {
            return "There were not enough items to reach the fifth one.";
        }
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

        FifthItem fifthItem = new FifthItem();
        System.out.println(fifthItem.getFifthItem(inputs));

        scanner.close();
    }
}

