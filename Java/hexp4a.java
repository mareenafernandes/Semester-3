\\Mareena Fernandes 8669\\
package hexp4a.java;
import java.util.Scanner;
public class Hexp4aJava 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
         int i, j, row, col, sum1 = 0, sum2 = 0;
         System.out.println("Enter the number of rows:");
         row = sc.nextInt();
         System.out.println("Enter the number of columns:");
         col = sc.nextInt();
         
         int[][] mat = new int[row][col];
         
         System.out.println("Enter the elements of the matrix") ;
         for(i=0;i<row;i++)
         { 
             for(j=0;j<col;j++)
             { 
                 mat[i][j] = sc.nextInt();
             }
         }
    System.out.println("The elements of the matrix") ;
    for(i=0;i<row;i++)
    { 
        for(j=0;j<col;j++)
        {
            System.out.print(mat[i][j]+"\t");
        }
        System.out.println("");
    }
    for(i=0;i<row;i++)
       { 
            for(j=0;j<col;j++)
            { 
                if(i==j) 
                {
                    sum1 = sum1 + mat[i][j];
                }
                else
                {
                    sum2 = sum2 + mat[i][j];
                }
            }
        }
    System.out.printf("SUM of DIAGONAL elements of the matrix = " + sum1) ;
    System.out.printf("\nSUM of NON-DIAGONAL elements of the matrix = " + sum2) ;
    } 
}
\*
Enter the number of rows:
3
Enter the number of columns:
3
Enter the elements of the matrix
12
56
67
0
45
0
1
6
27
The elements of the matrix
12	56	67	
0	45	0	
1	6	27	
SUM of DIAGONAL elements of the matrix = 84
SUM of NON-DIAGONAL elements of the matrix = 130
*\
