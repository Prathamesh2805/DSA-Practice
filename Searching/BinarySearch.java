package Searching;

public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = { 4, 6, 3, 7, 9, 3, 8, 2, 1, 5 };
        int key = 7;

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left*(left - right) / 2;
            if (key == arr[mid]) {

            }
        }
    }
}
