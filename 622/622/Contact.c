#define _CRT_SECURE_NO_WARNINGS 1
#include"Contact.h"

void InitContact(Contact *pCon)
{
	int i = 0;
	assert(pCon != NULL);
	pCon->usedSize = 0;
	for (i = 0; i < 1000; i++)
	{

	}
	memset(pCon->per, 0, sizeof(pCon->per));

}

void AddContact(Contact *pCon)
{
	assert(pCon != NULL);
	if (pCon->usedSize == MAX_NUMPERSON)
	{
		printf("人数已满！\n");
		return;
	}
	printf("请输入姓名：\n");
	scanf("%s", pCon->per[pCon->usedSize].name);
	printf("请输入性别：\n");
	scanf("%s", pCon->per[pCon->usedSize].sex);
	printf("请输入年龄：\n");
	scanf("%d", &(pCon->per[pCon->usedSize].age));
	printf("请输入电话：\n");
	scanf("%s", pCon->per[pCon->usedSize].tele);
	printf("请输入住址：\n");
	scanf("%s", pCon->per[pCon->usedSize].addr);

	pCon->usedSize++;
}
//根据姓名查找
int SearchContact(Contact *pCon)
{
	char Nam[MAX_NAME];
	int i = 0;
	assert(pCon != NULL);
	if (pCon->usedSize == 0)
	{
		return -1;
	}
	printf("请输入姓名：\n");
	scanf("%s", Nam);
	for (i = 0; i < pCon->usedSize; i++)
	{
		if (strcmp(Nam, pCon->per[i].name) == 0)
		{
			return i;
		}
	}
	return -1;
}
//删除
void DelContact(Contact *pCon)
{
	int i = 0;
	int index = SearchContact(pCon);

	if (-1 == index)
	{
		printf("没有此人！\n");
		return;
	}

	for (i = index; i < pCon->usedSize - 1; i++)
	{
		pCon->per[i] = pCon->per[i + 1];
	}
	pCon->usedSize--;
	printf("删除成功！\n");

}

void ShowContact(Contact *pCon)
{
	int i = 0;
	assert(pCon != NULL);
	printf("%-20s %-10s  %-10s %-11s %-15s\n", "姓名", "性别", "年龄", "电话", "地址");

	for (i = 0; i < pCon->usedSize ; i++)
	{
		printf("%-20s%-10s%-10d%-11s%-15s\n", pCon->per[i].name, pCon->per[i].sex, pCon->per[i].age, pCon->per[i].tele, pCon->per[i].addr);

	} 

}


void bubble_sort(Contact *pCon)
{
	int i = 0;
	int j = 0;
	for (i = 0; i < pCon->usedSize - 1; i++)
	{
		int j = 0;
		for (j = 0; j < pCon->usedSize - 1 - i; j++)
		{
			if (strcmp(pCon->per[j].name, pCon->per[j + 1].name)>0)
			{
				PersonInfo temp;
				temp = pCon->per[j];
				pCon->per[j] = pCon->per[j + 1];
				pCon->per[j + 1] = temp;
			}
		}
	}
}
