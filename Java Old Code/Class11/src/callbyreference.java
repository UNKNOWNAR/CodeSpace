public class callbyreference
{
    public static int y=20;
    public static int x=10;
    public static void main(String args[]) 
    {
        System.out.println("Values initially, x="+x+ ",y =" +y);
        swapCallByValue(x, y);
        System.out.println("Values after swapCallByvalue function, x ="+x+",y="+y);
        callbyreference  obj= new callbyreference();
        swapCallByRef(obj); 
        System.out.println("Values after swapCallByRef function: x="+x+",y="+y);
    }
    public static void swapCallByValue(int a, int b)
    {
        int tmp;
        tmp = a;
        a = b;
        b=tmp;
        System.out.println("Values inside swapCallByValue function, x="+ a +",y="+b);
    }
    public static void swapCallByRef(callbyreference obj) 
    {
        int tmp = obj.x ; 
        obj.x= obj.y ;
        obj.y = tmp;
        System.out.println("Values inside swapcallbyref function.x"+obj.x+",y="+obj.y);
    }
}