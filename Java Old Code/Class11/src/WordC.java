import java.util.*;
import WorkPro.Works;
public class WordC
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A String:-");
        String str = sc.nextLine();
        Works ob = new Works();
        System.out.println(ob.wordcount(str));
    }
}
