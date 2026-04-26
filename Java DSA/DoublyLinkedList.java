public class DoublyLinkedList {
    public void forwardTraversal(Node2 head){
        if(head==null)
            return;
        while(head!=null){
            System.out.print(head.data+" ");
            head = head.next;
        }
        System.out.println();
        /*Time Complexity: O(n), where n is the number of nodes in the linked list
        Auxiliary Space: O(1)*/
    }

    public int length(Node2 head){
        Node2 temp = head;
        int length = 0;
        while(temp!=null){
            length++;
            temp = temp.next;
        }
        return length;
        /*O(n) Time and O(1) Space*/
    }

    public Node2 insertAtFront(Node2 head, int newData){
        Node2 temp = new Node2(newData);
        temp.next = head;
        head.prev = temp;
        return temp;
        /*Time Complexity: O(1)
        Auxiliary Space: O(1)*/
    }

    public Node2 insertAtEnd(Node2 head, int newData){
        if(head==null) {
            head = new Node2(newData);
            return head;
        }
        while(head.next!=null)
            head = head.next;
        Node2 temp = new Node2(newData);
        head.next = temp;
        temp.prev = head;
        return head;
        /*Time Complexity: O(N), where N is the number of nodes in the linked list.
        Auxiliary Space: O(1)*/
    }

    public Node2 insertAtPosition(Node2 head, int pos, int new_data){
        if(head==null)
            return null;
        if(pos==1)
            return insertAtFront(head,new_data);
        pos--;
        while(head!=null){
            if(pos==1){
                Node2 temp = new Node2(new_data);
                temp.prev = head;
                temp.next = head.next;
                head.next =  temp;
                break;
            }
            head = head.next;
            pos--;
        }
        return head;
        /*Time Complexity: O(N), where N is the number of nodes in doubly linked list
        Auxiliary Space: O(1)*/
    }

    public Node2 delHead(Node2 head){
        head = head.next;
        head.prev = null;
        return head;
    }/*Time Complexity: O(1)
    Auxiliary Space: O(1)*/

    public Node2 delTail(Node2 head){
        while(head.next.next!=null)
            head = head.next;
        head.next = null;
        return head;
    }
    /*Time Complexity: O(N), where N is the number of nodes in the linked list
    Auxiliary Space: O(1)*/
    public Node2 delPos(Node2 head, int pos){
        if(head==null)
            return null;
        if(pos==1)
            return delHead(head);
        pos--;
        while(head.next.next!=null){
            if(pos==1){
                head.next = head.next.next;
                head.next.prev = head;
                pos=0;
                break;
            }
            head = head.next;
            pos--;
        }
        if(pos!=0)
            return delTail(head);
        return head;
        /*Time Complexity: O(n), where n is the number of nodes in the doubly linked list.
        Auxiliary Space: O(1)*/
    }

    public static void main(String[] args) {
        DoublyLinkedList dlist = new DoublyLinkedList();
        // Create a hardcoded doubly linked list:
        // 1 <-> 2 <-> 3
        Node2 head = new Node2(1);
        Node2 second = new Node2(2);
        Node2 third = new Node2(3);

        head.next = second;
        second.prev = head;
        second.next = third;
        third.prev = second;
        
        dlist.forwardTraversal(head);
        System.out.println(dlist.length(head));
        head = dlist.insertAtFront(head,0);
        dlist.forwardTraversal(head);
        dlist.insertAtEnd(head,4);
        dlist.forwardTraversal(head);
        dlist.insertAtPosition(head,3,3);
        dlist.insertAtPosition(head,7,5);
        dlist.forwardTraversal(head);
        head = dlist.delHead(head);
        dlist.forwardTraversal(head);
        dlist.delTail(head);
        dlist.forwardTraversal(head);
        dlist.delPos(head,2);
        dlist.forwardTraversal(head);
        dlist.delPos(head,4);
        dlist.forwardTraversal(head);
    }
}