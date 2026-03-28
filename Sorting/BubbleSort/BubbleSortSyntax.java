package Sorting.BubbleSort;

public class BubbleSortSyntax {
    public static void main(String[] args) {
        int[] arr = { 4, 6, 3, 7, 9, 3, 8, 2, 1, 5 };

        int n = arr.length;
        boolean swapped = false;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
        
        for(int i: arr){
            System.out.print(i + " ");
        }
    }
}
