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
    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null)
            return head;
        ListNode ans = new ListNode();
        ListNode prev = ans;
        ans.next = head;
        while(prev.next!=null&&prev.next.next!=null){
            ListNode curr = prev.next;
            ListNode next = curr.next;
            prev.next = next;
            curr.next = next.next;
            next.next = curr;
            prev = curr;            
        }
        return ans.next;
    }
}
