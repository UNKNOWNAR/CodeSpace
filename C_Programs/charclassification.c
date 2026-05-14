#include <stdio.h>
int main()
{
    char ch;
    printf("Enter A Character: ");
    scanf("%c",&ch);
    int x = (char)ch;
    if(x>=65&&x<=90)
        printf("Character is a Capital Letter");
    else if(x>=65&&x<=90)
        printf("Character is a Small Letter");
    else if(x>=48&&x<=57)
        printf("Character is a Digit");
    else
        printf("Character is a Special Symbol");
    return 0;
}