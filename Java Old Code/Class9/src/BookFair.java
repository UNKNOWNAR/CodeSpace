/*Define a class called BookFair with the following description:
Data Members	Purpose
String Bname	stores the name of the book
double price	stores the price of the book
Member Methods	Purpose
BookFair( )	Constructor to initialize data members
void input( )	To input and store the name and price of the book
void calculate( )To calculate the price after discount. Discount is calculated as per the table given below
void display( )	To display the name and price of the book after discount
Price	Discount
Less than or equal to ₹1000	2% of price
More than ₹1000 and less than or equal to ₹3000	10% of price
More than ₹3000	15% of price
Write a main method to create an object of the class and call the above member
methods.*/
import java.io.*;
public class BookFair
{
    String bname;
    double price;
    BookFair() 
    {
        bname = "";
        price = 0.0;
    }
    public void input() throws IOException
    {
        DataInputStream dis = new DataInputStream(System.in);        
        System.out.println("Enter Book Name:- ");
        bname  = dis.readLine();
        System.out.println("Enter Price of the Book:- ");
        price  = Integer.parseInt(dis.readLine());
    }
    public void calculate()
    {
        double dis=0.0;
        if(price<=1000)
        {
            dis = 0.02*price;
            price += dis;
        }
        if(price<1000&&price>=3000)
        {
            dis = 0.1*price;
            price += dis;
        }
        if(price<3000)
        {
            dis = 0.15*price;
            price += dis;
        }
    }  
    public void display() 
    {
        System.out.println("Book Name: " + bname);
        System.out.println("Price after discount: " + price);
    }
    public static void main(String args[]) throws IOException
    {        
        BookFair obj = new BookFair();
        obj.input();
        obj.calculate();
        obj.display();
    }
}