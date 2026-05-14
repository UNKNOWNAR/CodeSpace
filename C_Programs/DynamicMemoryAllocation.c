#include <stdio.h>
#include <stdlib.h>   // For malloc() and free()
#include <string.h>   // For strlen() and strcpy()

int main() {
    char *names[6];
    char n[50];
    int len;
    char *p;

    for (int i = 0; i < 5; i++) {
        printf("Enter Name: ");
        scanf(" %[^\n]", n);  // Read full line including spaces

        len = strlen(n);
        p = malloc(len + 1);

        strcpy(p, n);
        names[i] = p;
    }

    printf("\nStored Names:\n");
    for (int i = 0; i < 5; i++) {
        printf("%s\n", names[i]);
    }
    return 0;
}