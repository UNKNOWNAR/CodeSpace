public class ListNode
{
  int val;
  ListNode next;
  ListNode() {}
  ListNode(int val)
  {
    this.val = val;
  }
  ListNode(int val, ListNode next)
  {
    this.val = val;
    this.next = next;
  }
  void addValues(int arr[])
  {
    ListNode itr = this;
      for (int j : arr) {
            itr.next = new ListNode(j);
            itr = itr.next;
      }
  }
  long display()
  {
    long num1 = 0,counter = 0;
    ListNode itr = this;
    while (itr != null) {
      num1 += itr.val * (long)Math.pow(10, counter++);
      itr = itr.next;
    }
    return num1;
  }
}
