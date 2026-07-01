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
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> map = new HashSet<Integer>();
        for(int num:nums)
            map.add(num);
        ListNode temp= new ListNode(0,head);
        head = temp;
        while(temp.next!=null){
            if(map.contains(temp.next.val))
                temp.next = temp.next.next;
            else
                temp = temp.next;
        }
        return head.next;
    }
}
