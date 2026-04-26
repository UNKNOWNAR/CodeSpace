import java.util.*;
public class PronicNO
{
    int num;
    boolean t = false;
    PronicNO()
    {
        num=0;
    }
    void acceptnum()
    {
        Scanner sc = new Scanner(System.in);
        num =  sc.nextInt();
    }
    boolean ispronic(int v)
    {
        if(v*(v+1)==num)
            t = true;
        else if(v<num)
            ispronic(v+1);
        return false;
    }
    void check()
    {
        ispronic(0);
        if(t)
            System.out.println(num+" is a pronic number");
        else
            System.out.println(num+" is not a pronic number");
    }
    static void main()
    {
        PronicNO ob = new PronicNO();
        ob.acceptnum();
        ob.check();
    }
}    