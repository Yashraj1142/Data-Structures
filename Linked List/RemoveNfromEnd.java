class ListNode{
    int val;
    ListNode next;

    ListNode(int val){
        this.val = val;
        this.next = null;
    }
}

class RemoveNfromEndSolution{
    ListNode removeNthFromEnd(ListNode head, int n){
        ListNode temp = head;
        int count=0;

        while(temp != null){
            count++;
            temp = temp.next;
        }

        if(n==count){
            return head.next;
        }

        int end = count-n;

        ListNode newTemp = head;
        for(int i=1;i<end;i++){
            newTemp = newTemp.next;
        }
        newTemp.next = newTemp.next.next;

        return head;
    }
}

public class RemoveNfromEnd {
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
        RemoveNfromEndSolution o1 = new RemoveNfromEndSolution();
        ListNode newHead = o1.removeNthFromEnd(head, 2);

        while(newHead != null){
            System.out.print(newHead.val + " -> ");
            newHead = newHead.next;
        }
        System.out.println("null");
    }
}
