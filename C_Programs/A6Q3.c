#include <stdio.h>

void addMatrix(int A[3][3], int B[3][3], int C[3][3]) {
    for (int i = 0; i < 3; i++)
        for (int j = 0; j < 3; j++)
            C[i][j] = A[i][j] + B[i][j];
}

void subtractMatrix(int A[3][3], int B[3][3], int C[3][3]) {
    for (int i = 0; i < 3; i++)
        for (int j = 0; j < 3; j++)
            C[i][j] = A[i][j] - B[i][j];
}

void multiplyMatrix(int A[3][3], int B[3][3], int C[3][3]) {
    for (int i = 0; i < 3; i++)
        for (int j = 0; j < 3; j++) {
            C[i][j] = 0;
            for (int k = 0; k < 3; k++)
                C[i][j] += A[i][k] * B[k][j];
        }
}

void displayMatrix(int C[3][3]) {
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            printf("%d ", C[i][j]);
        }
        printf("\n");
    }
}

int main() {
    int A[3][3], B[3][3], C[3][3];
    int choice;

    printf("Enter elements of first 3x3 matrix:\n");
    for (int i = 0; i < 3; i++)
        for (int j = 0; j < 3; j++)
            scanf("%d", &A[i][j]);

    printf("Enter elements of second 3x3 matrix:\n");
    for (int i = 0; i < 3; i++)
        for (int j = 0; j < 3; j++)
            scanf("%d", &B[i][j]);

    do {
        printf("\nMenu:\n1. Add Matrices\n2. Subtract Matrices\n3. Multiply Matrices\n4. Exit\nEnter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                addMatrix(A, B, C);
                printf("Result of Addition:\n");
                displayMatrix(C);
                break;
            case 2:
                subtractMatrix(A, B, C);
                printf("Result of Subtraction:\n");
                displayMatrix(C);
                break;
            case 3:
                multiplyMatrix(A, B, C);
                printf("Result of Multiplication:\n");
                displayMatrix(C);
                break;
            case 4:
                printf("Exiting...\n");
                break;
            default:
                printf("Invalid choice! Try again.\n");
        }
    } while (choice != 4);

    return 0;
}