#include <stdio.h>
int main()
{
    int num = 0;
    printf("Enter A Number:");
    scanf("%d",&num);
    int pattern = num;
    for(int i=0;i<num;i++)
    {
        int counter = 0;
        for(int j=0;j<num;j++)
        {
            if((num-pattern)/2<=j&&counter<pattern)
            {
                printf("* ");
                counter++;
            }
            else
                printf("  ");
        }
        if(num/2>i)
            pattern-=2;
        else
            pattern += 2;
        printf("\n");
    }
    return 0;
}