#define _CRT_SECURE_NO_WARNINGS 1
//#include <stdio.h>
//#include<string.h>
//#include <stdlib.h>
//int main()
//{
//	char arr1[] = "             ";
//	char arr2[] = "*************";
//	int left=0 ;
//	int right = strlen(arr2) - 1;
//	int mid = (left + right) / 2;
//	printf("%d\n", mid);
//	left = mid;
//	right = mid;
//	while(left != 0)
//	{
//		arr1[left] = arr2[left];
//		arr1[right] = arr2[right];
//		printf("%s\n", arr1);
//		left--;
//		right++;
//	}
//	while(left <= right)
//	{
//		arr2[left] = arr1[left];
//		arr2[right] = arr1[right];
//		printf("%s\n", arr2);
//		left++;
//		right--;
//
//
//	}
//	system("pause");
//	return 0;
//}
#include <stdio.h>
#include<string.h>
#include <stdlib.h>
int main()
{
	char arr1[] = "             ";
	char arr2[] = "*************";
	int left = 0;
	int right = strlen(arr2) - 1;
	int mid = (left + right) / 2;
	left = mid;
	right = mid;
	while (left != -1)
	{
		arr1[left] = arr2[left];
		arr1[right] = arr2[right];
		printf("%s\n", arr1);
		left--;
		right++;
	}
	char arr3[] = "             ";
	left++;
	right--;
	while (left < right)
	{
		arr1[left] = arr3[left];
		arr1[right] = arr3[right];
		printf("%s\n", arr1);
		left++;
		right--;


	}
	system("pause");
	return 0;
}


#include<stdio.h>
#include<stdlib.h> 
int main()

{

	int i, j, k, n;
	int sum = 0;

	for (n = 100; n<1000; n++)

	{

		i = n / 100;

		j = n / 10 - i * 10;

		k = n % 10;

		if (n == i*i*i + j*j*j + k*k*k)
		{

			printf("%d\n", n);
			sum++;
		}

	}
	printf("总数是%d\n", sum);
	system("pause");
	return 0;

}


#include <stdio.h>
#include<stdlib.h>
int main()
{
	int a;
	int i = 0;
	int j = 0;
	int sum = 0;
	scanf("%d", &a);
	for (i = 0; i < 5; i++)
	{
		j = (j * 10 + a);
		sum = sum + j;
	}
	printf("%d\n", sum);
	system("pause");
	return 0;
}