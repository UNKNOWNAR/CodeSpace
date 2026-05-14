#include <stdio.h>
int main()
{
    for (int i = 1; i <= 500; i++)
    {
        int temp = i;
        int result = 0;

        while (temp != 0)
        {
	    int x = temp%10;
            result += x*x*x;
            temp /= 10;
        }

        if (result == i)
            printf("%d is an Armstrong Number\n", i);
    }

    return 0;
}
