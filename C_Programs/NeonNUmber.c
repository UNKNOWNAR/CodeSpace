#include <stdio.h>
int main()
{
    int num;
    printf("Enter A Number:");
    scanf("%d",&num);
    int num1 = num*num;
    int sum = 0;
    while(num1!=0)
    {
        sum+=num1%10;
        num1 /= 10;
    }
    if (sum==num)
        printf("%d is a Neon Number",num);
    else
        printf("%d is not a Neon Number",num);
}