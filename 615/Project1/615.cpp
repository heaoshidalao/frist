#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<stdlib.h>
#include<assert.h>
//char *MyStrcpy(char *arr, const char *str)
//{
//	char *p = arr;
//	assert((arr != NULL) && (str != NULL));
//	while (*arr++ = *str++)
//	{
//		;
//	}
//	return p;
//}
//
//char*MyStrcat(char *dest, const char *str)
//{
//	char*p = dest;
//	assert(dest != NULL&&str != NULL);
//	while (*dest = '\0')
//	{
//		p++;
//	}
//	while (*dest++ = *str++)
//		return p;
//
//}
//int main()
//{
//	char arr[20] = "hello";
//	char* str = "bit";
//	MyStrcat
//
//}
//int mystrcmp(char*str1,char*str2)
//
//{
//	
//	while(*str1 == *str2)
//	{
//		
//		
//			if (*str1 == '\0')
//			{
//				return 0;
//			}
//			else if (*str1 > *str2)
//			{
//				return -1;
//			}
//			else if (*str1 < *str2)
//			{
//				return 1;
//			}
//			str1++;
//			str2++;
//	}
//	if (*str1 > *str2)
//	{
//		return -1;
//	}
//	else if (*str1 < *str2)
//	{
//		return 1;
//	}
//
//	
//}
//int main()
//{
//	int ret = 0;
//	char *str1 = "abc";
//	char *str2 = "abcd";
//	ret = mystrcmp(str1, str2);
//	printf("%d\n", ret);
//	system("pause");
//	return 0;
//}
//char *MynStrcpy(char *arr, const char *str, int n)
//{
//	char *p = arr; int i = 0;
//	assert((arr != NULL) && (str != NULL));
//	
//	
//	while (i<n)
//	{
//		*arr++ = *str++;
//		i++;
//	}
//	*arr = '\0';
//	return p;
//}
char *MyStrncat(char *dest, const char *str, int n)
{
	char *p = dest;
	int i = 0;
	assert(dest != NULL&&str != NULL);
	while (*dest != '\0')
	{
		p++;
	}
	/*while (*dest++ = *str++)*/
	while (i <n)
	{
		*dest++ = *str++;
		i++;
	}
	*dest = '\0';
	return p;

}
int main()
{
	int ret = 0;
	char str1[40] = "abcd";
	char *str2 = "hello";
	int n = 2;

	/*MynStrcpy(str1, str2, 2);*/
	MyStrncat(str1, str2, 3);
	printf("%s\n", str1);
	system("pause");
	return 0;
}