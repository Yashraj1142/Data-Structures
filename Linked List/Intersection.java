class ListNode{
    int val;
    ListNode next;

    ListNode(int val){
        this.val = val;
        this.next = null;
    }
}

class IntersectionSolution{
    ListNode getIntersectionNode(ListNode headA, ListNode headB){
        if(headA == null || headB == null) return null;
        
        ListNode ptr1 = headA;
        ListNode ptr2 = headB;

        while(ptr1 != ptr2){
            ptr1 = (ptr1==null)? headB: ptr1.next;
            ptr2 = (ptr2==null)? headA: ptr2.next;
        }

        return ptr1;
    }
}

public class Intersection {
    public static void main(String[] args) {
        //creating list one
        ListNode headA = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(7);
        ListNode fifth = new ListNode(8);
        ListNode sixth = new ListNode(9);

        headA.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        
        //creating list two
        ListNode headB = new ListNode(4);
        ListNode secondB = new ListNode(5);
        ListNode thirdB = new ListNode(6);

        headB.next = secondB;
        secondB.next = thirdB;
        thirdB.next = third;

        //printing both the lists
        ListNode temp1 = headA;
        while(temp1 != null){
            System.out.print(temp1.val + " -> ");
            temp1 = temp1.next;
        }
        System.out.print("null");

        System.out.println();

        ListNode temp2 = headB;
        while(temp2 != null){
            System.out.print(temp2.val + " -> ");
            temp2 = temp2.next;
        }
        System.out.print("null");

        System.out.println();

        // finding intersection
        IntersectionSolution i1 = new IntersectionSolution();
        System.out.println(i1.getIntersectionNode(headA, headB).val);
    }
}
