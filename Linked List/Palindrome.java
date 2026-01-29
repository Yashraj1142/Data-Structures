class ListNode{
    int val;
    ListNode next;

    ListNode(int val){
        this.val = val;
        this.next = null;
    }
}

class PalindromeSolution{
    boolean isPalindrome(ListNode head){
        //finding the middle node
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        //reversing the second half
        ListNode secondHead = reverseList(slow);
        ListNode firstHead = head;

        while(secondHead != null){
            if(firstHead.val != secondHead.val){
                return false;
            }
            firstHead = firstHead.next;
            secondHead = secondHead.next;
        }
        return true;
    }

    ListNode reverseList(ListNode head){
        ListNode curr = head;
        ListNode prev = null;

        while(curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}

public class Palindrome {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(2);
        ListNode fourth = new ListNode(1);

        head.next = second;
        second.next = third;
        third.next = fourth;

        //check palindrome
        PalindromeSolution p1 = new PalindromeSolution();
        System.out.println(p1.isPalindrome(head));
    }
}
