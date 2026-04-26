/*Write the programs in Java to display the first ten terms of the following series:

(a) 1, 4, 9, 16,
(b)1, 2, 4, 7, 11,
(c) 3, 6, 9, 12,
(d) 4, 8, 16, 32,
(e) 1.5, 3.0, 4.5, 6.0,
(f) 0, 7, 26,
(g) 1, 9, 25, 49,
(h) 4, 16, 36, 64,
(i) 0, 3, 8, 15,
(j) 24, 99, 224, 399,
(k) 2, 5, 10, 17,*/
public class SC1
{
    public static void main(String args[])
    {
        for(int i=1;i<=10;i++)
        {
            System.out.print((i!=10)?" "+(i*i)+",":" "+(i*i));
        }
        System.out.println("");
        for(int sum=1, i = 0;i<10;i++)
        {
            sum=sum+i;
            System.out.print((i!=9)?" "+(sum)+",":" "+(sum));
        }
        System.out.println("");
        for(int i=1;i<=10;i++)
        {
           System.out.print((i!=10)?" "+(3*i)+",":" "+(3*i));
        }
        System.out.println("");
        for(int i=1;i<=10;i++)
        {
           System.out.print((i!=10)?" "+(4*i)+",":" "+(4*i)); 
        }
        System.out.println("");
        for(int i=1;i<=10;i++)
        {
           System.out.print((i!=10)?" "+(1.5*i)+",":" "+(1.5*i)); 
        }
        System.out.println("");
        for(int i=1;i<=10;i++)
        {
           System.out.print((i!=10)?" "+((i*i*i)-1)+",":" "+((i*i*i)-1)); 
        }
        System.out.println("");
        for(int i=1;i<=20;i=i+2)
        {
            System.out.print((i!=20)?" "+(i*i)+",":" "+(i*i));
        }
        System.out.println("");
        for(int i=2;i<=20;i=i+2)
        {
            System.out.print((i!=20)?" "+(i*i)+",":" "+(i*i));
        }
        System.out.println("");
        for(int i=1;i<=10;i++)
        {
           System.out.print((i!=10)?" "+((i*i)-1)+",":" "+((i*i)-1)); 
        }
        System.out.println("");
        for(int i=5;i<=50;i=i+5)
        {
           System.out.print((i!=50)?" "+((i*i)-1)+",":" "+((i*i)-1)); 
        }
        System.out.println("");
        for(int i=1;i<=10;i++)
        {
           System.out.print((i!=10)?" "+((i*i)+1)+",":" "+((i*i)+1)); 
        }
    }
}
