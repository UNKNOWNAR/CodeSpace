import java.io.*;
public class Sale
{
    String title;String author;String publication; double price;
    void input(String t,String a,String p,double r)
    {
        title = t;
        author = a;
        publication = p;
        price = r;
    }  
    void display()
    {
        System.out.println("Title of the book:- "+title);
        System.out.println("Author of the book:- "+author);
        System.out.println("Publication of the book:- "+publication);
        System.out.println("Price of the book:- "+price);
    }  
}