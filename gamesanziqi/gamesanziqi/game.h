#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<stdlib.h>

#define row 3
#define col 3


void initboard(char arr[row][col], int rows, int cols);

void Printboard(char arr[row][col], int rows, int cols);
void PlayerMove(char board[row][col], int rows, int cols);
void ComputerMove(char board[row][col], int rows, int cols);
char CheckWin(char arr[row][col], int rows, int cols);