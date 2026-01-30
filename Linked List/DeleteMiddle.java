class ListNode{
    int val;
    ListNode next;

    ListNode(int val){
        this.val = val;
        this.next = null;
    }
}

class DeleteMiddleSolution{
    ListNode deleteMiddle(ListNode head){
        if(head==null || head.next==null) return null;
        
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = slow;

        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = slow.next;

        return head;
    }
}

public class DeleteMiddle {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(3);
        ListNode third = new ListNode(4);
        ListNode fourth = new ListNode(7);
        ListNode fifth = new ListNode(1);
        ListNode sixth = new ListNode(2);
        ListNode seventh = new ListNode(6);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = seventh;

        ListNode temp = head;
        while(temp!=null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
        
        //odd even list
        DeleteMiddleSolution o1 = new DeleteMiddleSolution();
        ListNode newHead = o1.deleteMiddle(head);

        while(newHead != null){
            System.out.print(newHead.val + " -> ");
            newHead = newHead.next;
        }
        System.out.println("null");
    }
}
