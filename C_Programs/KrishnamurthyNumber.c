#include <stdio.h>
int main()
{
    int num;
    printf("Enter A Number:");
    scanf("%d",&num);
    for(int i=1;i<=num;i++)
    {
        int temp = i;
        int sum = 0;
        while(temp!=0)
        {
            int temp1 =temp %10;
            int factorial = 1;
            while (temp1!=0)
                factorial *= temp1--;
            temp/=10;
            sum+=factorial;
        }
        if(sum==i)
            printf("%d is a Krishnamurthy Number\n",i);
    }
    return 0;
}