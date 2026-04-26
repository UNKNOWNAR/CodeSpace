import java.util.*;

public class Recursion {
    int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return (n * factorial(n - 1));
    }

    int Sumnum(int n) //a recursive function to find sum of first n terms
    {
        if (n == 0)
            return 0;
        else
            return (n + Sumnum(n - 1));
    }
    static int i = 2;
    int PrimeCheck(int n) {
        if (i == n)
            return 0; //given number is not a prime number
        else if (n % i++ == 0)
            return 1; //given number is a prime number
        else
            return (PrimeCheck(n));
    }
    int DecToBin(int n) //Convert a decimal Number to its Binary equivalent
    {
        if (n == 0)
            return 0;
        else
            return (DecToBin(n / 10) * 10 + n % 10);
    }
    static int number = 0;
    static int j = 0;
    int vowels(String s) {
        char c = s.charAt(j++);
        if (j == s.length())
            return number;
        else {
            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
                number++;
            return vowels(s);
        }
    }

    int GCD(int n1, int n2) //calculate GCD of two numbers
    {
        if (n1 == n2)
            return (n1);
        else {
            if (n1 > n2)
                return (GCD(n1 - n2, n2));
            else
                return (GCD(n1, n2 - n1));
        }
    }

    int Fibonnaci(int n) {//to find Nth element of the Fibonacci Series
        if (n == 1)
            return 0;
        else if (n == 2)
            return 1;
        else
            return (Fibonnaci(n - 2) + Fibonnaci(n - 1));
    }

    public static void main(String[] args) {
        Recursion ob = new Recursion();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Choose an option:");
            System.out.println("1. Factorial of a number");
            System.out.println("2. Prime Check");
            System.out.println("3. Decimal to Binary");
            System.out.println("4. Count Vowels");
            System.out.println("5. GCD");
            System.out.println("6. Fibonacci");
            System.out.println("7. Sum of N Numbers");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number: ");
                    int num = scanner.nextInt();
                    System.out.println("Factorial of " + num + " is " + ob.factorial(num));
                    break;
                case 2:
                    System.out.print("Enter a number to check if it's prime: ");
                    int primeNum = scanner.nextInt();
                    System.out.println(ob.PrimeCheck(primeNum) == 0 ? primeNum + " is prime." : primeNum + " is not prime.");
                    break;
                case 3:
                    System.out.print("Enter a decimal number: ");
                    int decimalNum = scanner.nextInt();
                    System.out.println("Binary equivalent of " + decimalNum + " is " + ob.DecToBin(decimalNum));
                    break;
                case 4:
                    scanner.nextLine(); // Consume the newline character
                    System.out.print("Enter a string: ");
                    String str = scanner.nextLine();
                    System.out.println("Number of vowels in '" + str + "' is " + ob.vowels(str.toUpperCase()));
                    break;
                case 5:
                    System.out.print("Enter two numbers separated by space to find their GCD: ");
                    int gcdNum1 = scanner.nextInt();
                    int gcdNum2 = scanner.nextInt();
                    System.out.println("GCD of " + gcdNum1 + " and " + gcdNum2 + " is " + ob.GCD(gcdNum1, gcdNum2));
                    break;
                case 6:
                    System.out.print("Enter the position to find the Fibonacci number: ");
                    int fibPos = scanner.nextInt();
                    System.out.println("Fibonacci number at position " + fibPos + " is " + ob.Fibonnaci(fibPos));
                    break;
                case 7:
                    System.out.println("Enter N");
                    int N = scanner.nextInt();
                    System.out.println("Sum of N numbers "+ob.Sumnum(N));
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 0);
    }
}