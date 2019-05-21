#define _CRT_SECURE_NO_WARNINGS 1
#include "game.h"
void game()
{
	char ret = 0;
	char board[row][col] = { 0 };
	initboard(board, row, col);
	Printboard(board, row, col);
	while (1)
	{
		PlayerMove(board, row, col);
		Printboard(board, row, col);
		ret = CheckWin(board, row, col);
		if (ret != 'C')
		{
			break;
		}
		ComputerMove(board, row, col);
		Printboard(board, row, col);
		ret = CheckWin(board, row, col);
		if (ret != 'C')
		{
			break;
		}
	}
	if (ret == '*')
	{
		printf("玩家赢\n");
	}
	else if (ret == '#')
	{
		printf("电脑赢\n");
	}
	else if (ret == 'Q')
	{
		printf("平局\n");
	}

}
void menu()
{
	printf("****************************\n");
	printf("******     1.play     ******\n");
	printf("******     0.exit     ******\n");
	printf("****************************\n");
}
void test()
{
	int intput = 0;	 
	do{
		menu();
		printf("请输入你的选择：");
		scanf("%d", &intput);
		switch (intput)
		{
		case 1:
			game();
			break;
		case 0:
			printf("退出游戏\n");
			break;
		default:
			printf("选择错误\n");
			break;
		}

	} while (intput);
	

}
int main()
{
	test(); 
	system("pause");
	return 0;


}