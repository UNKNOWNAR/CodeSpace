#include <stdio.h>
long long int bin(long long int n)
{
    if(n==0)
        return 0;
    else
    {
        return n%2+bin(n/2)*10;
    }
}
int main()
{
    int num;
    scanf("%lld",&num);
    printf("%d",bin(num));
    return 0;
}