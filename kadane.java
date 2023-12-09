package Alpha;

public class kadane {
    public static void maxSubArray(int numbers[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        boolean allNegative = true;
        int smallestNegative = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            cs = cs + numbers[i];

            // Check if all numbers are negative
            if (numbers[i] >= 0) {
                allNegative = false;
            } else {
                smallestNegative = Math.max(smallestNegative, numbers[i]);
            }

            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }

        // If all numbers are negative, return the smallest negative number
        if (allNegative) {
            System.out.println(smallestNegative);
        }

        System.out.println(ms);
    }

    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10};
        maxSubArray(numbers);
    }
}
