/*Write a program to generate random numbers between 1 to N by using scanner class taking N from the console.*/
import java.util.Scanner;
public class SC119
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter N:- ");
        int n = in.nextInt();
        int r = (int)(Math.random() * n) + 1;
        System.out.print("Random Number = " + r);
    }
}