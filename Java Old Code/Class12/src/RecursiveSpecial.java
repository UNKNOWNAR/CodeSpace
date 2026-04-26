import java.util.*;
public class RecursiveSpecial {
    int special = 0;
    int factorial(int n)
    {
        int factorial = 1;
        for (int i=n;i!=1;i--)
            factorial *= i;
        return factorial;
    }
    int Special(int n)
    {
        if (n == 0)
            return special;
        else {
            special+= factorial(n%10);
            return Special(n / 10);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number");
        int n = sc.nextInt();
        RecursiveSpecial ob = new RecursiveSpecial();
        if (n == ob.Special(n))
            System.out.println(n + " is an Special Number");
        else
            System.out.println(n + " is not an Special Number");
    }
}