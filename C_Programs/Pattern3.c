/*
1
1 2
1 2 3
1 2 3 4 */
#include <stdio.h>
int main()
{
    int num = 0;
    printf("Enter A Number:");
    scanf("%d",&num);
    for(int i=1;i<=num;i++)
    {
        for(int j=1;j<=i;j++)
            printf("%d ",j);
        printf("\n");
    }
}