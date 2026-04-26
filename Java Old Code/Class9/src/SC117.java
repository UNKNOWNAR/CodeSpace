import java.util.Scanner;
public class SC117
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Sentence:- ");
        String str = in.nextLine();
        str += " ";
        int l = str.length(),sum=0;
        String word = "";
        for(int i=0;i<l;i++)
        {
            char ch = str.charAt(i);
            if(ch!=' ')
            {
                word = word + ch;
                sum+= (int)ch;
            }
            else 
            {
                System.out.println(word);
                word= "";
            }
        }
        System.out.println("SUM OF ASCII CHARECTERS :- "+sum);
    }
}
