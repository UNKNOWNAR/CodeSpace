#include <stdio.h>

int main() {
    int n, num, min, max;

    printf("Enter the number of integers: ");
    scanf("%d", &n);

    if (n <= 0) {
        printf("Invalid input! Number of integers must be greater than 0.\n");
        return 1;
    }

    printf("Enter %d integers: ", n);
    for (int i = 0; i < n; i++) {
        scanf("%d", &num);

        if (i == 0) {
            min = max = num; // Initialize min and max with the first number
        } else {
            if (num < min) {
                min = num; // Update min if a smaller number is found
            }
            if (num > max) {
                max = num; // Update max if a larger number is found
            }
        }
    }

    int range = max - min;
    printf("Range of the set of integers: %d\n", range);

    return 0;
}