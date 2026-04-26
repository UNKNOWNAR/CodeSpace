import java.util.*;
public class NumberArrange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number:-");
        int n = sc.nextInt();
        int temp = n;
        int l =0;
        while(temp!=0)
        {
            l++;
            temp/=10;
        }
        int number[] = new int[l];
        temp = n;
        for(int i=0;i<l;i++)
        {
            number[i] = temp%10;
            temp/=10;
        }
        for(int i=0;i<l-1;i++)
        {
            for(int j=0;j<l-i-1;j++)
            {
                if(number[j]>number[j+1])
                {
                    temp = number[j];
                    number[j] = number[j+1];
                    number[j+1] = temp;
                }
            }
        }
        System.out.println("The Number in Ascending Order:- ");
        for(int i=0;i<l;i++)
        {
            System.out.print(number[i]);
        }
    }
}