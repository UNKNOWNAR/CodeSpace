/*Using a switch case statement, write a menu driven program to convert a given temperature from Fahrenheit to Celsius and vice-versa. For an incorrect choice, an appropriate message should be displayed.
Hint: c = 5/9*(f-32) and f=1.8*c+32*/
  import java.io.*;
public class TemperatureConverter
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("Type 1 to convert temertaure from Fahrenheit to Celsius and Type 2 to convert from Celsius to Fahrenheit");
       int a = Integer.parseInt(dis.readLine()); 
       switch(a)
       {
           case 1: System.out.println("Enter temperature in Celcius");
           double c = Double.parseDouble(dis.readLine());
           c = 1.8*c+32;
           System.out.println("Temperature in Fahrenite"+c);
           break;
           case 2: System.out.println("Enter temperature in Fahrrenite");
           double f = Double.parseDouble(dis.readLine());
           f = ((f-32)*5)/9;
           System.out.println("Temperature in Celcius"+f);
           break;
           default: 
           System.out.println("WRONG INPUT");
        }
    }
}
           