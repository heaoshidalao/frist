#define _CRT_SECURE_NO_WARNINGS 1
#include <stdio.h> 
 #include <stdlib.h>
 #include <time.h>
  
void menu() 
 { 
	printf("**************************\n"); 
 	printf("*****     1. play    *****\n"); 
	printf("*****     0. exit    *****\n"); 
 	printf("**************************\n"); 
 } 
  
   void game() 
 { 
 	
	int ret = 0; 
 	int guess = 0; 
 	ret = rand()%100+1; 
 	
 	while(1) 
 	{ 
 		printf("�������:>"); 
 		scanf("%d", &guess); 
 		if(guess>ret) 
 		{ 
 			printf("�´���\n"); 
 		} 
 		else if(guess<ret) 
 		{ 
			printf("��С��\n"); 
 		} 
 		else 
 		{ 
			printf("��ϲ�㣬�¶���\n"); 
 			break; 
 		} 
 	} 
 } 
 
 int main() 
 { 
 	int input = 0; 
 	srand((unsigned int)time(NULL)); 
 	do  
 	{ 
 		menu(); 
 		printf("��ѡ��:>"); 
 		scanf("%d", &input); 
 		switch(input) 
 		{ 
 		case 1: 
 			game(); 
 			break; 
 		case 0: 
 			printf("�˳���Ϸ\n"); 
 			break; 
 		default: 
 			printf("ѡ�����\n"); 
 			break; 
 		} 
 	} while (input); 
 	system("pause"); 
 	return 0; 
 } 


#include<stdio.h>
#include<stdlib.h>
int main()
{
	int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	int k = 0;
	scanf("%d", &k);
	int left = 0;
	int right = sizeof(arr) / sizeof(arr[0])-1;
	
	while(left <= right)
	{
		int mid = (right - left) / 2 + left;
		if (arr[mid] > k)
		{
			right = mid-1;
		}
		else if (arr[mid] < k)
		{
			left = mid + 1;
		}
		else if (left = right){

			printf("�ҵ���������±���%d\n", mid);
			break;
		}
		
	}
	if (left > right)
		{
			printf("�����������\n");

		}
		system("pause");
		return -1;
	
}
#include<stdio.h>
#include<stdlib.h>
int main(){ 
	int i = 0; 
 	char password[20] = {0}; 
  
 	for(i=0; i<3; i++) 
 	{ 
 		printf("����������:>"); 
 		scanf("%s", password); 
 		if(strcmp(password, "123456") == 0)
 		{ 
			printf("��¼�ɹ�\n");  			
			break; 
 		} 
		else 
 		{ 
 			printf("�������\n"); 
 		} 
 	} 
 	if(i == 3) 
		printf("����������������˳�����\n"); 
  
 	system("pause"); 
 	return 0; 
 } 
#include<stdio.h>
#include <stdlib.h>
int main()
{
	int ch;
	printf("������һ���ַ�:\n");
	while ((ch = getchar()) != EOF)
	{
		if (ch >= 'a'&&ch <= 'z')
			printf("%c\n", ch - 32);
		else
		if (ch >= 'A'&&ch <= 'Z')
			printf("%c\n", ch + 32);
		else
		if (ch >= '0'&&ch <= '9')
			;
		else
			;
	}
	printf("\n");
	system("pause");
	return 0;
}
