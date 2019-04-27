#define _CRT_SECURE_NO_WARNINGS 1
#include <stdio.h>
#include <stdlib.h>
int main()
{
	int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	int k = 0;
	scanf("%d", &k);
	int left = 0;
	int right = sizeof(arr) / sizeof(arr[0]) - 1;
	while (left <= right)
	{
		int mid = (right - left) / 2 + left;
		if (arr[mid] < k)
		{
			left = left++;


		}
		else if (arr[mid]>k)
		{
			right = right--;
		}
		else if (arr[mid] = k)
		{
			printf("这个数下标是%d\n", mid);
			break;
		}
	}
	if (left > right)
	{
		printf("这个数不存在\n");
	}




	system("pause");
	return 0;
}