#include <stdio.h>
#include <math.h>
int main()
{
    for(int i=1;i<=10;i++)
    {
        int itr=0,sum=i;
        while(sum!=1)
        {
            int temp=sum;
            sum=0;
            while(temp!=0)
            {
                sum+=pow(temp%10,2);
                temp/=10;
            }
            itr++;
            if(itr==100)
            {
                printf("%d is not a Happy Number\n",i);
                break;
            }
        }
        if(sum==1)
            printf("%d is a Happy Number\n",i);    
    }
}