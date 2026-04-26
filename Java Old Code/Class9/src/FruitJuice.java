/*Question 8
Define a class named FruitJuice with the following description:
Data Members    Purpose
int product_code    stores the product code number
String flavour  stores the flavour of the juice (e.g., orange, apple, etc.)
String pack_type    stores the type of packaging (e.g., tera-pack, PET bottle, etc.)
int pack_size   stores package size (e.g., 200 mL, 400 mL, etc.)
int product_price   stores the price of the product
Member Methods  Purpose
FruitJuice()    constructor to initialize integer data members to 0 and string data members to ""
void input()    to input and store the product code, flavour, pack type, pack size and product price
void discount() to reduce the product price by 10
void display()  to display the product code, flavour, pack type, pack size and product price*/
import java.io.*;
public class FruitJuice
{
    int product_code;
    String flavour;
    String pack_type;
    int pack_size;
    int product_size;
    int product_price;
    FruitJuice()
    {
        product_size = 0;
        flavour =  "";
        pack_type = "";
        pack_size = 0;
        product_size = 0;
        product_price = 0;
    }
    public void input() throws IOException
    {
        DataInputStream dis = new DataInputStream(System.in);        
        System.out.println("Enter Product Code Number:- ");
        product_code  = Integer.parseInt(dis.readLine());
        System.out.println("Enter Flavour Of The Juice:- ");
        flavour  = dis.readLine();
        System.out.println("Enter Type  Of Packaging:- ");
        pack_type  = dis.readLine();
        System.out.println("Enter Pack Size:- ");
        pack_size  = Integer.parseInt(dis.readLine());
        System.out.println("Enter Product Price:- ");
        product_price  = Integer.parseInt(dis.readLine());
    }
    public void discount()
    {
        product_price -= 10;
    }
    public void display()
    {
        System.out.println("Product Code:- "+product_code);
        System.out.println("Flavour:- "+flavour);
        System.out.println("Pack Type:- "+pack_type);
        System.out.println("Pack Size:- "+pack_size);
        System.out.println("Product Code:- "+product_price);
    }
    public static void main(String args[]) throws IOException
    {        
        FruitJuice obj = new FruitJuice();
        obj.input();
        obj.discount();
        obj.display();
    }
}