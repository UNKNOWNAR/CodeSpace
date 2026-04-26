import java.io.*;
public class Check extends Number
{
    int fact  = 1;
    int revum = 0;
    void find() throws IOException
    {
        int a = getn();
        while(a!=1)
        {
            fact*=a;
            a--;
        }
        System.out.println("Factorial of  n is:- "+fact);
    }
    void palindrome()
    {
        int a  = getn();
        while(a!=0)
        {
            int j = a%10;
            a=a/10;
            revum = revum*10+j;
        }
        if(getn()==revum)
            System.out.println(getn()+" is a palindrome number");
        else
            System.out.println(getn()+" is not a palindrome number");
    }  
    public static void main(String args[]) throws IOException
    {        
        Check obj = new Check();
        obj.input();
        obj.display();
        obj.find();
        obj.palindrome();        
    }
}
 