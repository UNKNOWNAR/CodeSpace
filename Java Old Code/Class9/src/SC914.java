/*Write programs to find the sum of the given series:
(a) 1 + (1/2!) + (1/3!) + (1/4!) + .......... + (1/n!)
(b) 1 + (1+2) + (1+2+3) + .......... + (1+2+3+ ...... + n)
(c) 1 + (1*2) + (1*2*3) + .......... + (1*2*3* ...... * n)
(d) 1 + 1 / (1+2) + 1 / (1+2+3) + .......... + 1 / (1+2+3+.....+n)
(e) (1/2) + (1/3) + (1/5) + (1/7) + (1/11) + .......... + (1/29)*/
import java.io.*;
public class SC914
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("ENTER THE VALUE OF n:-");
       int n = Integer.parseInt(dis.readLine());
       int i = 1;
       double sum=0;
       while(i<=n)
       {
           double b=1,a=i;
           while (a>0)
           {
               b = b* a;
               a--;
            }
           sum += 1/b;
           i++;
        }
       System.out.println(sum); 
       i = 1;
       int j=1;
       sum = 0;
       while(i!=n+1)
       {
           j=1;
           while(j<=i)
           {
               sum += j;
               j++;
          }
          i++;
       }
       System.out.println(sum); 
       i = 1;
       j=1;
       int p= 1;
       sum = 0;
       while(i!=n+1)
       {
           j=1;p=1;
           while(j<=i)
           {
               p *= j;
               j++;
          }
          sum += p;
          i++;
       }
       System.out.println(sum); 
       i = 1;
       j=1;
       sum = 0;
       while(i!=n+1)
       {
           j=1;
           double sum1 = 0;
           while(j<=i)
           {
               sum1 += j;
               j++;
          }
          sum += (1/sum1);
          i++;
       }
       System.out.println(sum); 
       int z = 1;
       sum=0;
       while(z<=29)
           {
               double a = z;
               i = 1;
               int x=0;j=0;
               while(a>=i)
               {
                   x = (int)a % i;
                   j = (x==0)?j+1:j+0;
                   i++;
               }
               z++;
               if (j==2)
               {
                   sum += (1/a);
                } 
            }
       System.out.println(sum); 
    }
}    