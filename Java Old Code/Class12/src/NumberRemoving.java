/*Consider the sequence of natural numbers.
1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 ………………..
Removing every second number produces the sequence
1, 3, 5, 7, 9, 13, 15 ………………..
This process continues indefinitely by removing the fourth, fifth…. and so on, till after a fixed number of steps,
 certain natural numbers remain indefinitely. These numbers are known as Lucky Numbers.
Write a program in Java to generate and print lucky numbers less than a number N, accepted from the user.
*/
import java.util.*;
public class NumberRemoving {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lower Range");
        int range = sc.nextInt();
        System.out.println("Sequence of Given Natural Number");
        for(int i=1;i<=range;i++)
        {
            System.out.print(i+",");
        }
        System.out.println();
        System.out.println("Removing every second number produces the sequence");
        for(int i=1;i<=range;i++)
        {
            if(i%2!=0)
                System.out.print(i+",");
        }
        System.out.println();
        System.out.println("Removing every third number produces the sequence");
        for(int i=1;i<=range;i++)
        {
            if(i%3!=0)
                System.out.print(i+",");
        }
        System.out.println();
        System.out.println("Removing every fourth number produces the sequence");
        for(int i=1;i<=range;i++)
        {
            if(i%4!=0)
                System.out.print(i+",");
        }
        System.out.println();
        System.out.println("Removing every fifth number produces the sequence");
        for(int i=1;i<=range;i++)
        {
            if(i%4!=0)
                System.out.print(i+",");
        }
        System.out.println();
        System.out.println("Lucky Numbers are:-");
        for(int i=1;i<=range;i++)
        {
            if(i%2!=0&&i%3!=0&&i%5!=0)
                System.out.print(i+",");
        }
    }
}