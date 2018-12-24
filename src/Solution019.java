/**
 * Created by nanca on 12/24/2018.
 */
public class Solution019 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
//        ListNode node1 = head;
//        ListNode node2 = head;
//
//        for(int i = 0; i < n - 1; i++) {
//            node1 = node1.next;
//        }
//
//        while (node1.next != null) {
//            node1 = node1.next;
//            node2 = node2.next;
//        }
//
//        ListNode node3 = node2.next;
//        if (node3 != null) {
//            node2.val = node3.val;
//            node2.next = node3.next;
//        }
        ListNode node1 = new ListNode(0);
        node1.next = head;
        ListNode node2 = new ListNode(0);
        node2.next = head;

        for(int i = 0; i < n; i++) {
            node1 = node1.next;
        }

        while (node1.next != null) {
            node1 = node1.next;
            node2 = node2.next;
        }

        if (node2.next == head) {
            return node2.next.next;
        } else {
            node2.next = node2.next.next;
        }

        return head;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}



