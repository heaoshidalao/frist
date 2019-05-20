#define _CRT_SECURE_NO_WARNINGS 1
#include "game.h"
 
void initboard(char arr[ROWS][COLS], int rows, int cols, char set)
{
	int i = 0;
	int j = 0;
	for (i = 1; i < rows; i++)
	{
		for (j = 1; j < cols; j++)
		{
			arr[i][j] = set;
		}
	}
}
void displayboard(char arr[ROWS][COLS], int row,int col)
{
	int i = 0;
	int j = 0;
	for (i = 0; i <= row; i++)
	{
		printf("%d", i);
	}
	printf("\n");
	for (i = 1; i <= row; i++)
	{
		printf("%d", i);
		for (j = 1; j <=col; j++)
		{
			printf("%c", arr[i][j]);
		}
		printf("\n");
	}
}
void setmine(char arr[ROWS][COLS], int row, int col)
{
	int count = COUNT;
	while (count)
	{

		int x = rand() % row+1;
		int y = rand ()% col+1;
		if (arr[x][y] == '0')
		{
			arr[x][y] = '1';
			count--;
		}
	}
}