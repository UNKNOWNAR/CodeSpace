#include <stdio.h>
#include <stdlib.h>
int main()
{
    int n;
    scanf("%d",&n);
    int **matrix;
    matrix = (int **)malloc(n*sizeof(int *));
    for(int i=0;i<n;i++)
    {
        matrix[i] = (int *)malloc(n*sizeof(int));
        if(matrix==NULL)
        {
            printf("Memory Allocation invalid");
        }
    }
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            scanf("%d",&matrix[i][j]);
        }
    }
    int flag=1;
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<i;j++)
        {
            if(matrix[i][j]!=matrix[j][i])
                flag=0; 
        }
    }
    if(flag)
        printf("Symetric");
    else
        printf("Not");
    free(matrix);
    return 0;
}