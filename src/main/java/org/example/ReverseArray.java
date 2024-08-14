package org.example;

public class ReverseArray {

    // Method to reverse a 3-element array
    public int[] reverse3(int[] nums) {
        // Create a new array to store the reversed elements
        int[] result = new int[3];

        // Assign elements from the original array to the new array in reverse order
        result[0] = nums[2];
        result[1] = nums[1];
        result[2] = nums[0];

        // Return the new array with the elements reversed
        return result;
    }

    // Main method to execute the code
    public static void main(String[] args) {
        ReverseArray reverseArray = new ReverseArray();

        // Example array to reverse
        int[] nums = {1, 2, 3};

        // Call the reverse3 method and store the result
        int[] reversed = reverseArray.reverse3(nums);

        // Print the reversed array
        System.out.println("Reversed array: ");
        for (int num : reversed) {
            System.out.print(num + " ");
        }
    }
}
