import java.util.*;

class MyStack{
    Queue<Integer> q1;

    MyStack(){
        q1 = new LinkedList<>();
    }

    public void push(int x) {
        int s = q1.size();
        q1.add(x);

        for(int i=1;i<=s;i++){
            q1.add(q1.poll());
        }
    }

    public int pop() {
        return q1.poll();
    }

    public int top() {
        return q1.peek();
    }

    public boolean empty(){
        return q1.isEmpty();
    }
}



public class StackFromQueue {
    public static void main(String[] args) {
        MyStack s1 = new MyStack();

        //check if empty or not
        if(s1.empty()) System.out.println("Stack is empty");

        //enter elements
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        s1.push(5);

        //push
        System.out.println(s1.pop());

        //top
        System.out.println(s1.top());
    }
}
