/*
A
A B
A B C
A B C D
 */
#include <stdio.h>
int main()
{
    int num = 0;
    printf("Enter A Number:");
    scanf("%d",&num);
    for(int i=0;i<num;i++)
    {
        for(int j=0;j<=i;j++)
            printf("%c ",'A'+j);
        printf("\n");
    }
}