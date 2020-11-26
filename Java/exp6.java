//Mareena Fernandes 8669//
import java.util.*;
public class Demo
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int m,n,q,choice;
	do
        {
            System.out.println("1) Add \n2) Matrices \n3) Exit\n\n");
            System.out.println("Enter the choice: ");
            choice=sc.nextInt();
            switch(choice) 
            {
                case 1:System.out.println("Enter the number rows and columns: ");
                m = sc.nextInt();
		n = sc.nextInt();
                int[][] a = new int[m][n];
                int[][] b = new int[m][n];
                System.out.println("Enter elements of A: ");
                for(int i=0;i<m;i++)
                {
                    for(int j=0;j<n;j++)
                    {
                        a[i][j] = sc.nextInt();
                    }
                }
                display_matrix(a,m,n);
                System.out.println("Enter elements of B: ");
                for(int i=0;i<m;i++)
                {
                    for(int j=0;j<n;j++)
                    {
                        b[i][j] = sc.nextInt();
                    }
		}
                display_matrix(b,m,n);
                add_matrix(a,b,m,n);
                break;
                case 2:System.out.println("Enter m , n and q to Multiply  two matrices of order  M X N and N X Q ");
                m = sc.nextInt();
                n = sc.nextInt();
                q = sc.nextInt();
                int[][]c = new int[m][n];
                int[][]d = new int[n][q];
                System.out.println("Enter elements of C: ");
                for(int i=0;i<m;i++) 
                {
                    for(int j=0;j<n;j++)
                    {
                        c[i][j] = sc.nextInt();
                    }
                }
                display_matrix(c,m,n);
                System.out.println("Enter elements of D: ");
                for(int i=0;i<n;i++) 
                {
                    for(int j=0;j<q;j++)
                    {
                        d[i][j] = sc.nextInt();
                    }
                }
                display_matrix(d,n,q);
                multi_matrix(c,d,m,n,q);
		break;
                case 3:System.out.println("EXIT");
                break;
                default: System.out.println("Invalid Input");
            }
        }while(choice!=3);
    }
    private static void multi_matrix(int[][] c, int[][] d,int m ,int n , int q) 
    {
        int i,j,k;
        int e[][]=new int[10][10];
        for(i=0;i<m;i++) 
        {
            for(j=0;j<q;j++)
            {
                e[i][j]=0;
                for(k=0;k<n;k++) 
                {
                    e[i][j]=e[i][j]+c[i][k]*d[k][j];
                }
            }
	}	
        display_matrix(e,m,q);
    }
    private static void add_matrix(int[][] a, int[][] b,int m,int n) 
    {
        Scanner s = new Scanner(System.in);
	int[][] c=new int[m][n];
	for(int i=0;i<m;i++)
	{
            for(int j=0;j<n;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
            }
	}
        System.out.println("Sum of A and B matrices : \n");
        display_matrix(c,m,n);
    }
    private static void display_matrix(int[][] c, int a, int b)
    {
        for(int i=0;i<a;i++)
	{
            for(int j=0;j<b;j++)
            {
                System.out.print ("\t" + c[i][j]);
            }
            System.out.print("\n");	
	}
    }
}

/*
1) Add 
2) Matrices 
3) Exit


Enter the choice: 
1
Enter the number rows and columns: 
2
2
Enter elements of A: 
12
34
56
24
	12	34
	56	24
Enter elements of B: 
5
2
7
24
	5	2
	7	24
Sum of A and B matrices : 

	17	36
	63	48
*/
