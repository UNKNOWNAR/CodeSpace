import java.io.*;
public class Isomorphic1
{
    public static void main(String args[]) throws IOException
    {
        DataInputStream dis = new DataInputStream(System.in);
        System.out.println("Enter First String");
        String str = dis.readLine();
        System.out.println("Enter Second String");
        String str1 = dis.readLine();
        if(str.length()!=str1.length())
        {
            System.out.println(str+" and "+str1+" are not an Isomorphic String");
            System.exit(0);
        }
        int arr[] = new int[str.length()];
        int arr1[] = new int[str1.length()];
        for(int i=0;i<str.length();i++)
        {
            arr[i] = -1;
            arr1[i] = -1;
        }
        for(int i=0;i<str.length();i++)
        {
            char a = str.charAt(i);
            char b = str1.charAt(i);
            if(arr[i]==-1)
            { 
                int sum = 0;
                int k = i;
                do
                {
                    sum +=k;
                    k = str.indexOf(a,k+1);
                }while(k>0);
                k = i;
                do
                {
                    arr[k]=sum;
                    k = str.indexOf(a,k+1);
                }while(k>0);
            }
            if(arr1[i]==-1)
            { 
                int sum = 0;
                int k = i;
                do
                {
                    sum +=k;
                    k = str1.indexOf(b,k+1);
                }while(k>0);
                k = i;
                do
                {
                    arr1[k]=sum;
                    k = str1.indexOf(b,k+1);
                }while(k>0);
            }
        }
        int f = 0;
        for(int i=0;i<str.length();i++)
        {
           if(arr[i]==arr1[i])
                f++;
        }
        if(f==str.length())
            System.out.println(str+" and "+str1+" are an Isomorphic String");
        else 
            System.out.println(str+" and "+str1+" are not an Isomorphic String");
    }
}