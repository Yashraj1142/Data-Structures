class ListNode{
    int val;
    ListNode next;

    ListNode(int val){
        this.val  = val;
        this.next = null;
    }
}

class DeleteNodeSolution{
    void deleteNode(ListNode node){
        node.val = node.next.val;
        node.next = node.next.next;
    }
}

public class DeleteNode {
    public static void main(String[] args) {
        ListNode head = new ListNode(4);
        ListNode second = new ListNode(5);
        ListNode third = new ListNode(1);
        ListNode fourth = new ListNode(9);

        head.next = second;
        second.next = third;
        third.next = fourth;

        ListNode temp = head;
        while(temp!=null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");

        //delete node
        DeleteNodeSolution d1 = new DeleteNodeSolution();
        d1.deleteNode(second);

        ListNode temp2 = head;
        while(temp2!=null){
            System.out.print(temp2.val + " -> ");
            temp2 = temp2.next;
        }
        System.out.println("null");
    }
}
