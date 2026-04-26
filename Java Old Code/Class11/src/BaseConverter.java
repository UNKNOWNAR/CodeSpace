import java.util.*;
public class BaseConverter
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int temp=d;
        //Binary
        int b = 0;
        int i =0;
        while(d!=0)
        {
            int rem = d%2;
            b+=Math.pow(10,i)*rem;
            d/=2;
            i++;
        }
        System.out.println("Binary:- "+b);
        //Octal
        d=temp;
        int o=0;
        i=0;
        while(d!=0)
        {
            int rem = d%8;
            o+=Math.pow(10,i)*rem;
            d/=8;
            i++;
        }
        System.out.println("Octal:- "+o);
        //HexaDecimal
        d=temp;
        String hd="";
        i=0;
        while(d!=0)
        {
            int rem = d%16;
            switch (rem) 
            {
                case 10:
                hd = "A"+hd;
                break;
                case 11:
                hd ="B"+hd;
                break;
                case 12:
                hd ="C"+hd;
                break;
                case 13:
                hd ="D"+hd;
                break;
                case 14:
                hd ="E"+hd;
                break;
                case 15:
                hd ="F"+hd;
                break;
                default:
                hd = Integer.toString(rem)+hd;
            }
            d/=16;
        }
        System.out.println("HexaDecimal:- "+hd);
        }
}