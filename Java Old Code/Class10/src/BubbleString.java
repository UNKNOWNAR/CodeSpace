 import java.io.*;
public class BubbleString
{
    public static void main(String args[])throws IOException
   {
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("Enter A String:-");
       String s = dis.readLine();
       int length = s.length();
       s = s+" ";
       int ne = 0;
       int k = 0;
       while(k<length)
       {
           k = s.indexOf(" ",k+1);
           ne++;
       }
       String arr[]= new String[ne];
       k=0;int it=0;
       while(k<length)
        {
            String str = s.substring(k,(s.indexOf(" ",k)));
            arr[it] = str;
            it++;
            k = s.indexOf(" ",k)+1;
        }
       for(int i =0;i<ne-1;i++)
       {
          for(int j = 0;j<ne-i-1;j++)
          {
              int sl  = arr[j].length();
              int sl1 = arr[j+1].length();
              if(sl>sl1)
              {
                  String temp = arr[j];
                  arr[j] = arr[j+1];
                  arr[j+1] = temp;
                }
            }
       }
       for(int i=0;i<ne;i++)
           System.out.println(arr[i]);
   }
}