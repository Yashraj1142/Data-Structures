import java.util.*;

class MyQueue{
    Stack<Integer> s1;
    Stack<Integer> s2;

    MyQueue(){
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    //push
    public void push(int x) {
        int i=0;
        int size = s1.size();

        while(i<size){
            s2.push(s1.pop());
            i++;
        }
        s1.push(x);

        i = 0;
        while(i<size){
            s1.push(s2.pop());
            i++;
        }
    }

    //pop
    public int pop() {
        return s1.pop();
    }

    //peek
    public int peek() {
        return s1.peek();
    }

    //check empty
    public boolean empty() {
        return s1.isEmpty();
    }
}

public class QueuefromStack {
    public static void main(String[] args) {
        MyQueue q1 = new MyQueue();

        //check empty
        if(q1.empty()) System.out.println("Queue is empty.");

        //push element
        q1.push(1);
        q1.push(2);
        q1.push(3);
        q1.push(4);
        q1.push(5);

        //pop
        System.out.println("pop: " + q1.pop());

        //peek
        System.out.println("peek: " + q1.peek());
    }
}
