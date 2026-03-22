import java.util.*;

class Node{
    int data;
    List<Node> child;

    Node(int data){
        this.data = data;
        this.child = new ArrayList<>();
    }
}

class Height{
    static int findHeight(Node root){
        if(root==null) return 0;

        int maxHeight = 0;

        for(Node children:root.child){
            int childHeight = findHeight(children);
            maxHeight = Math.max(maxHeight, childHeight);
        }

        return maxHeight + 1;
    }
}

public class HeightTree {
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

        //finding height
        int height = Height.findHeight(root);

        System.out.println("The height is: " + height);
    }
}
