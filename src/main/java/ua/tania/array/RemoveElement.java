package ua.tania.array;

public class RemoveElement {
    private static int removeElement(int[] nums, int val) {
        int length = nums.length;

        int i = 0;

        return length;
    }

    private static int removeElement1(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        System.out.println(removeElement1(new int[] {0, 1, 2, 2, 3, 0, 4, 2}, 2));
    }
}
