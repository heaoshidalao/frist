#define _CRT_SECURE_NO_WARNINGS 1
#include "game.h"
void game()
{
	char mine[ROWS][COLS] = { 0 };
	char show[ROWS][COLS] = { 0 };
	initboard(mine,ROWS,COLS,'0');
	initboard(show, ROWS, COLS, '*');
	displayboard(mine, ROW, COL);
	displayboard(show, ROW, COL);
	setmine(mine, ROW, COL);
	displayboard(mine, ROW, COL);
	displayboard(show, ROW, COL);
}
void menu()
{	printf("**************************\n");
	printf("*******   1.play   *******\n");
	printf("*******   0.exit   *******\n");
	printf("**************************\n");
	
}


void test()
{
	srand((unsigned int)time(NULL));
	int input = 0;
	do
	{
		menu();
		printf("��ѡ��:>");
		scanf("%d", &input);
		switch (input)
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

}

int main()
{
	/*srand((unsigned int)time(NULL));*/
	test();
	system("pause");
	return 0;
}
