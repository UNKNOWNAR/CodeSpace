#include <stdio.h>
void reverseArray(int arr[], int n) {
    
}

int main() {
    int n;
    printf("Enter the size of the array: ");
    scanf("%d", &n);

    int arr[n], unique[n], freq[n], uniqueCount = 0;
    printf("Enter %d elements: ", n);
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
        freq[i] = 0;
    }

    for (int i = 0; i < n; i++) {
        int duplicate = 0;
        for (int j = 0; j < uniqueCount; j++) {
            if (arr[i] == unique[j]) {
                duplicate = 1;
                break;
            }
        }
        if (!duplicate) {
            unique[uniqueCount++] = arr[i];
        }
    }

    for (int i = 0; i < uniqueCount / 2; i++) {
        int temp = unique[i];
        unique[i] = unique[uniqueCount - i - 1];
        unique[uniqueCount - i - 1] = temp;
    }
    printf("Number of Duplicates %d\n",n-uniqueCount);
    printf("Array without duplicates in reverse order: ");
    for (int i = 0; i < uniqueCount; i++) {
        printf("%d ", unique[i]);
    }
    return 0;
}