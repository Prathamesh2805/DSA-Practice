package Recursion;

public class FibonacciRecursion {
    public static void main(String[] args) {
        System.out.println(Fibonacci(5));
        
    }
    public static int Fibonacci(int n){
        if (n == 0 || n == 1){
            return n;
        }
        return Fibonacci(n-1) + Fibonacci(n-2);
    }
}
