package Queue;

public class LinearQueue {
    private int [] arr;
    private int rear;
    private int front;

    public LinearQueue(){
        int [] arr = new int [10];
        rear = -1;
        front = 0;
    }
    public static void main() {

    }

    public void enqueue(int x){

    }

     public int dequeue(){

        return 1;
    }

    public boolean isFull(){
        if (rear == arr.length){
            return true;
        }
        return false;
    }

    public boolean isEmpty(){
        if (rear > front)
            return true;
        else return false;
    }
}
