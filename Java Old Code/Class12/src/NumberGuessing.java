import java.util.Scanner;

public class NumberGuessing {
    static int j = 2;
    static int random = 0;

    static void factor() {
        while (j <= random)
        {
            if (j == random)
            {
                System.out.println("The Number is a Prime Number");
                j = 0;
                return;
            }
            if (random % j == 0) {
                System.out.println("Factor of the number is: " + j);
                j++;
                return;
            }
            j++;
        }
    }

    public static void main(String[] args)
    {
        random = (int)(Math.random()*500)+1;
        int i = 1;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (i % 10 == 0 && j != 0&&i==1)
                factor();
            System.out.println(i + " Try");
            int n = scanner.nextInt();
            if (n == random)
                break;
            else if (n < random)
                System.out.println("Try Higher");
            else
                System.out.println("Try Lower");
            i++;
        }
        System.out.println("You guessed correctly, the number is " + random);
        System.out.println("And you took " + i + " attempts");
        scanner.close();
    }
}