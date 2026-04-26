/*An electronics shop has announced a special discount on the purchase of Laptops as given below:
Category	Discount on Laptop
Up to ₹25,000	5.0%
₹25,001 - ₹50,000	7.5%
₹50,001 - ₹1,00,000	10.0%
More than ₹1,00,000	15.0%
Define a class Laptop described as follows:

Data members/instance variables:

name
price
dis
amt
Member Methods:

A parameterised constructor to initialize the data members
To accept the details (name of the customer and the price)
To compute the discount
To display the name, discount and amount to be paid after discount.
Write a main method to create an object of the class and call the member methods.*/
import java.io.*;
public class Laptop
{
    String name;
    double price;
    double dis;
    double amt;
    Laptop(String n,double p)
    {
        name = n;
        price = p;
        dis = 0.0;
        amt = 0.0;
    }
    public void calculate()
    {
        if(price<=25000)
        {
            dis = 0.05*price;
            amt = price - dis;
        }
        if(price>=25001&&price<=50000)
        {
            dis = 0.075*price;
            amt = price - dis;
        }
        if(price>=50001&&price<=100000)
        {
            dis = 0.1*price;
            amt = price-dis;
        }
        if(price>100000)
        {
            dis = 0.15*price;
            amt = price-dis;
        }
    }
    public void display()
    {
        System.out.println("Name:- "+name);
        System.out.println("Discount:- "+dis);
        System.out.println("Amount:- "+amt);
    }
    public static void main(String args[]) throws IOException
    {
        DataInputStream dis = new DataInputStream(System.in);
        System.out.println("Enter Your Name:- ");
        String name = dis.readLine();
        System.out.println("Enter Price of Laptop:- ");
        int price  = Integer.parseInt(dis.readLine());
        Laptop no = new Laptop(name,price);
        no.calculate();
        no.display();
    }
}