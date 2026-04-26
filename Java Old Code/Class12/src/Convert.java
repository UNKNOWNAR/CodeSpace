import java.util.*;
public class Convert
{
    String stg;
    String newstg;
    int len;
    Convert()
    {
        stg = "";
        newstg = "";
        len = 0;
    }
    void character()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A String");
        stg = sc.next();
        len = stg.length();
    }
    char caseConvert(char ch)
    {
        if((int)ch>=97)
        {
            return (char)((int)ch-32);
        }
        else
            return (char)((int)ch+32);
    }
    void reconvert(int n)
    {
        if(n<len)
        {
            newstg += caseConvert(stg.charAt(n));
            reconvert(n+1);
        }
        else
            return;
    }
    void output()
    {
        System.out.println("Original Word:- "+stg);
        System.out.println("Reconverted Word:- "+newstg);
    }

    public static void main(String[] args) {
        Convert ob = new Convert();
        ob.character();
        ob.reconvert(0);
        ob.output();
    }
}