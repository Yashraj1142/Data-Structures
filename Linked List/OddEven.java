class ListNode{
    int val;
    ListNode next;

    ListNode(int val){
        this.val = val;
        this.next = null;
    }
}

class OddEvenSolution{
    ListNode oddEvenList(ListNode head){
        if (head == null || head.next == null) return head;

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = head.next;

        while(even!=null && even.next!=null){
            odd.next = odd.next.next;
            even.next = even.next.next;

            odd = odd.next;
            even = even.next;
        }
        odd.next = evenHead;

        return head;
    }
}

public class OddEven {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        ListNode temp = head;
        while(temp!=null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
        
        //odd even list
        OddEvenSolution o1 = new OddEvenSolution();
        ListNode newHead = o1.oddEvenList(head);

        while(newHead != null){
            System.out.print(newHead.val + " -> ");
            newHead = newHead.next;
        }
        System.out.println("null");
    }
}
