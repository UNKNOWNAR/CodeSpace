#include <stdio.h>
int main()
{
    char name[] = "Arinjay";
    char copy[7];
    char *p = name;
    char *q = copy;
    while(p!='/0')
    {
        *p=*q;
        p++;
        q++;
    }
    *q='\0';
    printf("%s",copy);
}