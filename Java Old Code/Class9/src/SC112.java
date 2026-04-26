/*Write a program to accept a set of 50 integers. Find and print the greatest and the smallest numbers by using scanner class method.*/
import java.util.Scanner;
public class SC112
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Number:- ");
        int g = in.nextInt();
        int i = 1;
        int s = g;
        while(i<5)
        {
            System.out.println("Enter a Number:- ");
            int s1 = in.nextInt();
            g = (s1>g)?s1:g;
            s = (s<s1)?s:s1;
            i++;
        }
        System.out.println("THE GREATEST NUMBER IS:- "+g);
        System.out.println("THE SMALLEST NUMBER IS:- "+s);
    }
}
            