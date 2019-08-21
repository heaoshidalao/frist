#define _CRT_SECURE_NO_WARNINGS 1
#include <stdio.h>
#include<stdlib.h>
void findk(int arr[],int len,int k)
{
	int* arr1 = arr;
	int i = 0;
	int j = 0;
	int s = 0;
	int sum = 0;
	/*if (k > len)
	{
		return 0;
	}*/
	for (i = 0; i < k; i++)
	{
		sum = 0;
		for (j = 0; j < len - 1; j++)
		{

			/*if (arr[j]>arr1[j+1] && sum>=s)
			{
			sum = arr1[j];
			}*/
			if (arr[j] < arr[j + 1]&&arr[j]>s)
			{
				arr[j+1] = arr[j];
			}
		}
		printf("%d", arr[j]);
		s = arr[j];
	}
}
int main()
{
	int a[] = { 2, 4, 6, 8, 1, 3, 5, 7 };
	int len = sizeof(a) / sizeof(a[0]);
	int k = 0;
	findk(a, len, 1);
	system("pause");
	return 0;
}