//Mareena Fernandes 8669//
#include<stdio.h>
#include<stdlib.h>
#include<string.h>
void merge(int arr[],int t,int m,int u)
{
  int i=t;  
  int j=m+1; 
  int k=0;
  int temp[j]; 

    while(i<=m && j<=u)
    {
      if(arr[i]<arr[j])
        temp[k++]=arr[i++];
      else
        temp[k++]=arr[j++];
     }

    while(i<=m)
      temp[k++]=arr[i++];

    while(j<=u)
      temp[k++]=arr[j++];

    for(i=t,j=0;i<=u;i++,j++)
      arr[i]=temp[j];     
 }

void mergesort(int arr[],int i,int j)
{
  if(i<j)
   {
    int k=(i+j)/2;
      mergesort(arr,i,k);     
      mergesort(arr,k+1,j);    
      merge(arr,i,k,j);   
   }     
}
void main()
{
  int arr[10];
  int size,i;
    printf("Enter size of array:");
    scanf("%d",&size);
    puts("Enter array to sort using MergeSort Algorithm: ");
    for(i=0;i<size;i++)
      scanf("%d",&arr[i]);
    mergesort(arr,0,size-1);
    printf("Sorted Array is :");
    for(i=0;i<size;i++)
        printf("%d ",arr[i]);
}

/*
Enter size of array:5
Enter array to sort using MergeSort Algorithm: 
12
-1
0
45
57
Sorted Array is :-1 0 12 45 57 
*/
