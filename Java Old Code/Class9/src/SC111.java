/*Using scanner class, write a program to input temperatures recorded in different cities in °F (Fahrenheit). Convert and print each temperature in °C (Celsius). The program terminates when user enters a non-numeric character.*/
import java.util.Scanner;
public class SC111
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        boolean b = true;
        while(b==true)
        {
            System.out.println("ENTER TEMPERATURE IN FARHENITE");
            b = in.hasNextDouble();
            if(!b)
                break;
            double f = in.nextDouble();
            double c = 0;
            if(b==true)
            {
                c = ((5*f)-160)/9;
            }
            System.out.println("TEMPERATURE IN CELCIUS:- "+c);
            f=0;
        }
    }
}