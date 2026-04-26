import java.util.*;
public class Cinema
{
    public static void main(String args[])
    {
        Scanner sc  = new Scanner(System.in);
        int i = sc.nextInt(); 
        int n = 0;
        int a=  0;
        String name[] = new String[i];
        int nt[] = new int[i];
        i--;
        int temp = i+1;
        while(i>=0)
        {
            System.out.println("Name:- ");
            String s = sc.next();
            System.out.println("NOT:- ");
            int t = sc.nextInt();
            a+=t;
            int f=0;
            for(int j=0;j<n;j++)
            {
                if(s.equals(name[i]))
                {
                   nt[j] += t;  
                   f++;
                }     
            }
            if(f==0)
            {
                name[i] = s;
                nt[i]=t;
                i--;
            }
        }
        System.out.println("No Of Tickets Sold "+a);
        for(int j=0;j<temp;j++)
            System.out.println(name[j]+" bought "+nt[j]+" tickets");    
    }
}