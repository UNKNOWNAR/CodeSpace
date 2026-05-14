#include <stdio.h>
struct Student {
    char name[40];
    int roll;
    int marks[3];
}s[10];
int main() {
    printf("Enter Information About the Students\n");
    int highest = 0;
    // Taking input for 10 students
    for (int i = 0; i < 10; i++) {
        int total = 0;
        printf("\nEnter Your Name: ");
        scanf("%s", s[i].name);  
        printf("Enter Your Roll Number: ");
        scanf("%d", &s[i].roll);
        printf("Enter Your Marks (3 subjects): ");
        scanf("%d %d %d", &s[i].marks[0], &s[i].marks[1], &s[i].marks[2]);
        total = s[i].marks[0] + s[i].marks[1] + s[i].marks[2];
        if (total > highest) {
            highest = total;
        }
        printf("Thanks, student, for the input!\n");
    }
    printf("\nTop Student(s) with Highest Marks (%d):\n", highest);
    for (int i = 0; i < 10; i++) {
        int total = s[i].marks[0] + s[i].marks[1] + s[i].marks[2];
        if (total == highest) {
            printf("\nName: %s\n", s[i].name);
            printf("Roll Number: %d\n", s[i].roll);
        }
    }
    return 0;
}