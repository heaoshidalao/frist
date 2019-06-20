#define _CRT_SECURE_NO_WARNINGS 1
//1.模拟实现strcpy 
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


////2.模拟实现strcat
//#include<stdio.h>
//#include<stdlib.h>
//#include<assert.h>
//char *strcat(char *dest, char*scr)
//{
//	int *p = dest;
//	assert((dest != NULL) && (scr != NULL));
//	while (*dest != '\0')
//	{
//		dest++;
//	}
//	while (*dest++ = *scr++);
//	return p;
//}
//int main()
//{
//	char str[20] = "abcde";
//	char *str1 = "fghi";
//	printf("%s\n", strcat(str, str1));
//	system("pause");
//	return 0;
//}
//3.实现strstr
//#include<stdio.h>
//#include<stdlib.h>
//#include<assert.h>
//const char *mystrstr(const char *str1, const *str2)
//{
//	const char *arr1 = str1;
//	const char *arr2 = str2;
//	const char *s = arr1;
//	assert((str1 != NULL) && (str2!= NULL));
//	while (*s != '\0')
//	{
//		arr1 = s;
//		arr2 = str2;
//		while ((*arr1!='\0')&&(*arr2!='\0')&&(*arr1==*arr2))
//		{
//			arr1++;
//			arr2++;
//		}
//		if (*arr2 == '\0')
//		{
//			return s;
//		}
//		if(*arr1=='\0')
//		{
//			return NULL;
//		}
//		s++;
//	}
//	return NULL;
//}
//int main()
//{
//	char *str1 = "abbbcd";
//	char *str2 = "bbc";
//	printf("%s\n", mystrstr(str1, str2));
//	system("pause");
//	return 0;
//}
//4.实现strchr
#if 0
#include<stdio.h>
#include<stdlib.h>
#include<assert.h>
 char *mystrchr(const char *str1, int str2)
{
	char *arr1 = str1;
	char *s = str2;
	assert((str1 !=NULL) && (str2!= NULL));
	while (*s != '\0')
	{
		while ((*arr1!='\0')&&(*arr1!=*s))
		{
			arr1++;
		}
		if(*arr1=='\0')
		{
			return NULL;
		}
		else{
			return arr1;
		}
	}
	return NULL;
}
int main()
{
	char *str1 = "rwrabbbbcd";
	char *str2 = "b";
	printf("%s\n", mystrchr(str1, str2));
	system("pause");
	return 0;
}
#endif
//5.实现strcmp
#if 0
#include<stdio.h>
#include<stdlib.h>
#include<assert.h>
int mystrcmp(const char *str1, const char*str2)
{
	assert((str1 != NULL) && (str2 != NULL));
	//if (strlen(str1)!=)
	while (*str1== *str2)
	{
		if (*str1 == '\0')
		{
			return 0;
		}
		str1++;
		str2++;
	}
	if (*str1 > *str2)
	{
		return 1;
	}
	else 
	{	return -1;
	}
}
int main()
{
	char *str1 = "abcde";
	char *str2 = "abdcd";
	int ret = mystrcmp(str1, str2);
	printf("%d\n", ret);
	system("pause");
	return 0;
}
#endif
//6.实现memcpy
#if 0
#include<stdio.h>
#include<stdlib.h>
#include<assert.h>
void *mymemcpy(void *dest, void *src,int count)
{
	void *ret = dest;
	while (count--)
	{
		*(char *)dest = *(char *)src;
		((char *)dest)++;
		((char *)src)++;
	}
	return ret;
}
int main()
{
	int i = 0;
	int arr[20] = { 0 };
	int arr1[5] = { 1, 2, 3, 4, 5 };
	mymemcpy(arr, arr1, 12);
	for (i = 0; i < 3; i++)
	{
		printf("%d", arr[i]);
	}
	printf("\n");
	system("pause");
	return 0;
}
#endif
//7.实现memmove
#if 1
#include<stdio.h>
#include<stdlib.h>
#include<assert.h>
void *memmove(void *dest, const void *src, size_t n) {
	int i;
	char * dest_t = (char *)dest;
	char * src_t = (char *)src;
	if (src_t + n > dest_t && src_t < dest_t) {// 从后往前复制
		i = n - 1;
		while (i >= 0) {
			*(dest_t + i) = *(src_t + i);
			i--;
		}
	}
	else {	// 从前往后复制
		i = 0;
		while (i < n) {

			*(dest_t + i) = *(src_t + i);
			i++;
		}
	}
	return dest;
}
int main()
{
	int i = 0;
	int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
	memmove(arr, arr + 2, 16);
	for (i = 0; i < 7; i++)
	{
		printf("%d", arr[i]);
	}
	printf("\n");
	system("pause");
	return 0;
}
#endif