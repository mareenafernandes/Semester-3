//Mareena Fernandes 8669//
#include<stdio.h>
int stack[50];
int top1 = -1, top2 = 50;
void push(int ele, int pushno)
{
	int f, k;
	if (top2 - top1 == 1)
	{
		printf("Stack Overflow");
	}
	else
	{
		if(pushno == 1)
		{
			top1 ++;
			stack[top1] = ele;
			printf("Current stack1 is \n");
			for(k = top1; k>=0; k--)
			{
				printf("%d\n", stack[k]);
			}
		}
		else if(pushno == 2)
		{
			top2 --;
			stack[top2] = ele;
			printf("Current stack2 is \n");
			for(f = 49; f>=top2; f--)
			{
				printf("%d\n", stack[f]);
			}
		}
		else
		{
			printf("Invalid stack number\n");
		}
	}
}
void pop()
{
	int b;
	printf("Enter stack number to pop: ");
	scanf("%d", &b);
	if(b == 1)
	{
		if(top1 == -1)
			printf("Underflow");
		else
		{
			printf("Popped element is %d", stack[top1]);
			top1 --;
		}
	}
	else if(b == 2)
	{
		if(top2 == 50)
			printf("Underflow");
		else
		{
			printf("Popped element is %d", stack[top2]);
			top2 ++;
		}
	}
	else
		printf("Invalid stack number");
}
void main()
{
	int x, y, z, i, j;
	do
	{
		printf(" 1. Push\n 2. Pop\n 3. Display\n 4. EXit\n \n Enter your choice: ");
		scanf("%d", &x);
		switch(x)
		{
			case 1: printf("Enter element and stack number \n" );
                                scanf("%d %d",&y,&z);
                                push(y,z);
                                break;
			case 2: pop();
        			break;
			case 3: printf("Current stack 1 is: \n" );
               			for(int c=top1;c>=0;c--)
                 			printf("%d\n", stack[c]);
                		printf("Current stack 2 is: \n" );
                 		for(i=19;i>top2;i--)
                   			printf("%d\n", stack[i]);
                		break;
			case 4: printf("EXIT");
				break;
			default: printf("Invaild choice!!!\n ");
		}
	}
	while (x != 4);
}
