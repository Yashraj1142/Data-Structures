import java.util.*;

class MinStackSolution{
    Stack<Integer> stack;
    Stack<Integer> minStack;

    MinStackSolution(){
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    //push
    public void push(int val){
        stack.push(val);

        if(minStack.isEmpty()) minStack.push(val);
        else minStack.push(Math.min(val, minStack.peek()));
    }

    //top
    public int top(){
        return stack.peek();
    }

    //pop
    public void pop(){
        stack.pop();
        minStack.pop();
    }

    //min
    public int getMin() {
        return minStack.peek();
    }
}

public class MinStack {
    public static void main(String[] args) {
        MinStackSolution m1 = new MinStackSolution();

        //enter elements
        m1.push(3);
        m1.push(2);
        m1.push(1);
        m1.push(8);
        m1.push(4);

        //top
        System.out.println("top: " + m1.top());

        //pop
        m1.pop();

        //new top
        System.out.println("new top: " + m1.top());

        //min
        System.out.println("min: " + m1.getMin());
    }
}
