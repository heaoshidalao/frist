#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<stdlib.h>
void print(int num);
int main()
{
	int n = 0;
	printf("请输入乘法口诀行列数：");
	scanf("%d", &n);
	print(n);
	system("pause");
	return 0;
}

void print(int num)
{
	int i = 1;
	int j = 1;
	for (i = 1; i <= num; i++)
	{
		for (j = 1; j <= i; j++)
		{
			printf("%d*%d=%-2d  ", i, j, i*j);
		}
		printf("\n");
	}
}
#include<stdio.h>
#include<stdlib.h>
int swap(int* px, int* py);
int main()
{
	int a = 0;
	int b = 0;
	printf("依次输入a和b的值:\n");
	scanf("%d %d", &a,&b);
	swap(&a, &b);
	printf("a=%d  b=%d\n", a, b);
	system("pause");
	return 0;
}
int swap(int* px, int* py)
{
	int tmp = 0;
	tmp = *px;
	*px = *py;
	*py = tmp;

}
#include<stdio.h>
#include<stdlib.h>
int leap_year(int year);
int main()
{
	int year = 0;
	printf("请输入一个年份：");
	scanf("%d", &year);
	leap_year(year);
	if (leap_year(year) == 1)
			{ 
			printf("%d年是闰年\n", year); 
			}
	else
	{
		printf("%d年不是闰年\n", year);
	}
	system("pause");
	return 0;

}
int leap_year(int year)
{
	
	return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
}
#include<stdio.h>
#include<stdlib.h>
void InitArr(int arr[], int sz)
{
	int i = 0; 
	for (i = 0; i < sz; i++)
	{
		arr[i] = i + 1;
	}
}
void PrintArr(int arr[], int sz)
{
	int i = 0;
	for (i = 0; i < sz; i++)
	{
		printf("%d ", arr[i]);
	}
	printf("\n");
}

void ReverseArr(int arr[], int sz)
{
	int left = 0;	
	int right = sz - 1;
	while (left < right)
	{
		int tmp = arr[left];
		arr[left] = arr[right];
		arr[right] = tmp;
		left++;	
		right--;	
	}
}
void EmptyArr(int arr[], int sz)
{
	int i = 0;
	for (i = 0; i < sz; i++)
	{
		arr[i] = 0;
	}
}

int main()
{
	int arr[10] = { 0 };
	int sz = sizeof(arr) / sizeof(arr[0]);	
	InitArr(arr, sz);
	PrintArr(arr, sz);
	ReverseArr(arr, sz);
	PrintArr(arr, sz);
	EmptyArr(arr, sz);
	PrintArr(arr, sz);
	system("pause");
	return 0;
}
#include <stdio.h>
#include<stdlib.h>
#include <math.h>
int prime(int num)
{
	int i = 0;
	int k = 0;
	k = sqrt(num);
	for (i = 2; i <= k; i++)
	{
		if (num%i == 0)
		{
			return 0;
		}
	}
	return 1;
}
int main()
{
	int num;
	int ret;
	printf("请输入一个大于1的正整数：");
	scanf("%d", &num);
	ret = prime(num);
	if (ret == 1)
	{
		printf("%d是素数\n", num);
	}
	else
	{
		printf("%d不是素数\n", num);
	}
	system("pause");
	return 0;
}


