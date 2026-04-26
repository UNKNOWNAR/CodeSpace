import java.io.*;
public class LCM
{
    public static void main(String args[]) throws IOException
    {
        DataInputStream dis = new DataInputStream(System.in);
        int n = Integer.parseInt(dis.readLine());
        int n1 = Integer.parseInt(dis.readLine());
        int lcm = 1;
        int max = (n>n1)?n:n1;
        for(int i=2;i<=max;i++)
        {
           int x = 0;
           while(n%i==0)
           {
               n =n/i;
               x++;
           }
           int y = 0;
           while(n1%i==0)
           {
               n1=n1/i;
               y++;
           }
           x = (x>y)?x:y;
           lcm *= Math.pow(i,x); 
           if(n==1&&n1==1)
           {
                System.out.println(lcm);
                System.exit(0);
            }
        }
        System.out.println(lcm);
    }
}