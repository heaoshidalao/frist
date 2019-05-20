#define _CRT_SECURE_NO_WARNINGS 1
#define ROW 9
#define COL 9

#define ROWS ROW+2
#define COLS COL+2

#define COUNT 10

#include<stdio.h>
#include<stdlib.h>
#include<time.h>
#include<string.h>
void initboard(char arr[ROWS][COLS], int rows, int cols, char set);
void displayboard(char arr[ROWS][COLS],int row, int col);
void setmine(char arr[ROWS][COLS], int row, int col);