import java.util.*;
public class Concat
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str1 = sc.next();
        int l = str.length();
        int l1 = str1.length();
        String ns = "";
        for(int i=0;i<l;i++)
            ns += str.charAt(i);
        for(int i=0;i<l1;i++)
            ns += str1.charAt(i);
        System.out.println(ns);
    }
}