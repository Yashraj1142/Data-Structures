class ListNode{
    int val;
    ListNode next;

    ListNode(int val){
        this.val = val;
        this.next = null;
    }
}

class FindCycleSolution{
    boolean hasCycle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

            if(fast==slow){
                return true;
            }
        }

        return false;
    }
}

public class FindCycle {
    public static void main(String[] args) {
        ListNode head = new ListNode(4);
        ListNode second = new ListNode(5);
        ListNode third = new ListNode(1);
        ListNode fourth = new ListNode(9);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = second;

        //Find cycle
        FindCycleSolution f1 = new FindCycleSolution();
        System.out.println(f1.hasCycle(head));
    }
}
