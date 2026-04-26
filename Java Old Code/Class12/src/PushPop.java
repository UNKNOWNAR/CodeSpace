import java.util.Scanner;
public class PushPop {
    int s[] = new int[20];
    int sp, n;
    PushPop(int nn) {
        for (int i=0;i<20;i++)
        {
            s[i] = 0;
            sp = -1;
            n = nn;
        }
    }
    void pushdata(int item) {
        if (sp == (n - 1))
            System.out.println("Stack Overflows");
        else {
            sp++;
            s[sp] = item;
        }
    }
    void popdata() {
        int v;
        if (sp == -1)
            System.out.println("Stack Underflows");
        else {
            v = s[sp];
            System.out.println("Popped out element is" + v);
            sp--;
        }
    }
    void display() {
        if (sp == -1)
            System.out.println("Stack Empty");
        else {
            System.out.println("SP- ->" + s[sp] + " ");
            System.out.println(" ");
            for (int i = sp; i >= 0; i--) {
                System.out.println("|" + s[i] + "|");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Stack Limit");
        int nn = sc.nextInt();
        PushPop stack = new PushPop(nn);
        for(int i=0;i<nn;i++)
        {
            int n = sc.nextInt();
            stack.pushdata(n);
        }
        stack.display();
        for(int i=nn;i>0;i--)
        {
            stack.popdata();
        }
    }
}