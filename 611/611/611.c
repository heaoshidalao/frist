#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<stdlib.h>
int main()
{
	/*int a[] = { 1, 2, 3, 4 };
	printf("%d\n", sizeof(a));
	
	printf("%d\n", sizeof(a + 0));
	printf("%d\n", a + 1);
	printf("%d\n", sizeof(*a));
	printf("%d\n", sizeof(a + 1));
	printf("%d\n", sizeof(a[1]));
	printf("%d\n", sizeof(&a));
	printf("%d\n", sizeof(*&a));
	printf("%d\n", sizeof(&a + 1));
	printf("%d\n", sizeof(&a[0]));
	printf("%d\n", sizeof(&a[0] + 1));*/
	//
	//�ַ�����
	/*char arr[] = { 'a', 'b', 'c', 'd', 'e', 'f' };*/
	/*printf("%d\n", sizeof(arr));
	printf("%d\n", arr);
	printf("%d\n", sizeof(arr + 0));
	printf("%d\n", arr + 0);
	printf("%d\n", sizeof(*arr));
	printf("%d\n", *arr);
	printf("%d\n", sizeof(arr[1]));
	printf("%d\n", arr[1]);
	printf("%d\n", sizeof(&arr));
	printf("%d\n", &arr);
	printf("%d\n", sizeof(&arr + 1));
	printf("%d\n", &arr + 1);
	printf("%d\n", sizeof(&arr[0] + 1));
	printf("%d\n", &arr[0] + 1);*/
	/*printf("%d\n", strlen(arr));
	printf("%d\n", strlen(arr + 0));
	printf("%d\n", arr[1]);
	printf("%d\n", *arr);
	printf("%d\n", strlen(arr[1]));printf("%d\n", strlen(*arr));
	
	printf("%d\n", strlen(&arr));
	printf("%d\n", strlen(&arr + 1));
	printf("%d\n", strlen(&arr[0] + 1));*/
	//char arr[] = "abcdef";
	///*printf("%d\n", sizeof(arr));
	//printf("%d\n", sizeof(arr + 0));
	//printf("%d\n",arr + 0);
	//printf("%d\n", sizeof(*arr));
	//printf("%d\n", sizeof(arr[1]));
	//printf("%d\n", sizeof(&arr));
	//printf("%d\n", sizeof(&arr + 1));
	//printf("%d\n", sizeof(&arr[0] + 1));*/
	//printf("%d\n", strlen(arr));
	//printf("%d\n", strlen(arr + 0));
	//printf("%d\n", *arr);
	//printf("%d\n", strlen(*arr));//*arrָ����a����Ӧ��97
	//printf("%d\n", strlen(arr[1]));
	//printf("%d\n", strlen(&arr));
	//printf("%d\n", strlen(&arr + 1));
	//printf("%d\n", strlen(&arr[0] + 1));
	char *p = "abcdef";
	/*printf("%d\n", sizeof(p));
	printf("%d\n", sizeof(p + 1));
	printf("%d\n", sizeof(*p));
	printf("%d\n", sizeof(p[0]));
	printf("%d\n", sizeof(&p));
	printf("%d\n", sizeof(&p + 1));
	printf("%d\n", sizeof(&p[0] + 1));*/
	/*printf("%d\n", strlen(p));
	printf("%d\n", strlen(p + 1));
	printf("%d\n", p);
	printf("%d\n", p + 1);
	printf("%d\n", *p);
	printf("%d\n", p[0]);
	printf("%d\n", &p);
	printf("%d\n", &p + 1);*/
	/*printf("%d\n", strlen(*p));
	printf("%d\n", strlen(p[0]));
	printf("%d\n", strlen(&p));
	printf("%d\n", strlen(&p + 1));*/
	
	//	//��ά����
		int a[3][4] = { 0 };
	/*printf("%d\n", sizeof(a));
	printf("%d\n", sizeof(a[0][0]));
	printf("%d\n", sizeof(a[0]));	printf("%d\n", a[0]);
	printf("%d\n", sizeof(a[0] + 1));printf("%d\n", a[0] + 1);
	printf("%d\n", sizeof(*(a[0] + 1)));printf("%d\n", *(a[0] + 1));
	printf("%d\n", sizeof(a + 1));printf("%d\n", a + 1);*/

	
	
	
	printf("%d\n", sizeof(*(a + 1)));
	printf("%d\n", *(a + 1));
	printf("%d\n", sizeof(&a[0] + 1));
	printf("%d\n", sizeof(*(&a[0] + 1)));
	printf("%d\n", sizeof(*a));
	printf("%d\n", sizeof(a[3]));
	system("pause");
	return 0;
}