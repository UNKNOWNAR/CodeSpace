/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(
        ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode ln = new ListNode();
        ListNode ret = ln;
        while (ln != null) {
            if (!(l1 == null && l2 == null && carry == 0)) {
                int calc = (carry + ((l1 == null ? (0) : l1.val) + (l2 == null ? (0) : l2.val)));
                ln.val = calc % 10;
                carry = (int) Math.floor(calc / 10);
                l1 = (l1 == null) ? null : l1.next;
                l2 = (l2 == null) ? null : l2.next;
                if (!(l1 == null && l2 == null && carry == 0)) {
                    ln.next = new ListNode();
                }
            }
            ln = ln.next;
        }
        return ret;
    }
}
