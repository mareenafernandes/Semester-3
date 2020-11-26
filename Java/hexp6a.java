//Mareena Fernnades 8669//
import java.util.*;
class Demo
{
 public static void main(String args[])
	{
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter Name: ");
	 String name = sc.nextLine();
	 System.out.println("Enter Seat no.: ");
	 String seatno = sc.next();
	 System.out.println("Enter date: ");
	 String date = sc.next();
	 try
		{
		 System.out.println("Enter the marks: ");
		 int marks = sc.nextInt();
		 if(marks < 0 || marks > 100)
			{
			 throw new MarksOutOfBoundsException(marks);
			}
		 System.out.println("Name: " + name + " Seat no: " + seatno + " Date: " + date + " Marks: " + marks);
		}
	 catch(MarksOutOfBoundsException e)
		{
		 System.out.println(e);
		}
	}
}
class MarksOutOfBoundsException extends Exception
{
 int m;
 MarksOutOfBoundsException(int marks)
	{
	 m = marks;
	 System.out.println("Invalid marks " + marks);
	}
}
/*
Enter Name: 
Mareena Fernandes
Enter Seat no.: 
A2625
Enter date: 
11/09/2019
Enter the marks: 
91
Name: Mareena Fernandes Seat no: A2625 Date: 11/09/2019 Marks: 91
*/

/*
Enter Name: 
Anna
Enter Seat no.: 
M123
Enter date: 
10/09/2019
Enter the marks: 
103
Invalid marks 103
*/
