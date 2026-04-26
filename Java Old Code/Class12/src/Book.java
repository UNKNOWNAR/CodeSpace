import java.util.*;
public class Book
{
    String name[];
    int point;
    int max;
    Book(int cap)
    {
        max = cap;
        name = new String[max];
        point = -1;
    }
    void tell()//pop
    {
        if(point==-1)
            System.out.println("Shelf Empty");
        else
            System.out.println("Book Popped:- "+name[point--]);
    }
    void add(String s)//push
    {
        point++;
        if(point==max) {
            System.out.println("Shelf Full");
            point--;
        }
        else
            name[point] = s;
    }
    void display()
    {
        if(point==-1)
            System.out.println("Stack Underflows");
        else if(point>=max)
            System.out.println("Stack Overflows");
        else
        {
            System.out.println("Name of Books:- ");
            for(int i=0;i<=point;i++)
            {
                System.out.println(name[i]);
            }
        }
    }
    public static void main(String args[])
    {
        Book bookworm = new Book(10);
        bookworm.tell();
        bookworm.add("APC");
        bookworm.add("Nootan Physics");
        bookworm.add("ML Agarwaal");
        bookworm.tell();
        bookworm.display();
        bookworm.tell();
    }
}