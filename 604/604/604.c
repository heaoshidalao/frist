#define _CRT_SECURE_NO_WARNINGS 1
//1.��������ʹ����ȫ����λ��ż��ǰ�档
//
//��Ŀ��
//����һ���������飬ʵ��һ��������
//�����������������ֵ�˳��ʹ�����������е�����λ�������ǰ�벿�֣�
//����ż��λ������ĺ�벿�֡�
#include<stdio.h>
#include<stdlib.h>
int main()
{
	int arr[] = {1,2,3,4,5,6,7,8,9};
	int len = sizeof(arr) / sizeof(arr[0]);
	int i = 0;
	int j = 0;
	int c = 0;
	for (i = 0; i < len; i++)
	{
		if (arr[i] % 2 == 1)
		{
	
			continue;
		}
		else
		{
			for (j = i + 1; j < len;j++)
			{
				if (arr[j] % 2 == 1)
				{
					 c = arr[j];
					arr[j] = arr[i];
					arr[i] = c;
				}
				else
				{
					continue;
				}
			}
		}

	}
	for (i = 0; i < len; i++)
	{
		printf("%d", arr[i]);
	}
	printf("\n");
	system("pause");
	return 0;

}
//#include<stdio.h>
//#include<stdlib.h>
//int main()
//{
//	int arr[] = { 1, 2, 3 };
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
//			for (j = i + 1; j < len; j++)
//			{
//				if (arr[j] % 2 == 1)
//				{
//					c = arr[j];
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
//
//}