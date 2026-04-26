/*Write the programs in Java to display the following patterns:
(a)
1
2 1
3 2 1
4 3 2 1
5 4 3 2 1
(b)
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
(c)
5 4 3 2 1
5 4 3 2
5 4 3
5 4
5
(d)
1 3 5 7 9
1 3 5 7
1 3 5
1 3
1
(e)
5
5 4
5 4 3
5 4 3 2
5 4 3 2 1
(f)
1 2 3 4 5
2 3 4 5 
3 4 5
4 5
5
(g)
9 9 9 9 9
7 7 7 7 7
5 5 5 5 5
3 3 3 3 3
1 1 1 1 1
(h)
9
7 9
5 7 9
3 5 7 9
1 3 5 7 9
(i)
9
9 7
9 7 5
9 7 5 3
9 7 5 3 1
(j)
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15*/
import java.io.*;
public class SC915
{
    public static void main ( String args [])
    {
        int n = 1;
        while(n<=5)
        {
            int a = n;
            while(a!=0)
            {
                System.out.print(a+" ");
                a--;
            }
            n++;
            System.out.println("");
        }
        System.out.println("");
        n = 5;
        while(n!=0)
        {
            int a = 1;
            while(a!=n+1)
            {
                System.out.print(a+" ");
                a++;
            }
            n--;
            System.out.println("");
        }
        System.out.println("");
        n = 5;
        while(n!=0)
        {
            int a = n;
            while(a!=0)
            {
                System.out.print(a+" ");
                a--;
            }
            n--;
            System.out.println("");
        }
        System.out.println("");
        n = 9;
        while(n!=-1)
        {
            int a = 1;
            while(a<=n)
            {
                System.out.print(a+" ");
                a+=2;
            }
            n=n-2;
            System.out.println("");
        }
        System.out.println("");
        n = 5;
        while(n>=0)
        {
            int a = 5,i=2;
            while(a!=n)
            {
                System.out.print(a+" ");
                a--;
            }
            n--;
            System.out.println("");
        }
        System.out.println("");
        n=5;
        int i=1;
        while(n>=0)
        {
            int a = i;
            while(a<=5)
            {
                System.out.print(a+" ");
                a++;
            }
            n--;
            i++;
            System.out.println("");
        }
        System.out.println("");
        n = 9;
        while(n>=1)
        {
            int a = 1;
            while(a<=5)
            {
                System.out.print(n+" ");
                a++;
            }
            n=n-2;
            System.out.println("");
        }
        System.out.println("");
        n = 9;
        while(n>=1)
        {
            int a = n;
            while(a<=9)
            {
                System.out.print(a+" ");
                a=a+2;
            }
            n=n-2;
            System.out.println("");
        }
        System.out.println("");
        n = 9;
        while(n>=1)
        {
            int a = 9;
            while(a>=n)
            {
                System.out.print(a+" ");
                a=a-2;
            }
            n=n-2;
            System.out.println("");
        }
        System.out.println("");
        n = 1;
        int a=1;
        while(n<=5)
        {
            i=1;
            while(i<=n)
            {
                System.out.print(a+" ");
                i++;
                a++;
            }
            n++;
            System.out.println("");
        }
        System.out.println("");
    }
    }
