#include <stdio.h>
#include <math.h>
int main()
{
    int num;
    printf("Enter A Number:");
    scanf("%d",&num);
    int temp = pow(num,2);
    int counter = 0;
    while(temp!=0)
    {
        counter++;
        temp/=10;
    }
    counter = counter-counter/2;
    int multiplyer = (int)pow(10,counter)+1;
    if(num==((num*num)%multiplyer)+((num*num)/multiplyer))
        printf("%d is a Karepeker Number",num); 
    else
        printf("%d is not a Karepeker Number",num);
}