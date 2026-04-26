import java.util.*;
public class SortAlpha {
    String sent;
    int n;
    String word[];
    SortAlpha()
    {
        sent = "";
        n = 0;
    }
    void acceptsent()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A String");
        sent = sc.nextLine();
    }
    boolean wordCompare(String word1,String word2)
    {
        int l = Math.min(word1.length(), word2.length());
        for(int i=0;i<l;i++)
        {
            if(word1.charAt(i)>word2.charAt(i))
                return true;
            else if(word1.charAt(i)<word2.charAt(i))
                return false;
        }
        if(l==word1.length())
            return false;
        else
            return true;
    }
    void sort(SortAlpha P) {
        String sentence = P.sent;
        sentence += " ";
        int l = sentence.length();
        for (int i = 0; i < l; i++) {
            if (sentence.charAt(i) == ' ')
                P.n++;
        }
        word = new String[n];
        int counter = 0;
        String w = "";
        for (int i = 0; i < l; i++) {
            char ch = sentence.charAt(i);
            if (ch == ' ') {
                word[counter] = w;
                w = "";
                counter++;
            } else
                w += ch;
        }
        for (int i = 0; i < (P.n)-1; i++) {
            for(int j=0;j<(P.n)-i-1;j++)
            {
                if(wordCompare(word[j],word[j+1]))
                {
                    String temp = word[j];
                    word[j] = word[j+1];
                    word[j+1] = temp;
                }
            }
        }
    }
    void display()
    {
        for (int i = 0; i < n; i++) {
            System.out.print(word[i]+" ");
        }
    }

    public static void main(String[] args) {
        SortAlpha sort = new SortAlpha();
        sort.acceptsent();
        sort.sort(sort);
        sort.display();
    }
}