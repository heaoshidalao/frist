#define _CRT_SECURE_NO_WARNINGS 1
////1.��������ʹ����ȫ����λ��ż��ǰ�档
////
////��Ŀ��
////����һ���������飬ʵ��һ��������
////�����������������ֵ�˳��ʹ�����������е�����λ�������ǰ�벿�֣�
////����ż��λ������ĺ�벿�֡�
//#include<stdio.h>
//#include<stdlib.h>
//int main()
//{
//	int arr[] = {1,2,3,4,5,6,7,8,9};
//	int len = sizeof(arr) / sizeof(arr[0]);
//	int i = 0;
//	int j = 0;
//	int c = 0;
//	for (i = 0; i < len; i++)
//	{
//		if (arr[i] % 2 == 1)
//		{
//	
//			continue;
//		}
//		else
//		{
//			for (j = i + 1; j < len;j++)
//			{
//				if (arr[j] % 2 == 1)
//				{
//					 c = arr[j];
//					arr[j] = arr[i];
//					arr[i] = c;
//				}
//				else
//				{
//					continue;
//				}
//			}
//		}
//
//	}
//	for (i = 0; i < len; i++)
//	{
//		printf("%d", arr[i]);
//	}
//	printf("\n");
//	system("pause");
//	return 0;
//}
//2.
////���Ͼ��� 
//��һ����ά����.
//�����ÿ�д������ǵ����ģ�ÿ�д��ϵ����ǵ�����.
//�������������в���һ�������Ƿ���ڡ�
//ʱ�临�Ӷ�С��O(N);
//
//���飺
//1 2 3
//2 3 4
//3 4 5
//
//
//1 3 4
//2 4 5
//4 5 6
//
//1 2 3
//4 5 6
//7 8 9
#include<stdio.h>
#include<stdlib.h>
#include<assert.h>
int search(int arr[3][3], int a, int input)
{
	assert(arr != NULL);
	/*printf("%d\n", a);*/
	int i = 0;
	int j = a - 1;
	/*printf("%d\n", j);*/
	while (i<3&&j>=0)
	{
		if (arr[i][j]>input)
		{
			j--;
		}
		else if (arr[i][j] < input)
		{
			i++;
		}
		else{
			return 1;
		}

	}
	return 0;
}
int main()
{
	int arr[3][3] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
	int row = 3;
	int col = 3;
	int input = 0;
	printf("������һ��Ҫ��ѯ������");
	scanf("%d", &input);
	int p = search(arr,row,input);
	if (p == 1)
	{
		printf("�ҵ���%d\n", input);
	}
	else
	{
		printf("û�ҵ�%d\n", input);
	}
	system("pause");
	return 0;
}