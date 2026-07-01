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
    public int pairSum(ListNode head) {
        int n = 0;
        List<Integer> val = new ArrayList<>();
        while(head!=null){
            val.add(head.val);
            head = head.next;
            n++;
        }
        int ans = 0;
        for(int i=0;i<n/2;i++)
            ans = Math.max(ans,val.get(i)+val.get(n-i-1));
        return ans;
    }
}
