import java.util.*;
public class Anagram
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first word");
        String word1= sc.nextLine();
        System.out.println("Enter the second word");
        String word2= sc.nextLine();
        if(word1.length()!=word2.length())
        {
            System.out.println("Not an Anagram");
            System.exit(0);
        }
        int l= word1.length();
        int flag=0;
        for(int i=0; i<l; i++)
        {
            char c= word1.charAt(i);
            for(int j=0; j<l; j++)
            {
                if(word2.charAt(j)==c)
                {
                    flag++;
                    break;
                }
            }
        }
        if(flag==l)
            System.out.println(word1+" and "+word2+" are an Anagram");
        else
            System.out.println("Not an Anagram");
    }
}