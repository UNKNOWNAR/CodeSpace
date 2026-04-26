import java.util.*;
public class ReverseVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Sentence");
        String str = " "+sc.nextLine();
        int length = str.length();
        String word = "";
        String nword = "";
        String startendword = "";
        ReverseVowels vowels = new ReverseVowels();
        for (int i=0;i<length;i++)
        {
            char ch =str.charAt(length-i-1);
            if(ch==' ')
            {
                if(word.charAt(word.length()-1)==word.charAt(0))
                    startendword += word + ",";
                nword += word+" ";
                vowels.VowelCounter(word);
                word = "";
            }
            else
                word = ch + word;
        }
        System.out.println("Word which starts and ends with same alphabet:-"+startendword);
        System.out.println("Reversed String:-"+nword);
    }
    void VowelCounter(String word)
    {
        int length = word.length();
        int nv = 0;
        for(int i=0;i<length;i++)
        {
            char ch = word.charAt(i);
            if(VowelChecker(ch))
                nv++;
        }
        System.out.println(word+",No of Vowels="+nv);
    }
    boolean VowelChecker(char ch)
    {
        if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            return true;
        return false;
    }
}