#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<stdlib.h>
/*
int number(int arr[], int len)
{
	int i = 0;
	int count = 0;
	int j = 0;
	for (i = 0; i < len; i++)
	{
		for (j = 0; j < len -1- i; j++)
		{
			if (arr[j]>arr[j + 1])
			{
				int temp = 0;
				temp = arr[j ];
				arr[j] = arr[j + 1];
				arr[j + 1] = arr[j];
			}
		}
	}
	for (i = 0; i < len; i++)
	{
		if (arr[i] == arr[len / 2])
		{
			count++;
		}
	}
	if (count>(len / 2))
	{
		return arr[len / 2];
	}
}
int main()
{
	int arr[] = { 1, 2, 3, 2, 5, 2, 2, 4, 2 };
	int len = sizeof(arr) / sizeof(arr[0]);
	number(arr,len);
	int q = number(arr, len);
	printf("%d\n", q);
	system("pause");
	return 0;
}µÚ¶þÌâ
int maxarray(int *arr, int len)
{
	int i = 0;
	int j = 0;
	int maxnum = 0;
		int sum = 0;
	if (arr == NULL || len < 0)
	{
		return -1;
	}
	for (i = 0; i < len;i++)
	{
		sum = 0;
		for (j = i; j < len; j++)
		{
			sum += arr[j];
			if (sum>maxnum)
			{
				maxnum = sum;
			}
		}
	}
	printf("%d\n", maxnum);
	return maxnum;
}

int main()
{
	int arr[] = { 1, -2, 3, 10, -4, 7, 2, -5 };
	int len = sizeof(arr) / sizeof(arr[0]);
	maxarray(arr, len);
	system("pause");
	return 0;
}*/
//char findoncechar(char *str)
//{
//	char *p = str;
//	int arr[256] = { 0 };
//	while (*p != '\0')
//	{
//		arr[*p]++;
//		p++;
//	}
//	while (*str != '\0')
//	{
//		if (arr[*str] == 1)
//		{
//			return *str;
//		}
//		else{
//			str++;
//		}
//	}
//	if (*str == '/0')
//	{
//		return NULL;
//	}
//
//	
//
//}
//int main()
//{
//	char *arr = "abaccdeff";
//	char idex=findoncechar(arr);
//	printf("%c\n", idex);
//	system("pause");
//	return 0;
//}
char findoncechar(char *str)
{
	char *p = str;
	int arr[256] = { 0 };
	while (*p != '\0')
	{
		arr[*p]++;
		p++;
	}
	while (*str != '\0')
	{
		if (arr[*str] == 2)
		{
			return *str;
		}
		else{
			str++;
		}
	}
	if (*str == '/0')
	{
		return NULL;
	}



}
int main()
{
	char *arr = "qywyer23tdd";
	char idex = findoncechar(arr);
	printf("%c\n", idex);
	system("pause");
	return 0;
}