import java.util.*;
public class NumberConversion
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number:- ");
        long n  = sc.nextLong();
        long nc = 0;
        long i =0;
        while(n!=0)  
        {
            nc += Math.pow(10,i)*(n%2);
            n/=2;
            i++;
        }
        System.out.println("Binary:- "+nc);
         i = 0;
        while(nc!=0)  
        {
            n += Math.pow(2,i)*(nc%10);
            nc/=10;
            i++;
        }
        i=0;
        while(n!=0)
        {
            nc += Math.pow(10,i)*(n%8);
            n/=8;
            i++;
        }
        System.out.println("Octal:- "+nc);
        i = 0;
        while(nc!=0)
        {
            n+= Math.pow(8,i)*(nc%10);
            nc/=10;
            i++;
        }
        i=0;
        String hex = "";
        while(n!=0)
        {
            int a = (int)n%16;
            switch(a)
            {
                case 10:
                hex = 'A'+hex;
                break;
                case 11:
                hex = 'B'+hex;
                break;
                case 12:
                hex = 'C'+hex;
                break;
                case 13:
                hex = 'D'+hex;
                break;
                case 14:
                hex = 'E'+hex;
                break;
                case 15:
                hex = 'F'+hex;
                break;
                default:
                hex = Integer.toString(a)+hex;
            }
            n/=16;
        }
        System.out.println("HexaDecimal:- "+hex);
    }
}