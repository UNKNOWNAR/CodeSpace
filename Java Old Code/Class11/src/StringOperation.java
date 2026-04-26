import java.util.*;
public class StringOperation
{
    void StrOP(String s,int in,String w)
    {
        int l = s.length();
        String nw="";
        int f = in;
        for(int i=in;i<l;i++)
        {
            char ch = s.charAt(i);
            if(ch!=' ')
                nw += s.charAt(i);
            else
            {
                if(nw.equalsIgnoreCase(w))  
                    System.out.println(f);
                f=i+1;
                nw="";
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A String:- ");
        String str = sc.nextLine()+" ";
        System.out.println("Enter The Index- ");
        int n = sc.nextInt();
        System.out.println("Enter The Word:- ");
        String w = sc.next();
        StringOperation ob = new StringOperation();
        ob.StrOP(str,n,w);
    }
}