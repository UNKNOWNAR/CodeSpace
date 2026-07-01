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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;
        while(curr!=null){
            ListNode curr1 = curr.next;
            while(curr1!=null&&curr.val == curr1.val)
                curr1 = curr1.next;
            if(curr1==null||curr.val!=curr1.val)
                curr.next = curr1;
            curr = curr.next;
        }
        return head;
    }
}
