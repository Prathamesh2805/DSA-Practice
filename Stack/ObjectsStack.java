package Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class ObjectsStack {
    private String name = "Unknown";
    private int id = 0;

    public ObjectsStack(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String toString() {
        return "Name: " + name + " and " + "Id: " + id;
    }

    public static void main(String[] args) {
        ObjectsStack obj1 = new ObjectsStack("Pandejii", 45);
        ObjectsStack obj2 = new ObjectsStack("Ganesh", 83);
        ObjectsStack obj3 = new ObjectsStack("Prathamesh", 10);
        ObjectsStack obj4 = new ObjectsStack("Nagesh", 37);

        Deque<ObjectsStack> objStack = new ArrayDeque<>();

        objStack.push(obj1);
        objStack.push(obj2);
        objStack.push(obj3);
        objStack.push(obj4);

        for (ObjectsStack o : objStack) {
            System.out.println(o);
        }
        System.out.println();

        System.out.println("Popping " + objStack.pop());
        System.out.println("Popping " + objStack.pop());
        System.out.println();

        for (ObjectsStack o : objStack) {
            System.out.println(o);
        }
        System.out.println();

        System.out.println("Currently "+ objStack.peek() +" is on top!");

    }
}
