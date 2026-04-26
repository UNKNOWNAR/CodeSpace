import java.util.*;
public class LinkList {
    int data;
    LinkList next;
    LinkList()
    {
        data = 0;
        next = null;
    }
    void create()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of nodes: ");
        int n = sc.nextInt();
        System.out.println("Enter thr first data");
        this.data = sc.nextInt();
        LinkList currentNode;
        LinkList previousNode = this;
        for (int i = 1; i < n; i++) {
            currentNode = new LinkList();
            System.out.println("Enter "+(i+1)+" Data");
            currentNode.data = sc.nextInt();
            previousNode.next = currentNode;
            previousNode = previousNode.next;
        }
    }
    void insertnodeatbeg(LinkList start,int x)
    {
        LinkList CurrNode = new LinkList();
        CurrNode.data = x;
        CurrNode.next = start;
        start = CurrNode;
    }
    void insertnodeatanyposition(LinkList start,int x,int n)
    {
        LinkList TargetNode = new LinkList();
        TargetNode.data = x;
        TargetNode.next = null;
        LinkList CurrNode = start;
        for(int i=0;i<n-1;i++)
        {
            CurrNode = CurrNode.next;
        }
        TargetNode.next = CurrNode.next;
        CurrNode.next = TargetNode;
    }
    void insertnodeatend(LinkList start,int x)
    {
        LinkList TargetNode = new LinkList();
        TargetNode.data = x;
        TargetNode.next = null;
        LinkList CurrNode = start;
        while (CurrNode.next!=null)
        {
            CurrNode = CurrNode.next;
        }
        CurrNode.next = TargetNode;
    }
    void delete(LinkList start,int n)
    {
        LinkList TargetNode = start;
        for(int i=0;i<n-2;i++)
        {
            TargetNode = TargetNode.next;
        }
        LinkList temp = TargetNode.next;
        TargetNode.next = temp.next;
        temp.next = null;
    }
    boolean search(int number)
    {
        LinkList temp = this;
        while(temp!=null)
        {
            if(temp.data==number)
                return true;
            temp = temp.next;
        }
        return false;
    }
    void merge(LinkList first1)
    {
        LinkList temp = this;
        while(temp.next!=null)
        {
            temp = temp.next;
        }
        temp.next = first1;
    }
    void split(LinkList first1,int number)
    {
        LinkList temp = this;
        for(int i=0;i<number-1;i++)
        {
            temp = temp.next;
        }
        first1.data = temp.next.data;
        first1.next = temp.next.next;
        temp.next = null;
    }
    LinkList reverseList() {
        LinkList newfirst = new LinkList();
        LinkList CurrNode = newfirst;
        do
        {
            LinkList temp = this;
            while(temp.next.next!=null) {
                temp = temp.next;
            }
            CurrNode.data = temp.next.data;
            CurrNode.next = temp;
            CurrNode = CurrNode.next;
            temp.next = null;
        }while(this.next.next!=null);
        CurrNode.next = this;
        this.next = null;
        return newfirst;
    }
    void display()
    {
        LinkList temp = this;
        while(temp!=null)
        {
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        int input,number,choice;
        Scanner sc = new Scanner(System.in);
        LinkList first = new LinkList();
        do {
            System.out.println("1.Create a linked list Structure");
            System.out.println("2.Insert a list in the beginning");
            System.out.println("3.Insert a list at the end");
            System.out.println("4.Insert a list at the middle");
            System.out.println("5.Delete a list");
            System.out.println("6.To Search an Element");
            System.out.println("7.To merge two link list");
            System.out.println("8.To split the list");
            System.out.println("9.To Reverse the List");
            System.out.println("10.Display the list");
            System.out.println("11.Exit");
            System.out.println("Enter your choice");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    first.create();
                    break;
                case 2:
                    System.out.println("Enter data for the new node");
                    input = sc.nextInt();
                    first.insertnodeatbeg(first, input);
                    break;
                case 3:
                    System.out.println("Enter data for the next node");
                    input = sc.nextInt();
                    first.insertnodeatend(first, input);
                    break;
                case 4:
                    System.out.println("Enter data for the new node");
                    input = sc.nextInt();
                    System.out.println("Enter node number after which is to be inserted");
                    number = sc.nextInt();
                    first.insertnodeatanyposition(first, input, number);
                    break;
                case 5:
                    System.out.println("Enter node number to be deleted");
                    input = sc.nextInt();
                    first.delete(first, input);
                    break;
                case 6:
                    System.out.println("Enter the number you want to search in the link list");
                    number = sc.nextInt();
                    if(first.search(number))
                        System.out.println("Search Successful "+number+" is present in the link list");
                    else
                        System.out.println("Search Unsuccessful "+number+" is not present in the link list");
                    break;
                case 7:
                    LinkList first1 = new LinkList();
                    first1.create();
                    first.merge(first1);
                    break;
                case 8:
                    LinkList first2 = new LinkList();
                    System.out.println("Enter node number to split");
                    number = sc.nextInt();
                    first.split(first2,number);
                    System.out.println("Splitted Link List:- ");
                    first.display();
                    first2.display();
                    break;
                case 9:
                    System.out.println("Link list Reversed:-");
                    first = first.reverseList();
                    first.display();
                    break;

                case 10:
                    System.out.println("Data in the linked list are:");
                    first.display();
            }
        }
        while (choice!=11);
    }
}