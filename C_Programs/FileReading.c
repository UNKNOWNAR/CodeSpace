#include <stdio.h>
#include <limits.h>  // For INT_MAX and INT_MIN
int main() {
    FILE *file;
    int num, max = INT_MIN, min = INT_MAX;
    // Open the file in read mode
    file = fopen("data.txt", "r");
    if (file == NULL) {
        printf("Error: Could not open the file.\n");
        return 1;  // Exit with an error code
    }
    // Read integers from the file
    while (fscanf(file, "%d", &num) != EOF) {
        if (num > max) max = num;
        if (num < min) min = num;
    }
    // Close the file
    fclose(file);
    // Check if the file contained any numbers
    if (max == INT_MIN || min == INT_MAX) {
        printf("No valid numbers found in the file.\n");
    } else {
        printf("Maximum Value: %d\n", max);
        printf("Minimum Value: %d\n", min);
    }
    return 0;
}