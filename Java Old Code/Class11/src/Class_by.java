import java.util.*;
public class Class_by
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int m = sc.nextInt();  
        Class_by ob = new Class_by();
        System.out.println("AfterChange Addition");
        System.out.println(ob.add(k,m));
        System.out.println("Before Change Addition");   
        System.out.println(k+m);
    }
    int add(int k,int m)
    {
        k+=m;
        int add = k+m;
        return add;
    }
}
    