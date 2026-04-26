import java.awt.*;

public class SinglyLinkedList {
    public void traverseList(Node head){//Time Complexity: O(n), where n is the number of nodes in the linked list.
        //Auxiliary Space: O(1)
        while(head!=null){
            System.out.print(head.data+" ");
            head = head.next;
        }
        System.out.println();
    }
    public void traverserecursiveList(Node head){//Time Complexity: O(n), where n is number of nodes in the linked list.
        //Auxiliary Space: O(n) because of recursive stack space.
        if(head==null){
            System.out.println();
            return;
        }
        else {
            System.out.print(head.data + " ");
            traverserecursiveList(head.next);
        }
    }

    public boolean searchKey(Node head, int key){//O(N) Time and O(1) Space; for recursive O(N) Time and O(N) Space
        if(head==null)
            return false;
        while(head!=null){
            if(head.data==key)
                return true;
            head = head.next;
        }
        return false;
    }

    public int countNodes(Node head){
        int countNodes=0;
        while(head!=null){
            countNodes++;
            head = head.next;
        }
        return countNodes;
        /*Time complexity: O(n), Where n is the size of the linked list
        Auxiliary Space: O(1), As constant extra space is used.*/
    }

    public Node insertAtFront(Node head, int new_data){
        Node temp = head;
        head = new Node(new_data);
        head.next = temp;
        return head;
        /*Time Complexity: O(1), We have a pointer to the head and we can directly attach a node and update the head pointer.
        So, the Time complexity of inserting a node at the head position is O(1).
        Auxiliary Space: O(1)*/
    }

    public void insertAtEnd(Node head, int new_data){
        while(head.next!=null)
            head = head.next;
        head.next = new Node(new_data);
        /*Time Complexity: O(N) where N is the length of the linked list
        Auxiliary Space: O(1)*/
    }

    public Node insertPos(Node head, int pos, int data){
        Node curr =  head;
        if (pos < 1)
            return head;
        else if(pos==1)
            return insertAtFront(head,data);
        pos--;
        while(head!=null) {
            if (pos == 1) {
                Node temp = new Node(data);
                temp.next = curr.next;
                curr.next = temp;
                break;
            }
            pos--;
            curr = curr.next;
        }
        return head;
        /*Time Complexity: O(n), where n is the number of nodes in the linked list.
        Auxiliary Space: O(1)*/
    }

    public Node deleteHead(Node head){
        if (head == null)
            return null;
        return head.next;
        /*Time Complexity: O(1), because the operation to delete the head node is performed in constant time.
        Space Complexity: O(1)*/
    }

    public Node deleteTail(Node head){
        if (head == null)
            return null;
        while(head.next.next!=null)
            head = head.next;
        head.next = null;
        return head;
        /*Time Complexity: O(n), traversal of the linked list till its end, so the time complexity required is O(n).
        Auxiliary Space: O(1)*/
    }

    public Node deleteNode(Node head, int position){
        if (head == null)
            return null;
        if (position == 1)
            return deleteHead(head);
        position--;
        while (head.next != null){
            if(position == 1){
                head.next = head.next.next;
                break;
            }
            position--;
            head = head.next;
        }
        return head;
        /*Time Complexity: O(n), where n is the number of nodes in the list
        Auxiliary Space: O(1)*/
    }

    public Node reverseList(Node head){
        Node prev =  null;
        Node curr = head;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
        /* O(n) Time and O(1) Space*/
    }

    public static void main(String[] args) {
        // Create a hard-coded linked list:
        // 10 -> 20 -> 30 -> 40
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        SinglyLinkedList list = new SinglyLinkedList();
        list.traverseList(head);
        list.traverserecursiveList(head);
        System.out.println(list.searchKey(head,20));
        System.out.println(list.searchKey(head,50));
        System.out.println(list.countNodes(head));
        head = list.insertAtFront(head,5);
        list.traverseList(head);
        list.insertAtEnd(head,50);
        list.traverserecursiveList(head);
        list.insertPos(head,7,60);
        list.traverserecursiveList(head);
        list.insertPos(head,3,15);
        list.traverseList(head);
        head = list.insertPos(head,1,0);
        list.traverserecursiveList(head);
        head = list.deleteHead(head);
        list.traverserecursiveList(head);
        list.deleteTail(head);
        list.traverserecursiveList(head);
        list.deleteNode(head,3);
        list.traverserecursiveList(head);
        head  = list.reverseList(head);
        list.traverserecursiveList(head);
    }
}
