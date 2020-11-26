//Mareena Fernandes 8669//
#include<stdio.h>
#include<stdlib.h>
#include<string.h>

int partition(int arr[],int low,int size)
{
  int j, i=-1;
  for(j=low;j<=size-1;j++)
  {
    if(arr[j]<arr[size])
    {
       i++;
       int tmp=arr[j];
       arr[j]=arr[i];
       arr[i]=tmp;
     }
  }
       int tmp=arr[i+1];
       arr[i+1]=arr[size];
       arr[size]=tmp;
  return (i+1);
}
void quicksort(int arr[],int low,int size)
{
  if(low<size)
   {
    int j=partition(arr,low,size);

    quicksort(arr,low,j-1);
    quicksort(arr,j+1,size);
   }
}
void main()
{
  int arr[20];
  printf("Enter size of array: ");
  int size;
  scanf("%d",&size);
  printf("Enter array to sort using QuickSort Algorithm: ");
  int i;
  for(i=0;i<size;i++)
  scanf("%d",&arr[i]);
  int pivot=arr[size];

  quicksort(arr,0,size-1);
  printf("Sorted Array is : ");

  for(i=0;i<size;i++)
  printf("%d ",arr[i]);
}

/*
Enter size of array: 7
Enter array to sort using QuickSort Algorithm: 100
354
89
1
-190
-12
0
Sorted Array is : -190 -12 0 1 89 100 354 
*/