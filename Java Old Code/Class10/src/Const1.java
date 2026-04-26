public class Const1
{
    int count = 10;
    Const1()
    {
        this(20);
    }
    Const1(int count)
    {
        System.out.println("count="+count);
    }
    public static void main(String[]args)
    {
        Const1 con = new Const1();
    }
}
        