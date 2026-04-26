import java.util.*;
class Base
{
    double rad;
    Base(double r)
    {
        rad = r;
    }
    void show()
    {
        System.out.println("Radius of the shape:- "+rad);
    }
}
interface Data
{
    double pi = 3.142;
}
public class Interface extends Base implements Data
{
    double ht;
    double volume;
    Interface(double r,double h) {
        super(r);
        ht = h;
    }
    double Volume()
    {
        return (pi*rad*rad*ht);
    }
    void show()
    {
        super.show();
        System.out.println("Height is:- "+ht);
        System.out.println("Volume is:- "+Volume());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius of the given shape:- ");
        double rad = sc.nextDouble();
        System.out.println("Enter Height of the given shape:- ");
        double ht = sc.nextDouble();
        Interface ob = new Interface(rad,ht);
        ob.Volume();
        ob.show();
    }
}
