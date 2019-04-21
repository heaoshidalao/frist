#define _CRT_SECURE_NO_WARNINGS 1
#include <stdio.h> 
#include <stdlib.h>
int main()
{
	int year = 1000;//count = 0;
	for (year = 1000; year <= 2000; year++)
	{
		if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
		{

			printf("%d ", year);
		}
	}
	printf("\n");
	system("pause");
	return 0;
}

