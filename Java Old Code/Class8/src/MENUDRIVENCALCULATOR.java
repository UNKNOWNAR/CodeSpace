import java.io.*;
public class MENUDRIVENCALCULATOR
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("ENTER FIRST NUMBER");
       int d = 5;
       while(d==5)
       {
       int a = Integer.parseInt(dis.readLine());
       System.out.println("ENTER SECOND NUMBER");
       int b = Integer.parseInt(dis.readLine());
       System.out.println("ENTER 1 TO ADD/ ENTER 2 TO SUBSTRACT " +b+" FROM "+a+"/ ENTER 3 TO SUBSTRACT " +a+" FROM "+b+"/ ENTER 4 TO MULTIPLY/ ENTER 5 TO DIVIDE "+b+" FROM "+a+ "/ ENTER 6 TO DIVIDE"+a+"FROM"+b);
       int c = Integer.parseInt(dis.readLine());
       switch(c)
       {
           case 1: System.out.println(" SUM OF " +a+ " AND " +b+ " = "+(a+b));
           break;
           case 2: System.out.println(" DIFEERENCE BETWEEN " +a+ " AND " +b+ " = "+(a-b));
           break;
           case 3: System.out.println(" DIFEERENCE BETWEEN " +b+ " AND " +a+ " = "+(b-a));
           break;
           case 4: System.out.println(" MULTIPLY OF  " +a+ " AND " +b+ " = "+(a*b));
           break;
           case 5: System.out.println(" QUOUTENT BETWEEN " +a+ " AND " +b+ " = "+(b/a));
           break;
           case 6: System.out.println(" QUOUTENT BETWEEN " +a+ " AND " +b+ " = "+(a/b));
           break;
        }
        System.out.println(" IF YOU WANT TO CONTINUE TAKING ENTER PREES 5 ELSE PRESS 0 ");
     d = Integer.parseInt(dis.readLine());
}
}
}
        