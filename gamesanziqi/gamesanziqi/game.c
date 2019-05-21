#define _CRT_SECURE_NO_WARNINGS 1
#include "game.h"


void initboard(char arr[row][col], int rows, int cols)
{
	int i = 0;
	int j = 0;
	for (i = 0; i < rows; i++)
	{
		for (j = 0; j < cols; j++)
		{
			arr[i][j] = ' ';
		}
	}
}
	
void Printboard(char arr[row][col], int rows, int cols)
{
	int i = 0;
	for (i = 0; i<rows; i++)
	{
		int j = 0;
		for (j = 0; j<cols; j++)
		{
			printf(" %c ", arr[i][j]);
			if (j < cols - 1)
			{
				printf("|");
			}
		}
		printf("\n");
		if (i<rows - 1)
		{
			for (j = 0; j<cols; j++)
			{
				printf("---");
				if (j<cols - 1)
					printf("|");
			}
		}
		printf("\n");
	}
}
void PlayerMove(char arr[row][col], int rows, int cols)
{
	int x = 0;
	int y = 0;
	printf("玩家走:\n");

	while (1)
	{
		printf("请输入要走的坐标:>");
		scanf("%d%d", &x, &y);
		if (x >= 1 && x <= rows&& y >= 1 && y <= cols)
		{
			if (arr[x - 1][y - 1] == ' ')
			{
				arr[x - 1][y - 1] = '*';
				break;
			}
			else
			{
				printf("坐标被占用，请重新选择!\n");
			}
		}
		else
		{
			printf("坐标非法，请重新输入!\n");
		}
	}
}


void ComputerMove(char arr[row][col], int rows, int cols)
{
	int x = 0;
	int y = 0;
	printf("电脑走:>\n");
	while (1)
	{
		x = rand() % rows;
		y = rand() % cols;
		if (arr[x][y] == ' ')
		{
			arr[x][y] = '#';
			break;
		}
	}
}
static int IsFull(char arr[row][col], int rows, int cols)
{
	int i = 0;
	int j = 0;
	for (i = 0; i<rows; i++)
	{
		for (j = 0; j<cols; j++)
		{
			if (arr[i][j] == ' ')
			{
				return 0;
			}
		}
	}
	return 1;
}
char CheckWin(char arr[row][col], int rows, int cols)
{
	int i = 0;
	for (i = 0; i<rows; i++)
	{
		if (arr[i][0] ==arr[i][1] && arr[i][1] == arr[i][2] && arr[i][0] != ' ')
		{
			return arr[i][0];
		}
	}
	for (i = 0; i<cols; i++)
	{
		if (arr[0][i] == arr[1][i] && arr[1][i] == arr[2][i] &&arr[0][i] != ' ')
		{
			return arr[0][i];
		}
	}
	if (arr[0][0] ==arr[1][1] && arr[1][1] == arr[2][2] && arr[1][1] != ' ')
	{
		return arr[1][1];
	}
	if (arr[0][2] == arr[1][1] && arr[1][1] == arr[2][0] &&arr[1][1] != ' ')
	{
		return arr[1][1];
	}
	if (IsFull(arr, rows, cols) == 1)
	{
		return 'Q';
	}
	return 'C';
}