//Mareena Fernandes 8669//
package hexp3a.java;
import java.util.Scanner;
public class Hexp3aJava 
{
    double balance;
    Hexp3aJava()
    {
        balance = 0;
    }
    Hexp3aJava(double x)
    {
        balance = x;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the account id: ");
        String account_id = sc.nextLine();
        Hexp3aJava a1 = new Hexp3aJava();
        System.out.println("Account id: " + account_id + " Balance: " + a1.balance);
        System.out.println("Enter the balance: ");
        double x = sc.nextDouble();
        Hexp3aJava a2 = new Hexp3aJava(x);
        System.out.println("Account id: " + account_id + " Balance: " + a2.balance);
    }
}
/*
Enter the account id: 
A25
Account id: A25 Balance: 0.0
Enter the balance: 
24650
Account id: A25 Balance: 24650.0
*/
