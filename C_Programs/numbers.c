#include <stdio.h>
int main()
{
    int choice = 5;
    int positive = 0;
    int negative = 0;
    int zero = 0;
    int number = 0;
    while(choice == 5)
    {
        printf("Enter A Number\n");
        scanf("%d",&number);
        if (number==0)
            zero++;
        else if (number>0)
            positive++;
        else
            negative++;
        printf("Press 5 continue\n");
        scanf("%d",&choice);
    }
    printf("Number of Positive Numbers: %d\n",positive);
    printf("Number of Zeros: %d\n",zero);
    printf("Number of Negative Numbers: %d\n",negative);
    return 0;
}