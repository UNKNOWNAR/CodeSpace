import java.util.Scanner;
public class RecursiveArmstrong {
    int armstrong = 0;

    int Armstrong(int n) {        if (n == 0) {
            return armstrong;
        } else {
            armstrong += (int) Math.pow(n % 10, 3);
            return Armstrong(n / 10);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number");
        int n = sc.nextInt();
        RecursiveArmstrong ob = new RecursiveArmstrong();
        if (n == ob.Armstrong(n))
            System.out.println(n + " is an Armstrong Number");
        else
            System.out.println(n + " is not an Armstrong Number");
    }
}