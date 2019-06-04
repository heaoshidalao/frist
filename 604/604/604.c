#define _CRT_SECURE_NO_WARNINGS 1
//1.调整数组使奇数全部都位于偶数前面。
//
//题目：
//输入一个整数数组，实现一个函数，
//来调整该数组中数字的顺序使得数组中所有的奇数位于数组的前半部分，
//所有偶数位于数组的后半部分。
#include<stdio.h>
#include<stdlib.h>
int main()
{
	int arr[] = {1,2,3,4,5,6,7,8,9};
	int len = sizeof(arr) / sizeof(arr[0]);
	int i = 0;
	int j = 0;
	int c = 0;
	for (i = 0; i < len; i++)
	{
		if (arr[i] % 2 == 1)
		{
	
			continue;
		}
		else
		{
			for (j = i + 1; j < len;j++)
			{
				if (arr[j] % 2 == 1)
				{
					 c = arr[j];
					arr[j] = arr[i];
					arr[i] = c;
				}
				else
				{
					continue;
				}
			}
		}

	}
	for (i = 0; i < len; i++)
	{
		printf("%d", arr[i]);
	}
	printf("\n");
	system("pause");
	return 0;

}
//#include<stdio.h>
//#include<stdlib.h>
//int main()
//{
//	int arr[] = { 1, 2, 3 };
//	int len = sizeof(arr) / sizeof(arr[0]);
//	int i = 0;
//	int j = 0;
//	int c = 0;
//	for (i = 0; i < len; i++)
//	{
//		if (arr[i] % 2 == 1)
//		{
//
//			continue;
//		}
//		else
//		{
//			for (j = i + 1; j < len; j++)
//			{
//				if (arr[j] % 2 == 1)
//				{
//					c = arr[j];
//					arr[j] = arr[i];
//					arr[i] = c;
//				}
//				else
//				{
//					continue;
//				}
//			}
//		}
//
//	}
//	for (i = 0; i < len; i++)
//	{
//		printf("%d", arr[i]);
//	}
//	printf("\n");
//	system("pause");
//	return 0;
//
//}