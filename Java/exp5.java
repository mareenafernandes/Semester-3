//Mareena Fernandes 8669//
package exp5.java;
import java.util.*;
public class Exp5Java 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be reversed: ");
        int num = sc.nextInt();
        System.out.println("Reversed number is: ");
        reverse(num);
        System.out.println();
        System.out.println("Enter the value of n: " );
        int n = sc.nextInt();
        int s = sum(n);
        System.out.println("Sum is: " + s);
    }
    public static void reverse(int x)
    {
        if(x<10)
        {
            System.out.print(x);
        }
        else
        {
            System.out.print(x%10);
            reverse(x/10);
        }
    }
    public static int sum(int n)
    {
        if(n!=0)
        {
            return n + sum(n-1);
        }
        else
            return n;
    }
}
/*
Enter the number to be reversed: 
7843
Reversed number is: 
3487
Enter the value of n: 
9
Sum is: 45
*/
