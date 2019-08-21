#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<stdlib.h>
/*char* deleterepeatechar(char *str1, char *str2)
{
	
	char *s = str1;
	char *w = str1;
	char arr[256] = { 0 };
	while (*str2!= '\0')
	{
		arr[*str2] = 1;
		str2++;
	}
	while (*s != '\0')
	{
		if (arr[*s] != 1)
		{
			*w = *s;
			w++;
		}
			s++;	
	}
	*w = '\0';
	return str1;
}
int main()
{
	char str1[] = "Wlcome to cvte";
	char str2[] = "cvte";
	//deleterepeatechar(str1, str2);
	printf("%s\n", deleterepeatechar(str1, str2));
	system("pause");
	return 0;
}*/
/*
void hanshu(int *arr,int len)
{
	int sum = 0;
	int i = 0;
	int a = 0;
	int b = 0;
	int count = 0;
	for (i = 0; i < len; i++)
	{
		sum = sum^arr[i];
	}
	int c = sum;
	while (sum % 2 == 0)
	{
		sum=sum >> 1;
		count++;
	}
	for (i = 0; i < len; i++)
	{
		if ((arr[i] >> count) % 2 == 1)
		{
			a = a^arr[i];
		}
	}
	printf("%d\n", a);
	b = c^a;
	
	printf("%d\n", b);
	
}
int main()
{
	int arr[] = { 1, 3, 5, 7, 1, 3, 5, 9 };
	int len = sizeof(arr) / sizeof(arr[0]);
	hanshu(arr, len);
	system("pause");
	return 0;
}*/
//回文数
#if 0
int huiwenshu(int *arr, int len)
{
	int *p = arr;
	int *q = arr + len - 1;
	int count = 0;
	while (p < q)
	{
		if (*p ==*q)
		{
		return 1;
	}
	else return 0;
}
int main()
{
	int arr[] = { 1, 2, 3,2, 1 };
	int len = sizeof(arr) / sizeof(arr[0]);
	int ret=huiwenshu(arr, len);
	if (ret ==1)
	{
		printf("是回文数");
	}
	else
			count++;
			p++;
			q--;
		}
		else
		{
			return 0;
		}
	}
	if (count == len / 2)
	{
		printf("不是回文数");
	system("pause");
	return 0;
}
#endif