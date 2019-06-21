#define _CRT_SECURE_NO_WARNINGS 1
//1.模拟实现strncpy 
#if 0
#include<stdio.h>
#include<stdlib.h>
#include<assert.h>
char* mystrcpy(char *dest , const char*scr,int n)
{
	char *p = dest;
	int i = 0;
	assert((dest!=NULL)&&(scr!=NULL));
	while ((i < n) && (*dest++ = *scr++))
	{
		i++;
	};
	*dest='\0';
	return p;
}
int main()
{
	char str[30] = { 0 };
	char str1 []= "abcdef";
	printf("%s\n", mystrcpy(str, str1,2));
	system("pause");
	return 0;
}
#endif
//2.模拟实现strncat
#if 0
#include<stdio.h>
#include<stdlib.h>
#include<assert.h>
char *strcat(char *dest, char*scr,int n)
{
	char *p = dest;
	int i = 0;
	assert((dest != NULL) && (scr != NULL));
	while (*dest != '\0')
	{
		dest++;
	}
	while ((i < n) && (*dest++ = *scr++))
	{
		i++;
	}
	*dest = '\0';
	return p;
}
int main()
{
	char str[20] = "abcde";
	char *str1 = "fghi";
	printf("%s\n", strcat(str, str1,3));
	system("pause");
	return 0;
}
#endif
//5.实现strncmp
#if 1
#include<stdio.h>
#include<stdlib.h>
#include<assert.h>
int mystrcmp(const char *str1, const char*str2,int n)
{
	int i = 0;
	int ret = 0;
	assert((str1 != NULL) && (str2 != NULL));
	while ((i < n) && (ret=*str1 -*str2)==0&&(*str1 != '\0'))
	{
		str1++;
		str2++;
		i++;
	}
	return ret;
}
	int main(){
	char *str1 = "abcde";
	char *str2 = "abdcd";
	int ret = mystrcmp(str1, str2,3);
	printf("%d\n", ret);
	system("pause");
	return 0;
}
#endif
