class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class TraversalMethods{
    //preorder traversal
    static void preorder(Node root){
        if(root == null) return;

        System.out.print(root.data + " ");

        preorder(root.left);
        preorder(root.right);
    }

    //postorder traversal
    static void postorder(Node root){
        if(root == null) return;

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    //inorder traversal
    static void inorder(Node root){
        if(root == null) return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
}

public class Traversal {
    public static void main(String[] args) {
        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        //preorder traversal
        System.out.print("Preorder Traversal: ");
        TraversalMethods.preorder(root);

        System.out.println();

        //postorder traversal
        System.out.print("Postorder Traversal: ");
        TraversalMethods.postorder(root);

        System.out.println();
        //inorder traversal
        System.out.print("Inorder Traversal: ");
        TraversalMethods.inorder(root);
    }
}
