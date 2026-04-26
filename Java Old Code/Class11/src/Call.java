import java.io.*;
public class Call
{
    public static void main(String args[]) throws IOException
    {
        DataInputStream dis = new DataInputStream(System.in);
        System.out.println("Enter Number Of Calls:- ");
        int call = Integer.parseInt(dis.readLine());
        double charge = 180.0;
        call -=50;
        if(call>0)
        {
            charge += (call>100)?100:call;
            call-=100;
            if(call>0)
            {
                charge += (call>200)?300:call*1.5;
                call-=200;
                if(call>0)
                    charge += 2*call;
            }
        }
        System.out.println(charge);
    }
}   