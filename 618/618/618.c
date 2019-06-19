#define _CRT_SECURE_NO_WARNINGS 1
//1.一个数组中只有两个数字是出现一次，
//其他所有数字都出现了两次。
//找出这两个只出现一次的数字，编程实现。
//#include<stdio.h>
//#include<stdlib.h>
//#include<math.h>
//int find(int *arr,int len,int *num1,int *num2)
//{
//	int i = 0;
//	int sum = 0;
//	int count = 0;
//	for (i = 0; i < len ; i++)
//	{
//		sum = sum^arr[i];
//	}
//	int d = sum;//后面的sum发生改变，但是还要用到sum,把sum值保存一份
//	for (i = 0; i < 32; i++)
//	{
//		if (sum % 2 == 1)
//		{
//			break;
//		}
//		sum = sum / 2;
//		count++;
//	}
//	for (i = 0; i < len; i++)
//	{
//		if ((arr[i]>>count)%2== 0)
//		{
//			*num1 = *num1^arr[i];
//		}
//	}
//	*num2 = *num1^d;
//	return 0;
//}
//int main()
//{
//	int arr[8] = { 1, 2, 1, 2, 11, 15};
//	int num1 = 0;
//	int num2 = 0;
//	int len = sizeof(arr) / sizeof(arr[0]);
//	find(arr, len,&num1,&num2);
//	printf("%d %d\n", num1,num2);
//	system("pause");
//	return 0;
//}
//2.喝汽水，1瓶汽水1元，2个空瓶可以换一瓶汽水，
//给20元，可以多少汽水。
//编程实现。
//#include<stdio.h>
//#include<stdlib.h>
//int main()
//{
//	int money = 20;
//	int sum = 0;
//	int k = 0;
//	sum = money / 1;
//	k = sum;
//	while (k  >= 2)
//	{++
//		sum = sum + k / 2;
//		k = k / 2+k%2;
//	}
//		printf("%d\n", sum);
//	system("pause");
//	return 0;
//}
//3.模拟实现strcpy 
//#include<stdio.h>
//#include<stdlib.h>
//#include<assert.h>
//char* mystrcpy(char *dest , const char*scr)
//{
//	char *p = dest;
//	assert((dest!=NULL)&&(scr!=NULL));
//	while (*dest++ = *scr++);
//	return p;
//}
//int main()
//{
//	char str[30] = { 0 };
//	char str1 []= "abcdef";
//	printf("%s\n", mystrcpy(str, str1));
//	system("pause");
//	return 0;
//}


//4.模拟实现strcat
#include<stdio.h>
#include<stdlib.h>
#include<assert.h>
char *strcat(char *dest,char*scr)
{
	int *p = dest;
	assert((dest != NULL) && (scr != NULL));
	while (*dest != '\0')
	{
		dest++;
	}
	while (*dest++ = *scr++);
	return p;
}
int main()
{
	char str[20] = "abcde";
	char *str1 = "fghi";
	printf("%s\n", strcat(str,str1));
	system("pause");
	return 0;
}
