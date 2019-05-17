#define _CRT_SECURE_NO_WARNINGS 1
//#include <stdio.h>
//#include <stdlib.h>
//int fib(int n)
//{
//	if (n <= 2)
//		return 1;
//	else
//		return fib(n - 1) + fib(n - 2);
//}
//int main()
//{
//	int n = 0;
//	printf("请输入n：");
//	scanf("%d", &n);
//	int ret = fib(n);
//
//	printf("第%d个数是：%d\n", n, ret);
//	system("pause");
//	return 0;
//}
//#include <stdio.h>
//#include <stdlib.h>
//int fib(int n)
//{
//	int a = 1;
//	int b = 1;
//	int c = 1;
//	while (n>2)
//	{
//		c = a + b;
//		a = b;
//		b = c;
//		n--;
//	}
//	return c;
//}
//int main()
//{
//	int n = 0;
//	printf("请输入n：");
//	scanf("%d", &n);
//	int ret = fib(n);
//	printf("第%d个数是：%d\n", n, ret);
//	system("pause");
//	return 0;
//}
//#include <stdio.h>
//#include <stdlib.h>
//int fun(int a, int b)
//{
//	if (b == 0)
//	{
//		return 1;
//	}
//	else if (b == 1)
//	{
//		return a;
//	}
//	else
//	{
//		return a*fun(a, b - 1);
//	}
//}
//int main()
//{
//	int n = 0;
//	int k = 0;
//	int ret = 0;
//	printf("n^k,输入n,k:\n");
//	scanf("%d%d", &n, &k);
//	printf("运算结果：\n");
//	printf("%d\n", fun(n, k));
//	system("pause");
//	return 0;
//}
//#include <stdio.h>
//#include <stdlib.h>
//int DigitSum(int n)
//{
//	if (n > 0)
//	{
//		return n % 10 + DigitSum(n / 10);
//	}
//	return 0;
//}
//int main()
//{
//	int num = 0;
//	scanf("%d", &num);
//	printf("%d\n", DigitSum(num));
//	system("pause");
//	return 0;
//}
//#include <stdio.h>
//#include "stdlib.h"
//#include<stdio.h>
//void reverse_string(char *string)
//{
//	if ('\0' != *(++string))
//		reverse_string(string);
//	printf("%c", *(string - 1));
//}
//int main()
//{
//	char *a = "abcde";
//	reverse_string(a);
//	printf("\n");
//	system("pause");
//	return 0;
//}
//递归实现strlen 
//#include <stdio.h>
//#include <stdlib.h>
//int strlen(char *a)
//{
//	if (*a == '\0')
//		return 0;
//	else
//		return 1 + strlen(a + 1);
//}
//int main()
//{
//	int len = strlen("abcdef");
//	printf("%d\n", len);
//	system("pause");
//	return 0;
//}
//非递归实现strlen 
//#include <stdio.h>
//#include <stdlib.h>
//int strlen(char *a)
//{
//	int count = 0;
//	while (*a != '\0')
//	{
//		count++;
//		a++;
//	}
//	return count;
//}
//int main()
//{
//	int len = strlen("abcdef");
//	printf("%d\n", len);
//	system("pause");
//	return 0;
//}
//递归实现n的阶乘
//#include <stdio.h>
//#include <stdlib.h>
//int fac(int n)
//{
//	if (n < 2)
//		return 1;
//	else
//		return n*fac(n - 1);
//}
//int main()
//{
//	int n = 0;
//	printf("请输入n是:");
//	scanf("%d", &n);
//	int ret = fac(n);
//	printf("%d阶乘是：%d\n", n, ret);
//	system("pause");
//	return 0;
//}
//非递归实现n的阶乘
#/*include <stdio.h>
#include <stdlib.h>
int fac(int n)
{
	int ret = 1;
	int i = 0;
	for (i = 1; i <= n; i++)
	{
		ret = i*ret;
	}
	return ret;
}
int main()
{
	int n = 0;
		printf("请输入n是:");
		scanf("%d", &n);
		int ret = fac(n);
		printf("%d阶乘是：%d\n", n, ret);
		system("pause");
		return 0;
}*/
#include <stdio.h>
#include <stdlib.h>
int print(int n)
{
	if (n > 9)
	{
		print(n / 10);
	}
	printf("%5d", n % 10);
	return 0;
}
int main()
{
	int n = 0;
	printf("请输入一个数n:");
	scanf("%d", &n);
	print(n);
	printf("\n");
	system("pause");
	return 0;
}