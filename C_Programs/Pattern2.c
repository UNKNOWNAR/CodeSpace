/*
      1
    2   3
  4   5   6
7   8   9   10
*/
#include <stdio.h>
int main()
{
    int row=0,num=0;
    printf("Enter Number of Rows:");
    scanf("%d",&row);
    for(int i=1;i<=row;i++)
    {
        int counter = 0;
        for(int j=0;j<row+i;j++)
        {
            if(j==row-i+counter)
            {
                printf("%d ",++num);
                counter+=2;
            }
            else  
                printf("  ");
        }   
        printf("\n");
    }
    return 0;
}