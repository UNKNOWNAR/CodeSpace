/*Write two separate programs to generate the following patterns using iteration (loop) statements:
(a)
*
*  #
*  #  *
*  #  *  #
*  #  *  #  *
(b)
5 4 3 2 1
5 4 3 2
5 4 3
5 4
5
*/
import java.io.*;
public class SC94
{
    public static void main ( String args [])
    {
        int i = 1,x=1;
        while(i<=5)
        {
            x=1;
           while(x!=i+1)
           {
           if(x%2!=0)
           {
               System.out.print("* ");
               x++;
           }
           else
           {
               System.out.print("# ");
               x++;
           }
           }
           System.out.println("");
           i++;
        }
        int j = 5,v=5,z=0;
        while(v!=0)
        {
            j = 5;
            while(j!=z)
            {
                System.out.print(j+" ");
                j--;
            }
            v--;
            z++;
            System.out.println("");
        }
    }
}
    
