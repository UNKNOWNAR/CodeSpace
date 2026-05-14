#include <stdio.h>
int main()
{
    int num;
    printf("Enter A Number:");
    scanf("%d",&num);
    int temp = num;
    int sum=0;
    while(temp!=0)
    {
        sum = temp%10+sum*10;
        temp /= 10;
    }
    if (sum==num)
        printf("%d is a Palindrome Number",num);
    else
        printf("%d is not a Palindrome Number",num);
}