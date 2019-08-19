#ifndef __LIST_H__
#define __LIST_H__
//#pragma once
#include<stdio.h>
#include<assert.h>
#include<stdlib.h>

typedef struct Node
{
	int data;
	struct Node *next;
}Node, *pList;

//初始化
void InitList(pList plsit);

//头插

//尾插

//打印



//任意位置插入

//删除

//查找




#endif //__LIST_H__