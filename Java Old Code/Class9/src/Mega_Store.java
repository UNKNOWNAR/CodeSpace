/*A Mega Shop has different floors which display varieties of dresses as mentioned
below:

Ground floor : Kids Wear
First floor : Ladies Wear
Second floor : Designer Sarees
Third Floor : Men's Wear
The user enters floor number and gets the information regarding different items of the Mega shop. After shopping, the customer pays the amount at the billing counter and the shopkeeper prints the bill in the given format:

Name of the Shop: City Mart
Total Amount:
Visit Again!!

Write a program to perform the above task as per the user's choice.*/
import java.io.*;
public class Mega_Store
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("Press 1 to go to Kid Wear , Press  2 to go to Ladies Wear, Press  3 to go to Designer Sarees, Press 4 to go to Men's Wear");
       int a = Integer.parseInt(dis.readLine());
       double amount=0;
       switch(a)
       {
           case 1: 
           System.out.println("Enter Your Amount in Kids Wear");
           amount = Double.parseDouble(dis.readLine());
           break;
           case 2: 
           System.out.println("Enter Your Amount in Ladies Wear");
           amount = Double.parseDouble(dis.readLine());
           break;
           case 3: 
           System.out.println("Enter Your Amount in Designer Saree");
           amount = Double.parseDouble(dis.readLine());
           break;
           case 4: 
           System.out.println("Enter Your Amount in Men's Wear");
           amount = Double.parseDouble(dis.readLine());
           break;
           default:
           System.out.println("WRONG INPUT");
        }
       System.out.println(" Name of the Shop : City Mart");
       System.out.println("Total Amount : " + amount);
       System.out.println(" Visit Again!!!");
    }
}