#define _CRT_SECURE_NO_WARNINGS 1
//дһ���������ز����������� 1 �ĸ���
//���磺 15 0000 1111 4 �� 1

#include <stdio.h>
#include <stdlib.h>
int count(int a)
{
	int i = 0;
	int count1 = 0;
	for (i = 0; i < 32; i++)
	{
		if (a % 2 == 1)
		{
			count1++;
		}
		a = a / 2;
	}
	return count1;
}
int main()
{
	int a = 0;
	int ret = 0;
	printf("������һ������\n");
	scanf("%d", &a);
	count(a);
	ret = count(a);
	printf("1�ĸ�����%d\n", ret);
	system("pause");
	return 0;
}
//2.��ȡһ�������������������е�ż��λ������λ��
//�ֱ�������������С�

//��żλ�����ұ�������
#include <stdio.h>
#include <stdlib.h>
int count(int a)
{
	int i = 0;
	int b = 0;
	int c = 0;
	int arr1[16] = { 0 };
	int arr2[16] = { 0 };
	for (i = 0; i < 16; i++)
	{
		b = a % 2;
		arr1[i] = b;
		a = a / 2;
		c = a % 2;
		arr2[i] = c;
		a = a / 2;
	}
	printf("����λ��˳��");
	for (i = 15; i>=0; i--)
	{
		printf("%d", arr1[i]);
	}
	printf("\n");
	printf("ż��λ��˳��");
	for (i = 15; i >= 0; i--)
	{
		printf("%d", arr2[i]);
	}
	printf("\n");
	return 0;
}
int main()
{
	int a = 0;
	printf("������һ������\n");
	scanf("%d", &a);
	count(a);
	system("pause");
	return 0;
}
//3. ���һ��������ÿһλ��
#include <stdio.h>
#include <stdlib.h>
void arr(int b)
{
	int i = 0;
	while (b)
	{
		i = b % 10;
		b = b / 10;
		printf("%d", i);
	}
	printf("\n");
	return 0;
}
int main()
{
	int a = 0;
	printf("������һ��������");
	scanf("%d", &a);
	printf("������ÿһλ;\n");
	arr(a);
	system("pause");
	return 0;
}
//4.���ʵ�֣�
//����int��32λ������m��n�Ķ����Ʊ���У��ж��ٸ�λ(bit)��ͬ��
//�������� :
//1999 2299
//������� : 7
#include<stdio.h>
#include<stdlib.h>
int compare(int a, int b)
{
	int count = 0;
	int i = 0;
	int arr1[32] = { 0 };
	int arr2[32] = { 0 };
	for (i = 0; i < 32; i++)
	{
		arr1[i] = a % 2;
		a = a / 2;
		arr2[i] = b % 2;
		b = b / 2;
		if (arr1[i] != arr2[i])
		{
			count++;
		}
	}
	return count;
}

int main()
{
	int a = 0;
	int b = 0;
	int ret = 0;
	printf("��ֱ�������������");
	scanf("%d %d", &a, &b);
	compare(a, b);
	ret = compare(a, b);
	printf("%d\n", ret);
	system("pause");
	return 0;

}