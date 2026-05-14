/*A B C D E F G F E D C B A 
  A B C D E F   F E D C B A 
  A B C D E       E D C B A 
  A B C D           D C B A 
  A B C               C B A 
  A B                   B A 
  A                       A*/
#include <stdio.h>
int main()
{
    int num = 65;
    for (int i=0;i<7;i++)
    {
        for(int j=0;j<13;j++)
        {
            if(i==0 && j==6)
                printf("%c ",num);
            else if(j<7-i)
                printf("%c ",num++);
            else if(j>=6+i)
                printf("%c ",--num);
            else
                printf("  ");
        }
        printf("\n");
    }
    return 0;
}