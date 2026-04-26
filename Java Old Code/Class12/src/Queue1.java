import java.util.*;
public class Queue1
{
    int Que[];
    int size;
    int front;
    int rear;
    Queue1(int mm)
    {
        size = mm;
        Que = new int[size];
        front = 0;
        rear = 0;
    }
    void addele(int val)//pop
    {
        if(rear>=size)
        {
            System.out.println("Overflows");
        }
        else
        {
            Que[rear] = val;
            rear++;
        }
    }
    int delete()//push
    {
        if(rear==front)
        {
            System.out.println("Underflows");
            return -9999;
        }
        front++;
        return Que[front-1];
    }
    void display()
    {
        if(front==rear)
            System.out.println("Underflows");
        else if(rear>=size)
            System.out.println("Overflows");
        else
        {
            System.out.println("Data:- ");
            for(int i=front;i<rear;i++)
            {
                System.out.println(Que[i]);
            }
        }
    }
    public static void main(String args[])
    {
        Queue1 ob = new Queue1(100);
        ob.delete();
        ob.addele(6);
        ob.addele(9);
        ob.addele(10);
        ob.addele(3);
        ob.display();
        ob.delete();
        ob.display();
    }
}