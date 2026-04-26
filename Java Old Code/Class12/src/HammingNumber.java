public class HammingNumber {
    public static void main(String[] args) {
        int multiple2, multiple3, multiple5;
        int range = 20;

        for (int i = 1; i <= range; i++) {
            int num = i;
            multiple2 = multiple3 = multiple5 = 0;

            for (int j = 2; j <= 5; j++) {
                while (num % j == 0) {
                    switch (j) {
                        case 2:
                            num /= 2;
                            multiple2++;
                            break;
                        case 3:
                            num /= 3;
                            multiple3++;
                            break;
                        case 5:
                            num /= 5;
                            multiple5++;
                            break;
                    }
                }
            }

            if (num == 1) {
                System.out.println(i + " is a Hamming Number");
                System.out.println("Prime Factor: 2^" + multiple2 + " * 3^" + multiple3 + " * 5^" + multiple5);
            }
        }
    }
}
/*
Sure, here are descriptions of the variables used in your code:
`multiple2`, `multiple3`, `multiple5`: These variables are used to keep track of the exponents of the prime factors 3
2, 3, and 5 in the current number being checked.
`range`: This variable specifies the range of numbers you want to check for Hamming numbers, which in your code is set
 to 20.
3. `i`: This is the loop variable used to iterate through the numbers from 1 to `range`.
4. `num`: This variable is used to store the current number being checked for Hamming number properties. It is initially
 set to the value of `i`, and its value is modified as you divide it by its prime factors.
5. `j`: This loop variable is used to iterate through the prime factors 2, 3, and 5, which are used to check the
divisibility of `num` and update `multiple2`, `multiple3`, and `multiple5`.
These variables are effectively used in the code to identify and print the first twenty Hamming numbers and their prime factorization.*/