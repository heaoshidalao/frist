#define _CRT_SECURE_NO_WARNINGS 1
////1.调整数组使奇数全部都位于偶数前面。
////
////题目：
////输入一个整数数组，实现一个函数，
////来调整该数组中数字的顺序使得数组中所有的奇数位于数组的前半部分，
////所有偶数位于数组的后半部分。
//#include<stdio.h>
//#include<stdlib.h>
//int main()
//{
//	int arr[] = {1,2,3,4,5,6,7,8,9};
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
//			for (j = i + 1; j < len;j++)
//			{
//				if (arr[j] % 2 == 1)
//				{
//					 c = arr[j];
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
//}
//2.
////杨氏矩阵 
//有一个二维数组.
//数组的每行从左到右是递增的，每列从上到下是递增的.
//在这样的数组中查找一个数字是否存在。
//时间复杂度小于O(N);
//
//数组：
//1 2 3
//2 3 4
//3 4 5
//
//
//1 3 4
//2 4 5
//4 5 6
//
//1 2 3
//4 5 6
//7 8 9
#include<stdio.h>
#include<stdlib.h>
#include<assert.h>
int search(int arr[3][3], int a, int input)
{
	assert(arr != NULL);
	/*printf("%d\n", a);*/
	int i = 0;
	int j = a - 1;
	/*printf("%d\n", j);*/
	while (i<3&&j>=0)
	{
		if (arr[i][j]>input)
		{
			j--;
		}
		else if (arr[i][j] < input)
		{
			i++;
		}
		else{
			return 1;
		}

	}
	return 0;
}
int main()
{
	int arr[3][3] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
	int row = 3;
	int col = 3;
	int input = 0;
	printf("请输入一个要查询的数：");
	scanf("%d", &input);
	int p = search(arr,row,input);
	if (p == 1)
	{
		printf("找到了%d\n", input);
	}
	else
	{
		printf("没找到%d\n", input);
	}
	system("pause");
	return 0;
}