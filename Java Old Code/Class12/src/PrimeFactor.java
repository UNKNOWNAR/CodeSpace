//Wap to accept a number and pass it to a method factor the program displays
// all the prime factors of the given number
import java.util.*;//Imports the Scanner class to read user input.
    public class PrimeFactor{ //Begins the declaration of the 'PrimeFactor' class.
    void factor(int n)//Starts the definition of the 'factor()' method, which finds the factors of a number.
    {
        for (int i = 2; i <= n; i++) {  //Begins a loop from 2 up to 'n' to check potential factors.
            if (n % i == 0)
                isprime(i);// Calls the 'isprime()' method to check if 'i' is a prime number.
        }
    }
    void isprime(int n)// Starts the definition of the 'isprime()' method, which checks if a number is prime.
    {
        int f = 0;//Initializes a counter variable 'f' to 0.
        for (int i = 2; i < n; i++) {//Begins a loop from 2 up to one less than 'n' to check for factors.
            if (n % i == 0)//Checks if 'i' is a factor of 'n by using the modulo operator.
                f++;// Increments 'f' if 'i' is a factor of n.
        }
        if (f == 0)// Checks if 'f' is still 0, indicating that 'n' is prime.
            System.out.println(n);// Prints the prime number 'n'.
    }

    public static void main(String args[]) {//Starts the program execution in the 'main()' method.
        Scanner sc = new Scanner(System.in);//Creates a new 'Scanner' object to read user input.
        PrimeFactor ob = new PrimeFactor();//Creates an instance of the 'PrimeFactor' class.
        System.out.println("Enter A Number:-");
        int n = sc.nextInt();// Reads an integer input from the user and assigns it to 'n'.
        System.out.println("Prime Factors are:-");
        ob.factor(n);// Calls the 'factor()' method to find and print the prime factors of 'n'.
    }
}
/*Variable Listing:

- `sc`: Scanner object for accepting user input.
- `ob`: PrimeFactor object used to call methods within the class.
- `n`: Integer variable to store the user input number.
- `i`: Integer variable used as a loop counter.
- `f`: Integer variable to count the number of factors for each potential prime factor.*/
/*The provided code is a Java program that calculates and displays the prime factors of a given number. Here's a description of the code:

- The program begins by importing the necessary `Scanner` class from the `java.util` package, which allows user input to be read.
- The `PrimeFactor` class is defined, which contains two methods: `factor()` and `isprime()`.
- The `factor()` method takes an input number `n` and finds its factors. It iterates from 2 up to `n` and checks if each number is a factor of `n` by using the modulo operator (`%`). If a number is a factor, it calls the `isprime()` method to check if it is a prime number.
- The `isprime()` method takes a factor `n` and checks if it is a prime number. It iterates from 2 up to one less than `n`, checking if `n` is divisible by any number in that range. If `n` is divisible by any number, a counter variable `f` is incremented. If `f` remains 0, the number `n` is prime, and it is printed to the console.
- In the `main()` method, an instance of the `Scanner` class is created to read user input.
- An instance of the `PrimeFactor` class is created as `ob`.
- The program prompts the user to enter a number, which is read using `sc.nextInt()` and stored in the variable `n`.
- The program then displays a message indicating that it will now calculate the prime factors of the input number.
- The `factor()` method is called on the `ob` object, passing the input number `n` as an argument.
- As the `factor()` method executes, it checks and displays the prime factors of the input number.

Overall, the program utilizes two methods to calculate and print the prime factors of a given number based on user input.*/