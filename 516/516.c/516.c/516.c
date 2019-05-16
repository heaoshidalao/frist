#define _CRT_SECURE_NO_WARNINGS 1
//#include <stdio.h>
//#include <stdlib.h>
//int fib(int n)
//{
//	if (n <= 2)
//		return 1;
//	else
//		return fib(n - 1)+fib(n - 2);
//}
//int main()
//{
//	int n=0;
//	printf("请输入n：");
//	scanf("%d", &n);
//		int ret = fib(n);
//
//	printf("第%d个数是：%d\n",n, ret);
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
//	printf("第%d个数是：%d\n",n, ret);
//	system("pause");
//	return 0;
//}
#include <stdio.h>
#include <stdlib.h>
int fac(int n)
{
	if (n < 2)
		return 1;
	else
		return n*fac(n - 1);

}
int main()
{
	int n = 0;
	printf("请输入n是:");
	scanf("%d", &n);
	int ret = fac(n);
	printf("%d阶乘是：%d\n",n,ret);
	system("pause");
	return 0;
}