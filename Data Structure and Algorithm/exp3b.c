//Mareena Fernandes 8669//
#include<stdio.h>
void insert_front();
void insert_rear();
void delete_front();
void delete_rear();
void display();
int queuearray[50];
int rear = - 1;
int front = - 1;
struct dequeue 
{
	int Q[10];
	int f,r;
}dq;
void main()
{
    int choice;
    while (1)
    {
        printf("Enter a choice: \n1.Insert element at front end \n2.Insert element at rear end \n3.Delete element from front end \n4.Delete element 			from rear end \n5.Display all elements of queue \n6.Exit");
        scanf("%d", &choice);
        switch (choice)
        {
            case 1:insert_front();
            	   break;
            case 2:insert_rear();
            	   break;
            case 3:delete_front();
            	   break;
            case 4:delete_rear();
            	   break;
            case 5:display();
            	   break;
            case 6:printf("Exit");
    		   break;
            default:printf("Invalid Input \n");
        }
    }
}
void display()
{
	int i;
	for(i=dq.f;i!=dq.r;i=(i+1)%10)
		printf("%d ",dq.Q[i]);
	printf("%d ",dq.Q[i]);
}
void insert_rear(int ele)
{
	if(dq.f==-1 && dq.r==-1)
	{
		dq.f=0;
  		dq.r=0;
   		dq.Q[dq.r]=ele;
  	}
  	else if(dq.f==(dq.r+1)%10)
		printf("Queue is full\n");
  	else
  	{
		dq.f=0;
    		dq.r=(dq.r+1)%5;
    		dq.Q[dq.r]=ele;
  	}
}
int remove_rear()
{
	int x;
	if(dq.f==-1 && dq.r==-1)
		printf("Underflow \n" );
	else if (dq.f==dq.r) 
	{
		x=dq.Q[dq.r];
		dq.f=dq.r=-1;
		return x;
	}
	else
	{
  		x=dq.Q[dq.r];
		dq.r=((dq.r-1)%10);
		return x;
	}
}
void insert_front(int ele)
{
	if(dq.f==-1 && dq.r==-1)
 	{
		dq.f=0;
   		dq.r=0;
   		dq.Q[dq.r]=ele;
  	}
  	else if(dq.r==10)
		printf("Queue is full\n");
  	else
  	{
		dq.r=(dq.r+1)%10;
    		dq.Q[dq.r]=ele;
  	}
}
int remove_front()
{
	int a;
   	if(dq.f==dq.r && dq.r==-1)
		printf("Queue is empty\n" );
	else if(dq.f==dq.r)
	{
  		a=dq.Q[dq.f];
  		dq.f=-1;
  		dq.r=-1;
  		return (a);
	}
	else
	{
  		a=dq.Q[dq.f];
  		dq.f=(dq.f+1)%10;
  		return(a);
	}
}
