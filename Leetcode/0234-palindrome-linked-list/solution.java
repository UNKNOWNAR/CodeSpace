class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;

        // Step 1: Find middle of the list
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: If odd number of nodes, move slow one step ahead
        if (fast != null) slow = slow.next;

        // Step 3: Reverse second half
        ListNode rev = null;
        while (slow != null) {
            ListNode next = slow.next;
            slow.next = rev;
            rev = slow;
            slow = next;
        }

        // Step 4: Compare both halves
        while (rev != null) {
            if (rev.val != head.val) return false;
            rev = rev.next;
            head = head.next;
        }

        return true;
    }
}
