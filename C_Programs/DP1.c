#include <stdio.h>
#include <stdlib.h>

int main() {
    int *arr, *belowAvg, *aboveAvg;
    int n = 100, belowCount = 0, aboveCount = 0;
    double average = 0.0, sum = 0.0;

    // Allocate memory for 100 integers
    arr = (int *)malloc(n * sizeof(int));
    if (arr == NULL) {
        printf("Memory allocation failed\n");
        return 1;
    }

    // Read 100 integers
    printf("Enter 100 integers:\n");
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
        sum += arr[i];
    }

    // Calculate the average
    average = sum / n;
    printf("\nAverage: %.2lf\n", average);

    // Count numbers below and above the average
    for (int i = 0; i < n; i++) {
        if (arr[i] < average)
            belowCount++;
        else if (arr[i] > average)
            aboveCount++;
    }

    // Allocate memory for below and above average arrays
    belowAvg = (int *)malloc(belowCount * sizeof(int));
    aboveAvg = (int *)malloc(aboveCount * sizeof(int));

    if (belowAvg == NULL || aboveAvg == NULL) {
        printf("Memory allocation failed\n");
        free(arr);
        return 1;
    }

    // Store values below and above the average
    int belowIndex = 0, aboveIndex = 0;
    for (int i = 0; i < n; i++) {
        if (arr[i] < average)
            belowAvg[belowIndex++] = arr[i];
        else if (arr[i] > average)
            aboveAvg[aboveIndex++] = arr[i];
    }

    // Display the results
    printf("\nNumbers below the average:\n");
    for (int i = 0; i < belowCount; i++) {
        printf("%d ", belowAvg[i]);
    }

    printf("\n\nNumbers above the average:\n");
    for (int i = 0; i < aboveCount; i++) {
        printf("%d ", aboveAvg[i]);
    }

    // Free dynamically allocated memory
    free(arr);
    free(belowAvg);
    free(aboveAvg);

    return 0;
}