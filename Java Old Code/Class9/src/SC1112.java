/*Write a program to input a string by using scanner class. Display the new string which is formed by the first character of each string.
Sample Input: Automated Teller Machine
Sample Output: ATM*/
import java.util.Scanner;
public class SC1112
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter N:- ");
        String str = in.nextLine();
        str = " "+str;
        int l = str.length();
        int i =0;
        String word = "";
        while(i<l)
        {
            char c = str.charAt(i);
            char ch=' ';
            if(c==' ')
            {
                ch = str.charAt(i+1);
                word += ch;
            }
            i++;
        }
        System.out.print(word);
    }
}