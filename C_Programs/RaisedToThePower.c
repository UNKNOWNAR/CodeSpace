#include<stdio.h>
#include<math.h>
int main()
{
	int x,y,result = 0;
	printf("Enter Two Numbers\n");
	scanf("%d %d",&x,&y);
	result = pow(x,y);
	printf("%d raised to the power of %d is %d",x,y,result);
	return 0;
}