#include<stdio.h>
#include<malloc.h>
struct node
{
 int info;
 struct node * next;
 struct node * prev;
};
struct node * start=NULL;
struct node * first=NULL;
struct node * f=NULL;
void insertbegin(int x)
{
 struct node *p;
 p=(struct node *)malloc(sizeof(struct node));
 p->info=x;
 if(start==NULL)
 {
  p->next=NULL;
  start=p;
 }
 else
 {
  p->next=start;
  start=p;
 }
}
void copy()
{
 struct node *p,*q,*temp;
 p=start;
 while(p!=NULL)
 {  
  if(first==NULL)
  {
   temp=(struct node*)malloc(sizeof(struct node));
   temp->info=p->info;
   temp->next=NULL;
   first=temp;
   q=temp;
  }
  else
  { 
   q->next=(struct node*)malloc(sizeof(struct node));
   q=q->next;
   q->info=p->info;
   q->next=NULL;
  }
  p=p->next;
 }
}
void concatenate()
{
 struct node *p;
 p=start;
 while(p->next!=NULL)
 {
  p=p->next;
 }
 p->next=first;
}
/*void split(int key)
{
 struct node *p,*q,*s;
 p=start;
 while(p->info!=key)
 {
  q=p;
  p=p->next;
 }
 q->next=NULL;
 first=p;
}
void reverse()
{
 struct node *p,*temp,*q;
 p=first;
 while(p!=NULL)
 {
  if(f==NULL)
  {
   temp=(struct node*)malloc(sizeof(struct node));
   temp->info=p->info;
   temp->next=NULL;
   temp->prev=NULL;
   f=temp;
   q=temp;
  }
  else
  {
   q->next=(struct node *)malloc(sizeof(struct node));
   q=q->next;
   q->info=p->info;
   q->next=NULL;
   q->prev=temp;
   temp=temp->next;
  }
 p=p->prev;
 }
}*/
void count()
{
int count=0;
struct node *p;
p=start;
while(p!=NULL)
{
 count++;
 p=p->next;
}
printf("\nNumber of nodes is: %d",count);
}
void display1()
{
 struct node *p;
 p=start;
 if(p==NULL)
 printf("\nEmpty");
 else
 {
  while(p!=NULL)
  {
   printf("\n%d",p->info);
   p=p->next;
  } 
 }
}
void display2()
{ struct node *p;
 p=first;
 if(p==NULL)
 printf("\nEmpty");
 else
 { while(p!=NULL)
  { 
   printf("\n%d",p->info);
   p=p->next;
  }
 }
}
void main()
{
 int ch,x;
 printf("1.Insert a element\n2.Copy\n3.Concatenate\n4.Split\n5.Reverse\n6.Count\n7.Display the original list\n8.Display the modified list\n9.Exit");
 do
 {
  printf("\nEnter the choice: ");
  scanf("%d",&ch);
  switch(ch)
  {
   case 1:printf("\nEnter the element: ");
          scanf("%d",&x);
          insertbegin(x);
          break;
   case 2:copy();
          printf("\nFirst linked list is copied into second linked list");
          break;
   case 3:concatenate();
          printf("\nSecond linked list is joined at the end of first linked list");
          break;
/*   case 4:printf("\nEnter the element from where you want to split linked list");
          scanf("%d",&x);
          split(x);
          break;
   case 5:reverse();
          printf("\nReverse of original linked list is done");
          break;*/
   case 6:count();
          break;
   case 7:display1();
          break;
   case 8:display2();
          break;
   case 9:printf("EXIT");
   default:printf("\nInvalid choice");
  } 
 }while(ch!=9);
}
