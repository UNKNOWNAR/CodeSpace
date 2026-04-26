import java.io.*;
public class HexaDecimal
{
    public static void main(String args[]) throws IOException
    {
        DataInputStream dis = new DataInputStream(System.in);
        System.out.println("Enter Decimal Number:- ");
        int dec = Integer.parseInt(dis.readLine());
        if(dec==0)
        {
            System.out.println(0);
            System.exit(0);
        }   
        String hd = "";
        int i = 0;
        while(dec!=0)
        {
            int hex = dec%16;
            char ch = ' ';
            switch(hex)
            {
                case 10:
                ch='A';
                break;
                case 11:
                ch='B';
                break;
                case 12:
                ch='C';
                break;
                case 13:
                ch='D';
                break;
                case 14:
                ch='E';
                break;
                case 15:
                ch='F';
                break;
                default:
                ch=(char)(hex+48);
                break;
            }
            hd = ch+hd;
            dec /=16;
            i++;
        }
        System.out.println(hd);
    }
}