import java.io.*;
public class Purchase extends Sale
{
    int noc;double amount;
    void accept(int x)
    {
        noc = x;
    }  
    void calculate()
    {
        amount = noc * price;
    } 
    void show()
    {
        System.out.println("Copies Purchased:- "+noc);
        System.out.println("Amount:- "+amount);
    }  
    public static void main(String args[]) throws IOException
    {        
        DataInputStream dis = new DataInputStream(System.in);
        System.out.println("Enter Number Of Copies:- ");
        int a = Integer.parseInt(dis.readLine());
        System.out.println("Enter Title of the book:-:- ");
        String b = dis.readLine();
        System.out.println("Enter Author of the book:- ");
        String c = dis.readLine();
        System.out.println("Enter Publication of the book:-:- ");
        String d = dis.readLine();
        System.out.println("Enter Price of the book:- ");
        double e = Double.parseDouble(dis.readLine());
        Purchase obj = new Purchase();
        obj.accept(a);
        obj.input(b,c,d,e);  
        obj.display();
        obj.calculate();
        obj.show();
    }
}