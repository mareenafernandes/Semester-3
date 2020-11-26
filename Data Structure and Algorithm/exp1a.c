#include<stdio.h>
int stack[50], top=-1, x, y, n, c;
int pop();
int push();
int peek();
void display();
void main()
{
printf("Enter the size of the array: "); 
scanf("%d", &n);
printf("Operations:\n1.Push\n2.Pop\n3.Peek\n4.Display\n5.Exit");
do 
	{
	 printf("\nEnter your choice: ");
	 scanf("%d", &c);
	 switch(c)
		{
		 case 1:printf("Enter the Element: ");
		 scanf("%d",&x);
		 push(x);
		 break;
		 case 2:y=pop();
		 printf("\n%d",y);
		 break;
		 case 3:peek();
		 printf("%d",y);
		 break;
		 case 4:display();
		 break;
		 case 5:printf("Exit");
		 break;
		 default:printf("invalid");
		}
	}
while(c!=5);
}
int push(int x)
{
	if(top==n-1)
	printf("\nStack overflow");
	else
		{
		 top++;
		 stack[top]=x;
		}
}
int pop()
{
int y;
	if(top==-1)
	{printf("\nStack underflow");}
	else
		{
		 y=stack[top];
		 top--;
	return y;
}
}
int peek()
{
	if(top==-1)
	printf("Empty");
	else
	return stack[top];
}
void display()
{
int i;
for(i=top;i>=0;i--)
	{
	 printf("%d",stack[i]);
	 printf("\n");
	}
}
