//Mareena Fernandes 8669//
#include <stdio.h>
void insert();
void delete();
void display();
int queuearray[50];
int rear = - 1;
int front = -1;
void main()
{
    int choice;
    while (1)
    {
        printf("1.Insert element to queue \n2.Delete element from queue \n3.Display all elements of queue \n4.Quit \n\nEnter your choice : ");
        scanf("%d", &choice);
        switch (choice)
        {
            case 1:insert();
            	   break;
            case 2:delete();
            	   break;
            case 3:display();
            	   break;
            case 4:printf("Exit\n");
            	   break;
            default:printf("Invalid Input \n");
        }
    }
}
void insert()
{
    int x;
    if (rear == 50 - 1)
    printf("Queue Overflow \n");
    else
    {
        if (front == -1)
        front++;
        printf("\nInset the element in queue : ");
        scanf("%d", &x);
        rear++;
        queuearray[rear] = x;
    }
}
void delete()
{
    if (front == -1 || front > rear)
    {
        printf("\nQueue Underflow \n");
        return ;
    }
    else
    {
        printf("\nElement deleted from queue is : %d\n", queuearray[front]);
        front++;
    }

}
void display()
{
    int i;
    if (front == -1)
        printf("Queue is empty \n");
    else
    {
        printf("\nQueue is : \n");
        for (i = front; i <= rear; i++)
            printf("%d ", queuearray[i]);
        printf("\n");
    }
}