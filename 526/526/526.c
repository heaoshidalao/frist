//#define _CRT_SECURE_NO_WARNINGS 1
//1.��д������
//unsigned int reverse_bit(unsigned int value);
//��������ķ���ֵ��value�Ķ�����λģʽ�����ҷ�ת���ֵ��
//
//�磺
//��32λ������25���ֵ�������и�λ��
//00000000000000000000000000011001
//��ת�󣺣�2550136832��
//10011000000000000000000000000000
//���������أ�
//2550136832
//
//
//#include<stdio.h>
//#include<stdlib.h>
//#include <math.h>
//unsigned int reverse_bit(unsigned int value)
//{
//	int arr[32] = { 0 };
//	int i = 0;
//	int j = 0;
//	unsigned int reverse_value = 0;
//	for (i = 0; i < 32; i++)
//	{
//		arr[i] = value % 2;	
//		value = value / 2;
//	
//	}
//	for (i = 0; i <32; i++)
//	{
//		reverse_value = reverse_value + arr[i] * pow(2, 31 - i);
//	}
//	return reverse_value;
//
//}
//int main()
//{
//	int a = 0;
//	printf("������һ����������");
//	scanf("%d", &a);
//	unsigned int reverse_bit(a);
//	unsigned	int ret = reverse_bit(a);
//	printf("�����������λģʽ�����ҷ�ת���ֵ��%u", ret);
//	system("pause");
//	return 0;
//}
//
//
//		
//2.��ʹ�ã�a + b�� / 2���ַ�ʽ������������ƽ��ֵ��
//#include <stdio.h>
//#include<stdlib.h>
//int main()
//{
//	int a = 0;
//	int b = 0;
//	int average = 0;
//	printf("��ֱ�����a��b��ֵ��");
//	scanf("%d %d",&a,&b);
//	average = (a - b) / 2 + b;
//	printf("����������ƽ������:%d\n", average);
//	system("pause");
//	return 0;
//}
//
//
//3.���ʵ�֣�
//һ��������ֻ��һ�����ֳ�����һ�Ρ�
//�����������ֶ��ǳɶԳ��ֵġ�
//���ҳ�������֡���ʹ��λ���㣩
//#include<stdio.h>
//#include <stdlib.h>
//int main()
//{
//	int arr[9] = { 1, 23, 3, 5, 3, 2, 1, 2,5};
//	int temp = 0;
//	int i = 0;
//	int len = sizeof(arr) / sizeof(arr[0]);
//
//	for (i = 0; i < len; i++)
//	{
//		temp = temp^arr[i];
//
//	}
//	printf("%d\n", temp);
//	system("pause");
//	return 0;
//}
//
//
//4.
//��һ���ַ����������Ϊ:"student a am i",
//			���㽫��������ݸ�Ϊ"i am a student".
//			Ҫ��
//			����ʹ�ÿ⺯����
//			ֻ�ܿ������޸��ռ䣨�ռ�������ַ����ĳ����޹أ���
//
//#include<stdio.h>
//#include <stdlib.h>
//#include <string.h>
//#include <assert.h>
//void reverve_swap(char *left, char *right)
//{
//	assert(left != NULL); 
//	assert(right != NULL);
//	while (left < right)
//	{
//		char tmp = *left;
//		*left = *right;
//		*right = tmp;
//		left++;
//		right--;
//	}
//}
//char *reverve(char *p)
//{
//	int len = strlen(p);
//	char *start = p;
//	char *end = NULL;
//	char *ret = p;
//	reverve_swap(p, p + len - 1); 
//	while (*p)
//	{
//		start = p;
//		while ((*p != ' ') && (*p != '\0')) 
//		{
//			p++;
//		}
//		end = p - 1;
//		reverve_swap(start, end);
//		if (*p == ' ') 
//			p++;
//	}
//	return ret;
//
//}
//int main()
//{
//	char arr[] = "student a am I";
//	printf("����ǰ��%s\n", arr);
//	printf("������%s\n", reverve(arr));
//	system("pause");
//	return 0;
//}
