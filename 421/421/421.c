#define _CRT_SECURE_NO_WARNINGS 1
#include <stdio.h>
#include<stdlib.h>
int main()
{
	int arr1[] = { 1, 3, 5, 7, 9 };
	int arr2[] = { 3, 4, 5, 6, 7 };
	int tmp;
	int i = 0;
	for (i = 0; i < sizeof(arr1) / sizeof(arr1[0]); i++)
	{
		tmp = arr1[i];
		arr1[i] = arr2[i];
		arr2[i] = tmp;
	}
	for (i = 0; i < sizeof(arr1) / sizeof(arr1[0]); i++)
	{
		printf("%d ", arr1[i]);
	}
	printf("\n");
	for (i = 0; i < sizeof(arr1) / sizeof(arr1[0]); i++)
	{
		printf("%d ", arr2[i]);
	}
	printf("\n");
	system("pause");
	return 0;
}
#include <stdio.h>
#include<math.h>
int main()
{
	int i;
	float sum = 0.0, temp = 0.0;
	for (i = 1; i <= 100; i++)
	{
		temp = pow(-1, i + 1);
		sum = sum + temp * 1 / i;
	}
	printf("sum is %f\n", sum);
	system("pause");
	return 0;
}
#include <stdio.h>
#include <stdlib.h>
int main(){
	int i = 0;
	int k = 0;
	for (i = 1; i < 100; i++)
	{
		if (i % 10 == 9)
		{
			k++;
		}
		if (i / 10 == 9)
		{
			k++;
		}
	}
	printf("%d\n", k);
	system("pause");
	return 0;
}


