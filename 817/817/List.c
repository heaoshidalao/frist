#define _CRT_SECURE_NO_WARNINGS 1
#define _CRT_SECURE_NO_WARNINGS 1
#include "list.h"

void InitList(pList plsit)
{
	assert(plsit != NULL);
	plsit->data = -1;
	plsit->next = NULL;
}

//�õ�һ���ڵ�
Node *GetNode(int val)
{
	Node *pGet = (Node *)malloc(sizeof(Node));
	assert(pGet != NULL);
	pGet->data = val;
	pGet->next = NULL;
	return pGet;
}

//ͷ��   plist:  ͷ���ĵ�ַ
void InsertHead(pList plist, int val)//55
{
	Node *pGet = GetNode(val);
	assert(plist != NULL);
	pGet->next = plist->next;
	plist->next = pGet;
}
//weicha
void insertTail(pList plist, int val)
{
	Node *pGet = GetNode(val);
	Node *p = plist;
	while (p->next != NULL)
	{
		p = p->next;
	}
	p->next = pGet;
}
void Show(pList plist){}



Node *LastKNode(pList plist, int k)
{
	int i = 0;
	if (k < 0)
	{,
		return NULL;
	}
	Node *p = plist;
	Node *q = plist;
	for (i = 0; i < k - 1; i++)
	{
	
		if (p->next = NULL)
		{
			return NULL;
		}
		p = p->next;
	}
	while (p->next != NULL)
	{
		p = p->next;
		q = q->next;
	}
	//1����һ��ָ������K-1��
	//����ָ��ͬʱ��
}
//����
void ReverseLink(pList plist) 
{
	
	assert(plist != NULL);
	plist p = plist->next;
	plist q = p->next;
	plist->next = NULL;
	while (p != NULL)
	{
		q->next = p;
		p->next = plist->next;
		plist->next = q;
		p = q;//��һ��Ҫ���õĽڵ�
	}
}

void a(pList plist)
{
	assert(plist != NULL);
	pList p = plist;
	pList q = NULL;
	pList s = NULL;                                                                     
	pList b = NULL;

	while (p != NULL){
		q = p->next;
		if (q == NULL)
		{
			b = p;
		}
		 p->next=s;
		 q=p;
		 p = q;


	}
}













{
	Node *p = plist->next;
	while (p != NULL)
	{
		printf("%d", plist->data);
		p = plist->next;
	}
}
