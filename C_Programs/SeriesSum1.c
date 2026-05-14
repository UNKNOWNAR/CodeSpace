//Series :- 1/1!+2/2!+3/3!+4/4!+.....
#include <stdio.h>
int main()
{
    float sum = 0.0;
    for (int i=1;i<=7;i++)
    {
        double factorial = 1;
        int temp = i;
        while(temp!=0)
            factorial *= temp--;
        sum += i/factorial; 
    }
    printf("Value of Sum:- %f",sum);
    return 0;
}