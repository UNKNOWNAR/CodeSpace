/*Write a program (using scanner class) to generate a pattern of a token in the form of a triangle or in the form of an inverted triangle depending upon the user's choice.
Sample Input/Output:
Enter your choice 1
*
* *
* * *
* * * *
* * * * *
Enter your choice 2
* * * * *
* * * *
* * *
* *
*
*/
import java.util.Scanner;
public class SC113
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Your Choise:- ");
        int n = in.nextInt();
        switch(n)
        {
            case 2:
            int nc = 5; 
            int nr=nc;
            while(nc>0)
            {
                System.out.println("");
                while(nr>0)
                {
                    System.out.print(" *");
                    nr--;
                }
                nc--;
                nr=nc;
            }
            break;
            case 1:
            nc = 5;
            nr=1;
            int i=1;
            while(nc>=nr)
            {
                System.out.println("");
                while(i<=nr)
                {
                    System.out.print(" *");
                    i++;
                }
                i=1;
                nr++;
            }
        }
    }
}
            