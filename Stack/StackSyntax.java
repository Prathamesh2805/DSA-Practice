package Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackSyntax {

    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.push(70);
        stack.push(80);
        stack.push(90);

        for (Integer a : stack) {
            System.out.print(a + " ");
        }

        int popedVar;
        System.out.println();
        popedVar = stack.pop();
        System.out.println(popedVar);
        popedVar = stack.pop();
        System.out.println(popedVar);
        popedVar = stack.pop();
        System.out.println(popedVar);
        popedVar = stack.pop();
        System.out.println(popedVar);

        System.out.println();

        for (Integer a : stack) {
            System.out.print(a + " ");
        }

        System.out.println();

        int peekVar = stack.peek();
        System.out.println(peekVar);

        popedVar = stack.pop();
        System.out.println(popedVar);
        popedVar = stack.pop();
        System.out.println(popedVar);

        peekVar = stack.peek();
        System.out.println(peekVar);
         for (Integer a : stack) {
            System.out.print(a + " ");
        }
    }

}
