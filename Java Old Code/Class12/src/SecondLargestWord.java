import java.util.Scanner;
public class SecondLargestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A String");
        String word = sc.nextLine();
        word = " "+word+" ";
        int length = word.length();
        int max = length;
        int smax = 0;
        int index = 0;
        String sword = "";
        String temp = "";
        for (int i=0;i<length;i++)
        {
            char c = word.charAt(i);
            if(c==' ')
            {
                int l1 = temp.length();
                if(max<l1)
                {
                    max = l1;
                    smax = max;
                    sword = temp;
                }
                temp = "";
            }
            else {
                temp += c;
                index = i+1;
            }
        }
        System.out.println(sword);
    }
}