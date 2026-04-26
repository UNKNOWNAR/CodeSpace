import java.util.*;
public class Demand {
    String pid;
    String pname;
    int pdemand;

    Demand(String s1,String s2,int num) {
        pid =s1;
        pname = s2;
        pdemand = num;
    }

    void display() {
        System.out.println("Product id:-" + pid);
        System.out.println("Name:- " + pname);
        System.out.println("Quantity of the product" + pdemand);
    }
}
class Supply extends Demand
{
    int pproduced;
    int prate;
    Supply(String pid,String pname,int pdemand)
    {
        super(pid,pname,pdemand);
        pproduced = 69;
        prate=10;
    }
    double calaculation()
    {
        return (pproduced-pdemand)*prate;
    }
    void display()
    {
        super.display();
        System.out.println("Difference between demand and supply:- "+calaculation());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Product id:-");
        String pid = sc.next();
        System.out.println("Enter Product Name:- ");
        String pname = sc.next();
        System.out.println("Enter Quantity of the product");
        int pdemand = sc.nextInt();
        Supply obj1 = new Supply(pid,pname,pdemand);
        obj1.display();
    }
}
