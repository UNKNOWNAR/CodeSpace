#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {
    char *A, *B, *C;
    char n1[50], n2[50];

    // Input strings
    printf("Enter first string: ");
    scanf("%s", n1);
    printf("Enter second string: ");
    scanf("%s", n2);

    // Finding lengths
    int len1 = strlen(n1);
    int len2 = strlen(n2);

    // Dynamic memory allocation
    A = (char *)malloc((len1 + 1) * sizeof(char));
    B = (char *)malloc((len2 + 1) * sizeof(char));

    if (A == NULL || B == NULL) {
        printf("Memory allocation failed.\n");
        return 1;
    }

    // Copying strings into dynamic memory
    strcpy(A, n1);
    strcpy(B, n2);

    // Allocating memory for concatenated string
    C = (char *)malloc((len1 + len2 + 1) * sizeof(char));

    if (C == NULL) {
        printf("Memory allocation failed.\n");
        return 1;
    }

    // Concatenating the two strings
    strcpy(C, A);
    strcat(C, B);

    // Displaying the concatenated string
    printf("\nConcatenated String: %s\n", C);

    // Freeing dynamically allocated memory
    free(A);
    free(B);
    free(C);

    return 0;
}