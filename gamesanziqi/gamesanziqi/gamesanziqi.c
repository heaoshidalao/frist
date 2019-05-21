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
		printf("���Ӯ\n");
	}
	else if (ret == '#')
	{
		printf("����Ӯ\n");
	}
	else if (ret == 'Q')
	{
		printf("ƽ��\n");
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
		printf("���������ѡ��");
		scanf("%d", &intput);
		switch (intput)
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

	} while (intput);
	

}
int main()
{
	test(); 
	system("pause");
	return 0;


}