#include <stdio.h>
int main()
{
    int num;
    printf("Enter A Number:");
    scanf("%d",&num);
    int sum = 0;
    for (int i = 1; i < num; i++)
    {
        if (num%i==0)
            sum+=i;
    }
    if(sum==num)
        printf("%d is a Perfect Number",num);
    else
        printf("%d is not a Perfect Number",num);
    return 0;
}   