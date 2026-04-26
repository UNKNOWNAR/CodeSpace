import java.util.*;
public class SumCombination
{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=1;i<=num/2;i++)
        {
            int flag = i;
            int sum = 0;
            while(num>sum)
            {
                sum+= flag;
                flag++;
            }
            if(sum==num)
            {
                for(int j=i;j<flag;j++)
                    System.out.print(j+",");
                System.out.println();
            }
        }
    }
}