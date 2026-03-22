import java.util.*;

class Node{
    int data;
    List<Node> child;

    Node(int data){
        this.data = data;
        this.child = new ArrayList<>();
    }
}

public class ImplementTree{
    public static void main(String[] args) {
        Node root = new Node(1);

        Node child1 = new Node(2);
        Node child2 = new Node(3);
        Node child3 = new Node(4);

        root.child.add(child1);
        root.child.add(child2);
        root.child.add(child3);

        child1.child.add(new Node(5));
        child1.child.add(new Node(6));

        child3.child.add(new Node(7));
    }
}