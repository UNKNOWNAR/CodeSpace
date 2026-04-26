/*18.	A Circular Prime is a prime number that remains prime under cyclic shifts of its digits. When the leftmost digit is removed and replaced at the end of the remaining string of digits, the generated number is still prime. The process is repeated until the original number is reached again.
A number is said to be prime if it has only two factors 1 and itself.
Example:
131
311
113
Hence, 131 is a circular prime.
Accept a positive number N and check whether it is a circular prime or not. The new numbers formed after the shifting of the digits should also be displayed.

Test the program with the following data:
Example 1
INPUT:
N = 197
OUTPUT:
197
971
719
197 IS A CIRCULAR PRIME.

Example 2
INPUT:
N = 1193
OUTPUT:
1193
1931
9311
3119
1193 IS A CIRCULAR PRIME.

Example 3
INPUT:
N = 29
OUTPUT:
29
92
29 IS NOT A CIRCULAR PRIME.
*/
import java.util.*;
public class CircularPrime {
    boolean prime(int n)
    {
        int f = 0;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
                f++;
        }
        if(f!=0)
            return false;
        else
            return true;
    }
    void cycle(int arr[],int d)
    {
        int temp = arr[0];
        for(int i=1;i<d;i++)
        {
            arr[i-1] = arr[i];
        }
        arr[d-1] = temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CircularPrime ob = new CircularPrime();
        System.out.println("Enter A Number:-");
        int n = sc.nextInt();
        int temp = n;
        int d = 0;
        int arr[] = new int[3];
        while(temp!=0)
        {
            arr[d] = temp%10;
            temp /=10;
            d++;
        }
        for(int i=0;i<d;i++)
        {
            int n1=0;
            for(int j=0;j<d;j++)
                n1 = n1*10+arr[d-1-j];
            ob.cycle(arr,d);
            if(!(ob.prime(n1)))
            {
                System.out.println(n + " is not a Circular Prime");
                System.exit(0);
            }
            else
            {
                System.out.println(n1);
            }
        }
        System.out.println( n + " is a Circular Prime");
    }
}
/*Certainly, here are descriptions of the variables used in your code:

1. `n`: This variable stores the user-input number, which is the number being checked for circular primality.

2. `temp`: It is used to temporarily store the value of `n` for digit extraction.

3. `d`: This variable keeps track of the number of digits in the input number `n`.

4. `arr`: An array of integers used to store the individual digits of the input number. The array's length is fixed at
 3, but it could be made more dynamic based on the number of digits in the input.

5. `n1`: This variable is used to store the result of circularly rotating the digits of `n`. It is updated within the
loop that checks the circular prime property.

6. `i` and `j`: Loop variables used for iterating through the digits and the rotations.

7. `f`: A counter variable used in the `prime(int n)` method to count the number of divisors of `n`. If this count is
not equal to 0, the number is considered non-prime.

These variables are used to perform the operations required to determine if the input number is a circular prime.
 However, the code could be optimized and made more flexible to handle numbers with varying numbers of digits.*/