int main()
{
    int A[] = {2, 4, 6, 8, 10};
    int i, sum = 0, *b = A+ 4;

    for (i = 0; i < 5; i++)
    {
        sum += (*b-i) - *(b - i);
    }

    printf("%d\n", sum);
}