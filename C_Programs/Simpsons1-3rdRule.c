#include <stdio.h>
int main()
{
    float a,b,h,x,result;
    printf("Enter Upper Limit\n");
    scanf("%f",&b);
    printf("Enter Lower Limit\n");
    scanf("%f",&a);
    printf("Enter Step Size\n");
    scanf("%f",&h);
    int n = ((int)((b - a) / h));
    if(n%2!=0)
    {
        printf("Intervals are not even,hence Simpson's Rule not applicable");
        return 0;
    }   
    float y[n+1];
    x=a;
    for (int i=0;i<n+1;i++)
    {
        y[i] = x*x*x+3*x+1;
        x+=h;
    }
    result = (y[0]+y[n]);
    for(int i=1;i<n;i++)
    {
        if (i%2==0)
            result += y[i]*2;
        else
            result += y[i]*4;
    }
    result=(h/3.0)*result;
    printf("Result:- %f",result);
    return 0;
}