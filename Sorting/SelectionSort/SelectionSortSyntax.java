package Sorting.SelectionSort;

public class SelectionSortSyntax {
    public static void main(String[] args) {

        int[] nums = { 64, 25, 12, 22, 11, 90 };

        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                int temp = nums[i];
                nums[i] = nums[minIndex];
                nums[minIndex] = temp;
            }
        }

        for (int a : nums) {
            System.out.print(a + " ");
        }
    }
}
