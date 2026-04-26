import java.util.*;
public class Mix
{
    String w;
    int len;
    Mix()
    {
        w="";
        len=0;
    }
    void feedword()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A String:-");
        w = sc.nextLine();
        w=w.toUpperCase();
        len = w.length();
    }
    void mix_word(Mix P,Mix Q)
    {
        int p = P.len;
        int a = 0;
        int q = Q.len;
        int b=0;
        int c = (p>q)?p:q;
        this.len = p+q;
        for(int i=0;i<this.len;i++)
        {
            if(i%2==0&&a<p)
            {
                this.w+=P.w.charAt(a);
                a++;
            }
            else if(i%2!=0&&b<q)
            {
                this.w+=Q.w.charAt(b);
                b++;
            }
            else if(c==p)
            {
                this.w+=P.w.charAt(a);
                a++;
            }
            else if(c==q)
            {
                this.w+=Q.w.charAt(b);
                b++;
            }
        }
    }
    void display()
    {
        System.out.println(this.w);
    }
    public static void main(String args[])
    {
        Mix P = new Mix();
        Mix Q = new Mix();
        Mix result = new Mix();
        P.feedword();
        Q.feedword();
        result.mix_word(P,Q);
        result.display();
    }
}