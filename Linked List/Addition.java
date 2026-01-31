class ListNode{
    int val;
    ListNode next;

    ListNode(int val){
        this.val = val;
        this.next = null;
    }
}

class AdditionSolution{
    ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        int carry = 0;

        while(l1!=null || l2!=null || carry!=0){
            int sum = carry;

            if(l1!=null){
                sum += l1.val;
                l1 = l1.next;
            }

            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum/10;
            curr.next = new ListNode(sum%10);
            curr = curr.next;
        }

        return dummy.next;
    }
}

public class Addition {
    public static void main(String[] args) {
        //list A
        ListNode headA = new ListNode(2);
        ListNode secA = new ListNode(4);
        ListNode thirdA = new ListNode(3);

        headA.next = secA;
        secA.next = thirdA;

        //list B
        ListNode headB = new ListNode(5);
        ListNode secB = new ListNode(6);
        ListNode thirdB = new ListNode(4);

        headB.next = secB;
        secB.next = thirdB;

        //print both lists
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

        //Addition
        AdditionSolution a1 = new AdditionSolution();

        ListNode newHead = a1.addTwoNumbers(headA, headB);
        while(newHead != null){
            System.out.print(newHead.val + " -> ");
            newHead = newHead.next;
        }
        System.out.print("null");
    }
}
