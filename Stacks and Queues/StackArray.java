class StackSol{
    private int[] stack;
    private int capacity;
    private int top;

    //constructor
    StackSol(int size){
        capacity = size;
        stack = new int[capacity];
        top = -1;
    }

    //push operation
    void push(int value){
        if(isFull()){
            System.out.println("Stack is full");
            return;
        }

        stack[++top] = value;
        System.out.println(value + " pushed");
    }

    //pop operation
    int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top--];
    }

    //peek operation
    int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }

    //check if full or not
    boolean isFull(){
        return top == capacity-1;
    }

    //check if empty
    boolean isEmpty(){
        return top == -1;
    }
}

public class StackArray {
    public static void main(String[] args) {
        StackSol s1 = new StackSol(5);

        //check if empty and full
        if(s1.isEmpty()) System.out.println("Stack is Empty");
        if(s1.isFull()) System.out.println("Stack is Full");

        //push elements
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        s1.push(5);

        //pop
        System.out.println("pop: " + s1.pop());

        //peek
        System.out.println("peek: " + s1.peek());
    }
}
