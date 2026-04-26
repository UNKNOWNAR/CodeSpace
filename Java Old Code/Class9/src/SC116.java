/*Write a program by using scanner class to input a sentence. Display the longest word along with the number of characters in it.*/
import java.util.Scanner;
public class SC116
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter The Sentence:- ");
        String str = in.nextLine();
        str += " ";
        String word = "";
        String word1 = "";
        int l = str.length();
        int i = 0,l1=0,l2=0;
        while(i<l)
        {
            char c = str.charAt(i);
             if(c!=' ')
            {
                word += c;
            }
            else
            {
                l1 = word.length();
                word1 = (l1>l2)?word:word1;
                l2 = (l1>l2)?l1:l2;
                word="";
            }
            i++;
        }
        System.out.println("LONGEST WORD :- "+ word1+" AND NUMBER OF CHARECTER IS :- "+l2);
        }
    } 