package Alpha;

public class MaxMinArray {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 7, 6};

        // Initialize max and min with the first element of the array
        int max = numbers[0];
        int min = numbers[0];

        // Iterate through the array to find max and min
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        // Print the results
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}
