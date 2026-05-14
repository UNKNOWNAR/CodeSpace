#include <stdio.h>
int main()
{
    int n;
    printf("Enter n ");
    scanf("%d",&n);
    int arr[n][n];
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            printf("Enter an element in %d row and %d column ",i+1,j+1);
            scanf("%d",&arr[i][j]);
        }
    }
    int flag = 0;
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            if(i<j && arr[i][j]!=0)
                flag = 1;
        }
    }
    if (flag==1)
        printf("Its not an Upper Triangular Matrix");
    else
        printf("It is an Upper Triangular Matrix");
    return 0;
}