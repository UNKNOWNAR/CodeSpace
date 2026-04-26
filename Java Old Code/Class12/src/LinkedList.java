import java.util.*;
public class LinkedList
{
    int data;
    LinkedList link;

    LinkedList() {
        data = 0;
        link = null;
    }

    void create() {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Data");
        this.data = sc.nextInt();
        System.out.println("Enter Number of Nodes to be Created:");
        n = sc.nextInt();
        LinkedList temp;
        LinkedList ptr = this;
        for (int i = 0; i < n; i++) {
            temp = new LinkedList();
            System.out.println("Enter Next Data:");
            temp.data = sc.nextInt();
            temp.link = null;
            ptr.link = temp;
            ptr = ptr.link;
        }
    }
    void insertbeg(LinkedList start, int x) {
        // INSERTING A NODE IN THE BEGINNING
        LinkedList temp = new LinkedList();
        // Entering data in the new node
        temp.data = x;
        // Setting the new node's link to the current start node
        temp.link = start;
        // Updating the start node to be the new node
        start = temp;
    }

    void insertmid(LinkedList start,int x, int position) {
        // INSERTING A NODE IN THE MIDDLE OF THE LINKED LIST
        LinkedList temp = new LinkedList();
        // Entering data in the new node
        temp.data = x;
        temp.link=null;
        LinkedList ptr = start;
        int count = 1;
        while (count < position) {
            ptr = ptr.link;
            count++;
        }
        temp.link = ptr.link;
        ptr.link = temp;
        ptr = null;
    }
    
    void insertend(LinkedList start,int x) {
        // INSERTING A NODE AT THE END OF THE LINKED LIST
        LinkedList temp = new LinkedList();
        // Entering data in the new node
        temp.data = x;
        temp.link = null;
        LinkedList ptr = start;
        while (ptr.link != null) {
            ptr = ptr.link;
        }
        ptr.link = temp;
    }
    void delete(LinkedList start,int position) {
        // DELETING A NODE FROM THE LINKED LIST STRUCTURE
        LinkedList ptr = start;
        LinkedList ptr1 = ptr;
        int count = 1;
        while (count < position) {
            ptr = ptr.link;
            count++;
        }
        ptr1.link=ptr.link;
        ptr.link=null;
        ptr=ptr1=null;
    }
    void display() {
        // DISPLAYING THE ELEMENTS OF THE LINKED LIST
        LinkedList ptr = this;
        while (ptr != null) {
            System.out.println(ptr.data);
            ptr = ptr.link;
        }
    }
    public static void main(String args[]) {
        int k, p, ch;
        Scanner in = new Scanner(System.in);
        LinkedList first = new LinkedList();
        do {
            System.out.println("Main Menu:");
            System.out.println("1.Create a linked list structure");
            System.out.println("2.Insert a node at the beginning");
            System.out.println("3.Insert a node at the end");
            System.out.println("4.Insert a node at the middle");
            System.out.println("5.Delete a node");
            System.out.println("6.Display the list");
            System.out.println("7.Exit");
            System.out.println("Enter your choice");
            ch = in.nextInt();

            switch (ch) {
                case 1:
                    first.create();
                    break;
                case 2:
                    System.out.println("Enter data for the new node");
                    k = in.nextInt();
                    first.insertbeg(first,k);
                    break;
                case 3:
                    System.out.println("Enter data for the new node");
                    k = in.nextInt();
                    first.insertend(first,k);
                    break;
                case 4:
                    System.out.println("Enter data for the new node");
                    k = in.nextInt();
                    System.out.println("Enter node number after which node is to be inserted");
                    p = in.nextInt();
                    first.insertmid(first,k, p);
                    break;
                case 5:
                    System.out.println("Enter node number to be deleted");
                    k = in.nextInt();
                    first.delete(first,k);
                    break;
                case 6:
                    System.out.println("Data in the linked list are: ");
                    first.display();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (ch != 7);
    }
}