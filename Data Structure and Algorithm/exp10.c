#include<stdio.h>
#include<stdlib.h>
#include<ctype.h>

void maxHeapify(int arr[],int size,int i)
{
    int l = (2*i)+1;
    int r =(2*i)+2;
    int largest = i;

    if(l<size && arr[l]>arr[largest])
        largest = l;

    if(r<size && arr[r]>arr[largest])
        largest = r;

    if(largest != i)
    {
        int temp;
        temp=arr[i];
        arr[i]=arr[largest];
        arr[largest]=temp;
      maxHeapify(arr,size,largest);
    }
}

void buildMaxHeap(int arr[],int size
{
    int i;
    for(i=size/2 -1;i>=0;i--)
        maxHeapify(arr,size,i);

    for (i=size-1; i>=0; i--)
    {
        int temp;
        temp=arr[i];
        arr[i]=arr[0];
        arr[0]=temp;
        maxHeapify(arr,i,0);
    }
}

void main()
{
    printf("Enter size of array to sort using heapsort algorithm: \n");
    int size;
    scanf("%d",&size);
    int arr[size];
    int i;
    printf("Enter values \n");

    for(i=0;i<size;i++)
    {
        printf("\n-->");
        scanf("%d",&arr[i]);
    }

    buildMaxHeap(arr,size);

    printf("Sorted array is");

    for(i=0;i<size;i++)
        printf("%d \t",arr[i]);
}
