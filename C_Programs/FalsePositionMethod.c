#include <stdio.h>
#include <math.h>
double f(double x)
{
    return pow(x,3)+2*pow(x,2)+3*x+2;
}
int main()
{
    double a,b,result,x1;
    printf("Enter x for positive value:\n");
    scanf("%lf",&a);
    printf("Enter x for neagtive value:\n");
    scanf("%lf",&b);
    do 
    {
        x1 = (a*f(b)-b*f(a))/(f(b)-f(a));
        result = f(x1);
        if(result>0)
            a=x1;
        else
            b=x1;
    }while(fabs(result)>=0.001);
    printf("Roots of f(x) is %f",x1);
    return 0;
}