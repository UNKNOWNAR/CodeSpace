/*Specify a class Display_word that accepts a sentence str. Pass it to a method void Longest(String wd) to display longest word of the sentence. The program further displays the ASCII code of each letter of the longest word.
Define the main() method to create an object and call the method Longest(String wd) to enable the task.
For example,
Sample Input: Understanding Computer Science
Sample Output: Understanding
ASCII codes are:
	U	:	85
	n	:	110
	d	:	100
	e	:	101
	r	:	114
	s	:	115
	t	:	116
	a	:	97
	n	:	110
	d	:	100
	i	:	105
	n	:	110
	g	:	103*/
import java.util.*;
public class Display_word {
    void Longest(String wd)
    {
        wd = wd +" ";
        int length = wd.length();
        String maxword = "";
        String word = "";
        for(int i=0;i<length;i++)
        {
            char ch = wd.charAt(i);
            if(ch==' ')
            {
                maxword = (maxword.length()<word.length())?word:maxword;
                word = "";
            }
            else
                word += ch;
        }
        System.out.println("Output: "+maxword);
        maxword = maxword.replace(" ","");
        for(int i=0;i<length;i++)
        {
            System.out.println(maxword.charAt(i)+"\t:\t"+(int)maxword.charAt(i));
        }
        length = maxword.length();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A String:- ");
        String str = sc.nextLine();
        Display_word word = new Display_word();
        word.Longest(str);
    }
}