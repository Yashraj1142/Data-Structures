class QueueSol{
    int[] queue;
    int capacity, size, front, rear;

    QueueSol(int capacity){
        this.capacity = capacity;
        queue = new int[capacity];
        size = 0;
        front = 0;
        rear = -1;
    }

    //Insert elements - enque
    void enque(int value){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }

        rear = (rear+1)%capacity;
        queue[rear] = value;
        size++;
        System.out.println(value + " inserted");
    }

    //Remove element - deque
    int deque(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }

        int removed = queue[front];
        front = (front+1)%capacity;
        size--;
        return removed;
    }

    //peek
    int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }

        return queue[front];
    }

    //check empty
    boolean isEmpty(){
        return size == 0;
    }
    
    //check full
    boolean isFull(){
        return size == capacity;
    }

    //display queue
    void display(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }

        System.out.println("Queue: ");
        for(int i=0;i<size;i++){
            System.out.print(queue[(front+i)%capacity] + " ");
        }
        System.out.println();
    }
}

public class QueueArray {
    public static void main(String[] args) {
        QueueSol q1 = new QueueSol(5);

        //check if full or empty
        if(q1.isEmpty()) System.out.println("Queue is empty");
        if(q1.isFull()) System.out.println("Queue is full");

        System.out.println();

        //enter elements
        q1.enque(1);
        q1.enque(2);
        q1.enque(3);
        q1.enque(4);
        q1.enque(5);

        //display queue
        q1.display();

        //remove element
        System.out.println("Removed: " + q1.deque());

        //peek
        System.out.println("Peek: " + q1.peek());
    }
}
