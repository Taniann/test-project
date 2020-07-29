package ua.tania.array;

public class SearchInsert {

    private static int searchInsert(int[] nums, int target) {
        int position = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                position = i;
                break;
            }
            if (nums[i] > target)
                continue;
            else
                position = i + 1;
        }
        return position;
    }

    private static int binarySearchInsert(int[] nums, int target) {
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target)
                return mid;
            if (nums[mid] > target)
                high = mid - 1;
            else
                low = mid + 1;
        }

        return low;
    }

    public static void main(String[] args) {
        Integer integer = 234;
        integer.toString();
        System.out.println(searchInsert(new int[] {1, 3, 5, 6}, 5));
        System.out.println(binarySearchInsert(new int[] {1, 3, 5, 6}, 5));
    }
}
