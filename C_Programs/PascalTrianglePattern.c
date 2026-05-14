#include <stdio.h>
int main()
{
    int row=0;
    printf("Enter Number of Rows:");
    scanf("%d",&row);
    int prev[row],current[row];
    prev[0] = 1;
    current[0] = 1;
    for(int i=1;i<=row;i++)
    {
        int counter = 0;
        if(i!=1)
        {
            for(int j=1;j<i-1;j++)
                prev[j] = current[j];
            for(int j=1;j<i;j++)
            {
                if(j==i-1)
                    current[j] = 1;
                else
                    current[j] = prev[j-1]+prev[j];
            }
        }
        for(int j=0;j<row+i;j++)
        {
            if(j==row-i+counter)
            {
                printf("%d ",current[counter/2]);
                counter+=2;
            }
            else  
                printf("  ");
        }  
        printf("\n");
    }
    return 0;
}