import java.util.*;
public class Kaprekar {
    int p, q;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first integer");
        p = sc.nextInt();
        System.out.println("Enter second integer");
        q = sc.nextInt();
    }

    void display() {
        int c = 0;
        System.out.println("Kaprekar numbers between " + p + " and " + q + " are:");
        for (int n = p; n <= q; n++) {
            int num1 = n * n;
            int w = n * n;
            int k = 0, p1 = 0, n1 = 0, n2 = 0, m = 0, r = 0;
            while (w != 0) {
                int d = w % 10;
                k++;
                w /= 10;
            }
            if (k % 2 == 0)
                p1 = k / 2;
            else
                p1 = k / 2 + 1;
            for (int i = 1; i <= k; i++) {
                if (i <= p1) {
                    int d = num1 % 10;
                    n1 += (int) (d * (Math.pow(10, m)));
                    num1 /= 10;
                    m++;
                } else {
                    int d = num1 % 10;
                    n2 += (int) (d * Math.pow(10, r));
                    num1 /= 10;
                    r++;
                }
            }
            if ((n1 + n2) == n) {
                System.out.println(n);
                c++;
            }
        }
        System.out.println("Frequency of Kaprekar numbers is : " + c);
    }
    public static void main(String[] args) {
        Kaprekar ob = new Kaprekar();
        ob.input();
        ob.display();
    }
}