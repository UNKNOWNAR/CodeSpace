/**/
import java.io.*;
public class Matrix
{
    private int m[][] = new int[3][3];
    void getdata()throws IOException
    {
        int i = 0,j=0;
        DataInputStream dis = new DataInputStream(System.in);
        while(i<3)
        {
            System.out.println("Enter Number in Row "+(i+1)+" :- ");
            while(j<3)
            {
                System.out.print("Enter Number:- ");
                m[i][j]  = Integer.parseInt(dis.readLine());
                j++;
            }
            i++;
            j=0;
        }
    }  
    void rowsum()
    {
        int sum = 0;
        int i = 0;
        int j = 0;
        while(i<3)
        {
            while(j<3)
            {
                sum+=m[j][i];
                j++;
            }
            System.out.println("Sum in Row "+(i+1)+" :- "+sum);
            i++;
            j=0;
        }
    }  
    void colsum()
    {
        int sum = 0;
        int i = 0;
        int j = 0;
        while(i<3)
        {
            while(j<3)
            {
                sum+=m[i][j];
                j++;
            }
            System.out.println("Sum in Column "+(i+1)+" :- "+sum);
            i++;
            j=0;
        }
    }  
    public static void main(String args[]) throws IOException
    {        
        Matrix obj = new Matrix();
        obj.getdata();
        obj.rowsum();       
        obj.colsum();       
    }
}