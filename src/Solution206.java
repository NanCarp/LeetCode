import entity.ListNode;

public class Solution206 {

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode prev = head;
        ListNode curr = head.next;

        while (curr != null) {
            prev.next = curr.next;
            curr.next = dummy.next;
            dummy.next = curr;
            curr = prev.next;
        }

        return dummy.next;
    }

}
