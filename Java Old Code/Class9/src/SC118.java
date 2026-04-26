/*Write a program by using scanner class to accept a set of positive and negative numbers randomly. Print all the negative numbers first and then all the positive numbers without changing the order of the numbers.*/
import java.util.Scanner;
public class SC118
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number of Numbers:- ");
        int n = in.nextInt();
        String wordn="";
        String wordp="";
        while(n!=0)
        {
            System.out.println("Enter a Number:- ");
            int n1 = in.nextInt();
            if(n1<0)
            {
                wordn += n1+",";
            }
            else
            {
                wordp += n1+",";
            }
            n--;
        }
        System.out.print(wordn);
        System.out.print(wordp); 
    }
}
            
            
        