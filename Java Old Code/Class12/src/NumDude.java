import java.util.*;
public class NumDude {
    int num;
    NumDude()
    {
        num = 0;
    }
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number");
        num = sc.nextInt();
    }
    int sumDigits(int x)
    {
        int sum = 0;
        if(x==0)
            return 0;
        else
            return (x%10+sumDigits(x/10));
    }
    void isDude()
    {
        if(num==(int)Math.pow(sumDigits(num),3.0))
            System.out.println("It is a Dudeney Number");
        else
            System.out.println("It is not a Dudeney Number");
    }

    public static void main(String[] args) {
        NumDude dude = new NumDude();
        dude.input();
        dude.isDude();
    }
}