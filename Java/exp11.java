//Mareena Fernandes 8669//
import java.util.*;
class Demo
{
 public static void main(String args[])
	{
	 int DA, TA, tax, BasicSalary, Gross;
	 Scanner sc = new Scanner(System.in);
	 try
		{
		 System.out.println("Enter the Basic Salary: ");
		 BasicSalary = sc.nextInt();
		 if(BasicSalary < 8000)
			{
			 throw new PayOutOfBoundsException(BasicSalary);
			}
		 DA = (10 * BasicSalary)/100;
		 TA = (10 * BasicSalary)/100;
		 tax = (9 * BasicSalary)/100;
		 Gross = BasicSalary + DA + TA - tax;
		 System.out.println("Gross Salary is: " + Gross);
		}
	 catch(PayOutOfBoundsException e)
		{
		 System.out.println(e);
		}
	}
}
class PayOutOfBoundsException extends Exception
{
 int s;
 PayOutOfBoundsException(int salary)
	{
	 s = salary;
	 System.out.println("Invalid Salary entered (<8000) " + s);
	}
}
/*
Enter the Basic Salary: 
10000
Gross Salary is: 11100

*/

/*
Enter the Basic Salary: 
6500
Invalid Salary entered (<8000) 6500
*/
