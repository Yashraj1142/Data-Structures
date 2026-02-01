class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class RotateSolution {
    ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0)
            return head;

        // finding the length and tail of list
        ListNode tail = head;
        int length = 1;

        while (tail.next != null) {
            length++;
            tail = tail.next;
        }
        System.out.println("len = " + length);

        k = k % length;
        if (k == 0) {
            return head;
        }

        // join tail to head
        tail.next = head;

        // cut the list
        int cutLength = length - k;
        ListNode temp = head;

        for (int i = 1; i < cutLength; i++) {
            temp = temp.next;
        }
        head = temp.next;
        temp.next = null;

        return head;
    }
}

public class Rotate {
    public static void main(String[] args) {
        ListNode head = new ListNode(4);
        ListNode second = new ListNode(5);
        ListNode third = new ListNode(1);
        ListNode fourth = new ListNode(9);

        head.next = second;
        second.next = third;
        third.next = fourth;

        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.print("null");

        System.out.println();

        // Rotate the list
        RotateSolution r1 = new RotateSolution();
        ListNode newHead = r1.rotateRight(head, 2);

        while (newHead != null) {
            System.out.print(newHead.val + " -> ");
            newHead = newHead.next;
        }
        System.out.print("null");
    }
}
