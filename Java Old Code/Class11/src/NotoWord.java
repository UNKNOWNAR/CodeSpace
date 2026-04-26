import java.io.*;
public class NotoWord
{
    public static void main(String args[]) throws IOException
    {
        DataInputStream dis = new DataInputStream(System.in);
        int n = Integer.parseInt(dis.readLine());
        String name = "";
        while(n>0)
        {
            switch(n%10)
            {
                case 0:
                name = "zero "+name;
                break;
                case 1:
                name = "one "+name;
                break;
                case 2:
                name = "two "+name;
                break;
                case 3:
                name = "three "+name;
                break;
                case 4:
                name = "four "+name;
                break;
                case 5:
                name = "five "+name;
                break;
                case 6:
                name = "six "+name;
                break;
                case 7:
                name = "seven "+name;
                break;
                case 8:
                name = "eight "+name;
                break;
                case 9:
                name = "nine "+name;
                break;
            }
            n/=10;
        }
        System.out.println(name); 
    }
} 