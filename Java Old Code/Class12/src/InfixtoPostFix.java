import  java.io.*;
import java.util.Scanner;

public class InfixtoPostFix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Expression in Infix");
        String infix = sc.next();
        char arr[] = infix.toCharArray();
        InfixtoPostFix convert = new InfixtoPostFix();
        convert.precedence(arr);
        int l = arr.length;
        for(int i=0;i<l;i++)
        {
            if(arr[i]!='('&&arr[i]!=')')
                System.out.print(arr[i]);
        }
    }
    void precedence(char arr[])
    {
        int l = arr.length;
        char temp;
        for(int i=0;i<l;i++)
        {
            if(arr[i]=='(')
            {
                temp = arr[i+3];
                arr[i+3] = arr[i+2];
                arr[i+3] = temp;
                i+=5;
            }
        }
        for(int i=0;i<l-1;i++)
        {
            if(arr[i]=='*' || arr[i]== '/')
            {
               temp = arr[i];
               if(arr[i+1]=='(')
               {
                   while(arr[i]!=')')
                   {
                       arr[i]=arr[i+1];
                       i++;
                   }
                   i--;
               }
               else
                   arr[i] = arr[i+1];
               arr[i+1] = temp;
               i++;
            }
        }
        for(int i=0;i<l;i++)
        {
            if(arr[i]=='+' || arr[i]== '-')
            {
                temp = arr[i];
                temp = arr[i];
                if(arr[i+1]=='(')
                {
                    while(arr[i]!=')')
                    {
                        arr[i]=arr[i+1];
                        i++;
                    }
                    i--;
                }
                else
                    arr[i] = arr[i+1];

                arr[i+1] = temp;
                i++;
            }
        }
    }
}