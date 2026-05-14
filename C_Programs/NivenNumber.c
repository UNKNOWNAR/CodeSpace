#include <stdio.h>
int main()
{
    int num;
    printf("Enter A Number:");
    scanf("%d",&num);
    int temp = num;
    int sum = 0;
    while (temp!=0)
    {
        sum += temp%10;
        temp /= 10;
    }
    if(num%sum==0)
        printf("%d is a Niven Number",num);
    else
        printf("%d is not a Niven Number",num);
}   