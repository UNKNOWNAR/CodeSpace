import java.io.*;
class Number
{
    public static void main(String args[]) throws IOException
    {
        DataInputStream dis =new DataInputStream(System.in);
        System.out.println("Number:-");
        double a = Double.parseDouble(dis.readLine());
        double b = a % 100;
        double c = a % 10;
        double d = (b-c)/10;
        double e = (a - b )/100;
        double f = c*100+d*10+e;
        System.out.println("Reversd number:-" + f);
    }
}
        
        
        
        
        
        
        
        
