import java.util.*;
public class Queue {
    int Q[];
    int F,R,Size;
    Queue(int n)
    {
        Q = new int[n];
        Size=n;
        F=-1;
        R=-1;
    }
    void Queueinsert(int item)
    {
        if(R==Size-1)
            System.out.println("Queue Overflows");
        else
        {
            if(F== -1 && R== -1) {
                F = 0;
                R = 0;
            }
            else
                R++;
            Q[R] = item;
        }
    }
    void deletequeue()
    {
        if(F==-1 && R==-1)
            System.out.println("Queue Underflows");
        else
        {
            if(F==R)
            {
                F=-1;
                R=-1;
            }
            else {
                F++;
                System.out.println(Q[F - 1] + " is deleted");
            }
        }
    }
    void display()
    {
        if(F==-1 && R==-1)
            System.out.println("QUEUE UNDERFLOWS");
        else
        {
            System.out.println("Elements in the Queue");
            for(int i=F;i<=R;i++)
            {
                System.out.print(Q[i]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = 5;
        System.out.println("Enter Size of the Queue");
        int size = sc.nextInt();
        Queue ob = new Queue(size);
        while(c==5)
        {
            System.out.println("Enter 1 Insert an Element in the Queue\nEnter 2 to Delete a Element from the Queue");
            System.out.println("Enter 3 to Display the Queue\nEnter 4 to Discontinue");
            c = sc.nextInt();
            switch (c) {
                case 1: {
                    System.out.println("Enter Element in the Queue");
                    int x = sc.nextInt();
                    ob.Queueinsert(x);
                    c=5;
                    break;
                }
                case 2: {
                    c=5;
                    ob.deletequeue();
                    break;
                }
                case 3: {
                    c=5;
                    ob.display();
                    break;
                }
            }
        }
    }
}