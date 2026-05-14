#include <stdio.h>
int main()
{
    printf("Combinations of 1,2,3 are :\n");
    for(int i=1;i<=3;i++)
    {
        for(int j=1;j<=3;j++)
        {
            for(int k=1;k<=3;k++)
            {
                if(i!=k && i!=j && j!=k)
                    printf("%d\n",i*100+j*10+k);
            }
        }
    }
    return 0;
}