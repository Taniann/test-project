package ua.tania.array;

public class FindNumbersWithEvenNumberOfDigits {

    public static int findNumbers(int[] nums) {

        int counter = 0;

        for (int i = 0; i < nums.length; i++) {
            int localCounter = 0;

            while (nums[i] > 0) {
                nums[i] = nums[i] / 10;
                localCounter++;
            }

            if (localCounter % 2 == 0) {
                counter++;
            }
        }
        return counter;

    }

    public static void main(String[] args) {
        System.out.println(findNumbers(new int[] {12, 345, 2, 6, 7896, 23, 45556, 1234}));
    }
}
