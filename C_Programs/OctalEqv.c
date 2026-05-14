#include <stdio.h>
#include <math.h>
int main()
{
    int num,oct=0,temp,counter = 0;
    printf("Enter A Number: ");
    scanf("%d/n",&num);
    temp = num;
    while(temp!=0)
    {
        int x  = temp%8;
        double y = pow(10,counter);
        oct += (int)y*x;
        temp /= 8;
        counter++;
    }
    printf("Octal Equivalent Of %d is %d",num,oct);
    return 0;
}