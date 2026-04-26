/*Write a menu driven program to accept a number from the user and check whether it is a Prime number or an Automorphic number.
(a) Prime number: (A number is said to be prime, if it is only divisible by 1 and itself)
Example: 3,5,7,11
(b) Automorphic number: (Automorphic number is the number which is contained in the last digit(s) of its square.)
Example: 25 is an Automorphic number as its square is 625 and 25 is present as the last two digits.*/
import java.io.*;
public class SC17

{
    public static void main ( String args [])throws IOException
    { 
        DataInputStream dis = new DataInputStream(System.in);
        int a = 5;
        while(a==5)
        {
            System.out.println("ENTER 1 TO CHECK PRIME NUMBER OR NOT, 2 TO CHECK AUTOMORPHIC NUMBER OR NOT:- ");
            int x = Integer.parseInt(dis.readLine());
            System.out.println("ENTER A NUMBER:- ");
            int n = Integer.parseInt(dis.readLine());
        switch(x)
              {
               case 1:
               int i= 1,z=0,j=0;
                  while(n>=i)
                {
                       x = n % i;
                       j = (x==0)?j+1:j+0;
                       i++;
                }
                System.out.println((j>2)?n+" is not a prime number":n+" is a prime number");
                break;
                case 2:
                z = n * n;
                i  = n%100;
                j = z % 100;
                System.out.println((i==j)?n+" is a automorphic number":n+" is a amphoteric number");
                break;
                default: 
                System.out.println("WRONG INPUT");
            }
            System.out.println("Enter 5 to continue or press any text to escape:-");
            a = Integer.parseInt(dis.readLine());
        }
    }
}
