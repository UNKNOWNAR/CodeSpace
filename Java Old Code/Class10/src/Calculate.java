import java.util.*;
public class Calculate
{
   public static void main(String args[])
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("ENTER A NUMBER:- ");
       int no = sc.nextInt();
       Calculate ob = new Calculate(no);      
       ob.display();
   }
   int num;
   int f;
   int rev;
   Calculate(int n)
   {
      num =n;
      f =0;
      rev=0;
   }
   int prime()
   {
       for(int i = 1;i<=num;i++)
       {
           f = (num%i==0)?f+1:f;
       }
       if(f==2)
            return 1;
       else
            return 0;
   }
   int reverse()
   {
       int i = 0;
       int n = num;
       int a = 0;
       while(n>0)
       {
           int b = n % 10;
           rev = rev*10+b;
           n = n / 10;
       }
       return rev;
   }
   void display()
   {
       if(this.prime()==1&&this.reverse()==num)
            System.out.println(num+" is a prime palindrome");
       else
            System.out.println(num+" is not a prime palindrome");
   }
}
   