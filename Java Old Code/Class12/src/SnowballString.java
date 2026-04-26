/*Write a program in Java to accept a string terminated by a full stop (.) or a question mark (?) from the
 user, and check whether the string is a snowball string or not.
[A snowball string is a sentence where each word is arranged in ascending order of their length and is also consecutive.]
For example:-
I am the best.
He may give bonus.
*/
import java.util.*;
public class SnowballString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string terminated by a full stop (.) or a question mark (?):");
        String str = sc.nextLine()+" ";
        int length = str.length();
        int previouslength=-1;
        int currentlength=0;
        for(int i=0;i<length;i++)
        {
            if(str.charAt(i)==' ')
            {
                if(previouslength<currentlength) {
                    previouslength = currentlength;
                    currentlength = 0;
                }
                else {
                    System.out.println("Not a Snowball String");
                    System.exit(0);
                }
            }
            else if(str.charAt(i)!='.')
                currentlength++;
        }
        System.out.println("Snowball String");
    }
}
