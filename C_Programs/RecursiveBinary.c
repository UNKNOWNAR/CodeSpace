#include <stdio.h>
void binary(int num) {
    if (num > 1)
        binary(num / 2);
    printf("%d", num % 2);  
}

int main() {
    int num;
    printf("Enter a number: ");
    scanf("%d", &num);
    printf("Binary: ");
    binary(num);
    printf("\n");
    return 0;
}
