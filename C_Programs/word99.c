#include<stdio.h>
int main()
{
	char word[5],word1[5];
	printf("Enter A Word:- ");
	for(int i=0;i<5;i++)
	{
		scanf("%c",&word[i]);
		word[i] = (char)((int)word[i]-30);
	}
	for(int i=0;i<5;i++)
	{
		printf("%c",word[i]);
	}
	return 0;
}                                                     
