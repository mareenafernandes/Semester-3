#include<stdio.h>
#include<ctype.h>
#include<string.h>
#include<stdlib.h>

int top=-1;
void push(int stack[],int ele)
{
   if(top>=19)
     printf("Full\n" );
   else
     stack[++top]=ele;
}
int pop(int stack[])
{
   if(top==-1)
     printf("Empty\n" );
   else
     return stack[top--];
}

void main()
{
    int nodes,ele;
    puts("Enter the number of nodes: ");
    scanf("%d",&nodes);
    puts("Enter the element: ");
    scanf("%d",&ele);
    int graph[nodes][nodes];
    int stack[nodes];
}
