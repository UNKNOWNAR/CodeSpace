#include <stdio.h>
int main()
{
    struct Employee
    {
        char name[50];
        int id;
        int age;
    }e[10];
    for(int i=0;i<10;i++)
    {
        printf("Enter Name of Employee\n");
        scanf("%[^\n]",e[i].name);
        getchar();
        printf("Enter Employee id of Employee\n");
        scanf("%d",&e[i].id);
        printf("Enter age of Employee\n");
        scanf("%d",&e[i].age);
    }
    struct Employee oldest = e[0];
    for(int i=1;i<10;i++)
    {
        if(oldest.age<e[i].age)
            oldest = e[i];
    }
    printf("Name of Oldest Employee %s\n",oldest.name);
    printf("Employee id of Oldest Employee %d\n",oldest.id);
    printf("Enter age of Employee %d\n",oldest.age);
    return 0;
}