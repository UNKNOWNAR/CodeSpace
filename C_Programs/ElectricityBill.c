#include <stdio.h>
int main()
{
    int units = 0;
    double totalcharge = 0.0;
    printf("Enter Charge:- ");
    scanf("%d",&units);
    totalcharge += (units>200)?200*1:units*1;
    units = (units<200)?0:units-200;
    totalcharge += (units>100)?100*1.5:units*1.5;
    units = (units<100)?0:units-100;
    totalcharge += units*2.0;
    printf("Total Electric Bill:- %f",totalcharge);
    return 0;
}