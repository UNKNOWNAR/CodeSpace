import java.io.*;
public class Bank_Account
{
    String name;
    int accno;
    String typeoac;
    int balance;
    Bank_Account()
    {
        String name ="";
        int accno = 0;
        String typeoac ="";
        int balance = 0;
    }
    void Deposit() throws IOException
    {
        DataInputStream dis = new DataInputStream(System.in);
        System.out.println("Enter Your Name:- ");
        name = dis.readLine();
        System.out.println("Enter Account Number:- ");
        accno = Integer.parseInt(dis.readLine());
        System.out.println("Enter The Type Of Account:- ");
        typeoac = dis.readLine();
        System.out.println("Enter Amount To Deposit:- ");
        balance = Integer.parseInt(dis.readLine());
    }
    boolean Withdraw(int w)
    {
        if(w>balance)
            return true;
        else 
        {
            balance -=w;
            return false;
        }
    }
    void display()
    {
        System.out.println("NAME:- "+name);
        System.out.println("Account Number:- "+accno);
        System.out.println("Type Of Account:- "+typeoac);
        System.out.println("Balance:- "+balance);
    }
    public static void main(String args[]) throws IOException
    {
        DataInputStream dis = new DataInputStream(System.in);
        Bank_Account ob = new Bank_Account();
        ob.Deposit();
        System.out.println("Enter Amount To Be WithDrawn:- ");
        int w = Integer.parseInt(dis.readLine());
        if(ob.Withdraw(w))
        {
            System.out.println("Funds Insufficient");
            System.exit(0);
        }
        ob.display();
    }
}