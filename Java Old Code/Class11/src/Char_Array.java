import java.util.*;
public class Char_Array
{
    char ch[];
    int n;
    Char_Array()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size OF The Array:-");
        n = sc.nextInt();
        ch=new char[n];
        for(int i=0;i<n;i++)
            ch[i]= sc.next().charAt(0);
    }
    void display()
    {
        System.out.println("Array:-");
        for(int i=0;i<n;i++)
            System.out.println(ch[i]);
    }
    void move()
    {
        int l = n-1;
        for(int i=0;i<n;i++)
        {
            char c = ch[i];
            if(Character.isUpperCase(c))
            {
                for(int j=l;j>i;j--)
                {
                    char c1 = ch[j];
                    if(Character.isLowerCase(c1))
                    {
                        ch[i]=c1;
                        ch[j]=c;
                        break;
                    }
                    l--;
                }
            }
        }
    }
    public static void main(String args[])
    {
        Char_Array ob = new Char_Array();
        ob.move();
        ob.display();
    }
}