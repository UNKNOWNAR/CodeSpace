import java.util.*;
public class Complex
{
    static double x;
    static double y;
    Complex(double real,double img)
    {
        x=real;
        y=img;
    }
    void display()
    {
        if(y>0)
            System.out.println("Complex Number:- "+x+"+i"+y);
        if(y<0)
            System.out.println("Complex Number:- "+x+"-i"+y);
        if(y==0)
            System.out.println("Complex Number:- "+x);
    }
    static Complex Complexadd(Complex ob1,Complex ob2)
    {
        Complex add = new Complex(0.0,0.0);
        add.x = ob1.x+ob2.x;
        add.y = ob1.y+ob2.y;
        return add;
    }
    public static void main(String args[])
    {
        Complex ob = new Complex(x,y);
        Complex ob1 = new Complex(x,y);
        Complex temp;
        ob.display();
        ob1.display();
        temp=Complexadd(ob,ob1);
        
    }
}