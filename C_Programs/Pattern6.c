#include <stdio.h>
int main()
{
    int num;
    printf("Enter A Number ");
    scanf("%d",&num);
    for(int i = 0;i<num;i++)
    {
        int counter = 1;
        for(int j=0;j<num+i;j++)
        {
            if(j>=num-i-1)
            {
                printf("%d",counter);
                if (j+1<num)
                    counter++;
                else
                    counter--;
            }
            else 
                printf(" ");
        }
        printf("\n");
    }
    return 0;
}
