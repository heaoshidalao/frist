//#define _CRT_SECURE_NO_WARNINGS 1
//1.编写函数：
//unsigned int reverse_bit(unsigned int value);
//这个函数的返回值是value的二进制位模式从左到右翻转后的值。
//
//如：
//在32位机器上25这个值包含下列各位：
//00000000000000000000000000011001
//翻转后：（2550136832）
//10011000000000000000000000000000
//程序结果返回：
//2550136832
//
//
//#include<stdio.h>
//#include<stdlib.h>
//#include <math.h>
//unsigned int reverse_bit(unsigned int value)
//{
//	int arr[32] = { 0 };
//	int i = 0;
//	int j = 0;
//	unsigned int reverse_value = 0;
//	for (i = 0; i < 32; i++)
//	{
//		arr[i] = value % 2;	
//		value = value / 2;
//	
//	}
//	for (i = 0; i <32; i++)
//	{
//		reverse_value = reverse_value + arr[i] * pow(2, 31 - i);
//	}
//	return reverse_value;
//
//}
//int main()
//{
//	int a = 0;
//	printf("请输入一个正整数：");
//	scanf("%d", &a);
//	unsigned int reverse_bit(a);
//	unsigned	int ret = reverse_bit(a);
//	printf("这个数二进制位模式从左到右翻转后的值：%u", ret);
//	system("pause");
//	return 0;
//}
//
//
//		
//2.不使用（a + b） / 2这种方式，求两个数的平均值。
//#include <stdio.h>
//#include<stdlib.h>
//int main()
//{
//	int a = 0;
//	int b = 0;
//	int average = 0;
//	printf("请分别输入a和b的值：");
//	scanf("%d %d",&a,&b);
//	average = (a - b) / 2 + b;
//	printf("这两个数的平均数是:%d\n", average);
//	system("pause");
//	return 0;
//}
//
//
//3.编程实现：
//一组数据中只有一个数字出现了一次。
//其他所有数字都是成对出现的。
//请找出这个数字。（使用位运算）
//#include<stdio.h>
//#include <stdlib.h>
//int main()
//{
//	int arr[9] = { 1, 23, 3, 5, 3, 2, 1, 2,5};
//	int temp = 0;
//	int i = 0;
//	int len = sizeof(arr) / sizeof(arr[0]);
//
//	for (i = 0; i < len; i++)
//	{
//		temp = temp^arr[i];
//
//	}
//	printf("%d\n", temp);
//	system("pause");
//	return 0;
//}
//
//
//4.
//有一个字符数组的内容为:"student a am i",
//			请你将数组的内容改为"i am a student".
//			要求：
//			不能使用库函数。
//			只能开辟有限个空间（空间个数和字符串的长度无关）。
//
//#include<stdio.h>
//#include <stdlib.h>
//#include <string.h>
//#include <assert.h>
//void reverve_swap(char *left, char *right)
//{
//	assert(left != NULL); 
//	assert(right != NULL);
//	while (left < right)
//	{
//		char tmp = *left;
//		*left = *right;
//		*right = tmp;
//		left++;
//		right--;
//	}
//}
//char *reverve(char *p)
//{
//	int len = strlen(p);
//	char *start = p;
//	char *end = NULL;
//	char *ret = p;
//	reverve_swap(p, p + len - 1); 
//	while (*p)
//	{
//		start = p;
//		while ((*p != ' ') && (*p != '\0')) 
//		{
//			p++;
//		}
//		end = p - 1;
//		reverve_swap(start, end);
//		if (*p == ' ') 
//			p++;
//	}
//	return ret;
//
//}
//int main()
//{
//	char arr[] = "student a am I";
//	printf("交换前：%s\n", arr);
//	printf("交换后：%s\n", reverve(arr));
//	system("pause");
//	return 0;
//}
