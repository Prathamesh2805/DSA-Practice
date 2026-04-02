package Recursion;

public class RecursionSample {
    public static void main(String[] args) {
        printAscending(5);
    }

    public static void printAscending(int n) {

        if (n <= 0) {
            return;
        }
        printAscending(n - 1);
        System.out.println(n);

    }

}
