/*Data members — int r,t ; float si,amt;
Member Methods:
void accept(int x, int y) — to initialize r=x,t=y,amt=0
void compute() — to find simple interest and amount
si = (balance * r * t) / 100;
a = a + si;
void display() — to print account number, balance, interest and amount
main() function need not to be used*/
import java.io.*;
public class Calculate extends Account
{
    int r,t;
    float si,amt;
    Calculate(int a,int b)
    {
        super(a,b);
    }
    void accept(int x,int y)
    {
        r = x;
        t=y;
        amt = balance;
        si = 0.0f;
    }  
    void compute()
    {
        si = (balance*r*t)/100.f;
        System.out.println(r+" "+t);
        amt += si;
    }  
    void display()
    {
        System.out.println("Account Number:- "+acno);
        System.out.println("Balance:- "+balance);
        System.out.println("Interest:- "+si);
        System.out.println("Amount:- "+amt);
    }  
    public static void main(String args[]) throws IOException
    {        
        DataInputStream dis = new DataInputStream(System.in);
        System.out.println("Enter Account Number:- ");
        int a = Integer.parseInt(dis.readLine());
        System.out.println("Enter Balance:- ");
        int b = Integer.parseInt(dis.readLine());
        System.out.println("Enter Withdraw:- ");
        int c = Integer.parseInt(dis.readLine());
        System.out.println("Enter Deposit:- ");
        int d = Integer.parseInt(dis.readLine());
        System.out.println("Enter Rate Of Interest:- ");
        int x = Integer.parseInt(dis.readLine());
        System.out.println("Enter Time:- ");
        int y = Integer.parseInt(dis.readLine());
        Calculate obj = new Calculate(a,b);
        obj.accept(x,y);
        obj.compute();  
        obj.display();
        obj.withdraw(c);
        obj.display();
        obj.deposit(d);
        obj.display();
    }
}