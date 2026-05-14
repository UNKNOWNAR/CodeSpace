#include <stdio.h>
int main()
{
    printf("Enter n");
    int n;
    scanf("%d",&n);
    for(int i=0;i<n;i++)
    {
        int num = 0;//intialize the numbers
        while(num!=i)//Creating spaces infront of the numbers
        {
            printf(" ");//print the spaces
            num++;
        }
        num=1;//reintialize the number
        for (int j=0;j<n-i;j++)//loop to control the rows
        {
            printf("%d ",num);//print the numbers
            num++;//increment the number
        }
        printf("\n");//go to next line
    }
    return 0;
}