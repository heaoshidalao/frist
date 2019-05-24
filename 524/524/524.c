#define _CRT_SECURE_NO_WARNINGS 1
//写一个函数返回参数二进制中 1 的个数
//比如： 15 0000 1111 4 个 1

#include <stdio.h>
#include <stdlib.h>
int count(int a)
{
	int i = 0;
	int count1 = 0;
	for (i = 0; i < 32; i++)
	{
		if (a % 2 == 1)
		{
			count1++;
		}
		a = a / 2;
	}
	return count1;
}
int main()
{
	int a = 0;
	int ret = 0;
	printf("请输入一个数：\n");
	scanf("%d", &a);
	count(a);
	ret = count(a);
	printf("1的个数是%d\n", ret);
	system("pause");
	return 0;
}
//2.获取一个数二进制序列中所有的偶数位和奇数位，
//分别输出二进制序列。

//奇偶位数从右边往左数
#include <stdio.h>
#include <stdlib.h>
int count(int a)
{
	int i = 0;
	int b = 0;
	int c = 0;
	int arr1[16] = { 0 };
	int arr2[16] = { 0 };
	for (i = 0; i < 16; i++)
	{
		b = a % 2;
		arr1[i] = b;
		a = a / 2;
		c = a % 2;
		arr2[i] = c;
		a = a / 2;
	}
	printf("奇数位的顺序：");
	for (i = 15; i>=0; i--)
	{
		printf("%d", arr1[i]);
	}
	printf("\n");
	printf("偶数位的顺序：");
	for (i = 15; i >= 0; i--)
	{
		printf("%d", arr2[i]);
	}
	printf("\n");
	return 0;
}
int main()
{
	int a = 0;
	printf("请输入一个数：\n");
	scanf("%d", &a);
	count(a);
	system("pause");
	return 0;
}
//3. 输出一个整数的每一位。
#include <stdio.h>
#include <stdlib.h>
void arr(int b)
{
	int i = 0;
	while (b)
	{
		i = b % 10;
		b = b / 10;
		printf("%d", i);
	}
	printf("\n");
	return 0;
}
int main()
{
	int a = 0;
	printf("请输入一个整数：");
	scanf("%d", &a);
	printf("该整数每一位;\n");
	arr(a);
	system("pause");
	return 0;
}
//4.编程实现：
//两个int（32位）整数m和n的二进制表达中，有多少个位(bit)不同？
//输入例子 :
//1999 2299
//输出例子 : 7
#include<stdio.h>
#include<stdlib.h>
int compare(int a, int b)
{
	int count = 0;
	int i = 0;
	int arr1[32] = { 0 };
	int arr2[32] = { 0 };
	for (i = 0; i < 32; i++)
	{
		arr1[i] = a % 2;
		a = a / 2;
		arr2[i] = b % 2;
		b = b / 2;
		if (arr1[i] != arr2[i])
		{
			count++;
		}
	}
	return count;
}

int main()
{
	int a = 0;
	int b = 0;
	int ret = 0;
	printf("请分别输入两个数：");
	scanf("%d %d", &a, &b);
	compare(a, b);
	ret = compare(a, b);
	printf("%d\n", ret);
	system("pause");
	return 0;

}