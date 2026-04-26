/*The MOBIUS function M(N) for a natural number N is defined as:
M(N) 	= 1 	: if N = 1
			= 0 	: if any prime factor of N is contained in N more than once.
			= (-1)^p	: if N is a product of p distinct prime factors
	Example:
	M(78) = -1	: for 78 = 2x3x13 so, M(78) = (-1)3 = -1
	M(34) = 1	: for 34 = 2x17 so, M(34) = (-1)2 = 1
	M(12) = 0	: for 12 = 2x2x3 so, M(12) = 0, for 2 appears two times
	M(17) = -1	: for 17 = 17 so, M(17) = (-1)1 = -1, as 17 itself is a prime
Write a program to input a positive natural number N and output M(N). The program should continue till the user wants.
Check the program for N = 666, N = 327, N = 29.
*/
import java.util.*;
public class MobiusFunction {
    int n;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        n = sc.nextInt();
    }
    void compute() {
        if (n == 1)
        {
            System.out.println("The output of function is: " + 1);
            System.exit(0);
        }
        int j = 2, p = 0, c = 0;
        double m = 0.0;
        while (j <= n) {
            if (n % j == 0) {
                c++;
                n /= j;
                p++;
                if (p > 1) {
                    m = 0;
                    break;
                }
            } else {
                j++;
                p = 0;
            }
        }
            if (p<=1)
                m = (Math.pow(-1, c));
            System.out.println("The output of function is: " + (int) m);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        MobiusFunction ob = new MobiusFunction();
        int c = 5;
        while(c==5)
        {
            System.out.println("Enter 5 to Continue and any key to stop");
            c = sc.nextInt();
            ob.input();
            ob.compute();
        }
    }
}