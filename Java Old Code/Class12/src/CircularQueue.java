import java.util.*;
public class CircularQueue {
    int CQ[];
    int F,R,Size;
    CircularQueue(int n)
    {
        CQ = new int[n];
        Size=n;
        F=-1;
        R=-1;
    }
    void insert(int item)
    {
        if(F==0&&R==Size-1||F==R+1)
            System.out.println("Circular Queue Overflows");
        else
        {
            if(F== -1 && R== -1) {
                F = 0;
                R = 0;
            }
            else
                if(R==Size-1)
                    R=0;
                else
                    R++;
            CQ[R] = item;
        }
    }
    void delete()
    {
        if(F==-1 && R==-1)
            System.out.println("Circular Queue Underflows");
        else
        {
            if(F==Size-1)
                F=0;
            else {
                if (F == R) {
                    F = -1;
                    R = -1;
                } else {
                    F++;
                    System.out.println(CQ[F - 1] + " is deleted");
                }
            }
        }
    }
    void display()
    {
        if(F==-1 && R==-1)
            System.out.println("CIRCULAR QUEUE UNDERFLOWS");
        else
        {
            System.out.println("Elements in the Circular Queue");
            if(F<R)
            {
                for(int i=F;i<=R;i++)
                {
                    System.out.print(CQ[i]+" ");
                }
            }
            else
            {
                for(int i=F;i<=Size;i++)
                {
                    System.out.print(CQ[i]+" ");
                }
                for(int i=0;i<=R;i++)
                {
                    System.out.print(CQ[i] + " ");
                }
            }

            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = 5;
        System.out.println("Enter Size of the Queue");
        int size = sc.nextInt();
        CircularQueue ob = new CircularQueue(size);
        while(c==5)
        {
            System.out.println("Enter 1 Insert an Element in the Circular Queue\nEnter 2 to Delete a Element from the Cicrcular Queue");
            System.out.println("Enter 3 to Display the Queue\nEnter 4 to Discontinue");
            c = sc.nextInt();
            switch (c) {
                case 1: {
                    System.out.println("Enter Element in the Circular Queue");
                    int x = sc.nextInt();
                    ob.insert(x);
                    c=5;
                    break;
                }
                case 2: {
                    c=5;
                    ob.delete();
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