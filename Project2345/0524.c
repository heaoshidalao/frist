#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<stdio.h>
int main()
{
	int a;
	int b;
	int c;
	int d;
	int e;
	int zero = 0;
	for (a = 1; a <= 5; a++)
	for (b = 1; b <= 5; b++)
	for (c = 1; c <= 5; c++)
	for (d = 1; d <= 5; d++)
	for (e = 1; e <= 5; e++)
	if (1 == (b == 2) + (a == 3) && 1 == (b == 2) + (e == 4) && (1 == (c == 1) + (d == 2)) && (1 == (c == 5) + (d == 3)) && (1 == (e == 4) + (a == 1)))
	{//多次循环筛选满足条件的数字
		zero = 0;
		zero |= (1 << a);
		zero |= (1 << b);
		zero |= (1 << c);
		zero |= (1 << d);
		zero |= (1 << e);//若各个运动员名次不同，则将1左移，0连续与它们按位与则第二到第六位都是1，即111110（十进制为62），排除名次相同的数字
		if (62 == zero)
		{
			printf("名次分别是：A = %d, B = %d, C = %d, D= %d, E = %d\n", a, b, c, d, e);
		}
	}
	system("pause");
	return 0;
}
#include <stdio.h>
#include<stdlib.h>
int main()
{
	int A = 0;
	int B = 0;
	int C = 0;
	int D = 0;
	int killer = 0;
	for (killer = 'A'; killer <= 'D'; killer++)
	{
		if ('A' == killer)    //A是杀人犯
		{
			A = 1;
			C = 0;
			D = 0;
		}
		else if ('B' == killer)  //B是杀人犯
		{
			A = 0;
			C = 0;
			D = 0;
		}
		else if ('C' == killer)  //C是杀人犯
		{
			A = 0;
			C = 1;
			D = 0;
		}
		else                  //D是杀人犯
		{
			A = 0;
			C = 0;
			D = 1;
		}
		if (!A + C + D + !D == 3)    //三人说真话
			printf("A=%d\nB=%d\nC=%d\nD=%d\n", A, B, C, D);
	}
	system("pause");
	return 0;
}
#include <stdio.h>
#include <stdlib.h>

int main(){

	int a[6][6] = { 0 };
	for (int i = 1; i < 7; i++){
		for (int j = 1; j < i; j++){
			if (i == 1){
				printf("%4d\n", a[1][1] = 1);
			}
			else{
				if ((j == 1) || (i == j)){
					printf("%4d", a[i][j] = 1);
				}
				else{
					printf("%4d", a[i][j] = a[i - 1][j - 1] + a[i - 1][j]);
				}
			}
		}
		printf("\n");

	}

	system("pause");
	return 0;
}
	