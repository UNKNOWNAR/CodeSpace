#include <stdio.h>
int main()
{
    printf("Enter A String ");
    char s[40];
    scanf("%[^\n]s",s);
    char *p = s;
    char *q = s;
    while(*p!='\0')
    {
        switch(*p)
        {
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
                break;
            default:
                *q=*p;
                q++;
                printf("%s\n",s);
        }
        p++;
    }
    *q='\0';
    printf("%s",s);
    return 0;
}