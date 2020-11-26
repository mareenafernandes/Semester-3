//Mareena Fernandes 8669//
//Study Scanner Class and Output statement in Java//

import java.util.*;

class Demo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	 	System.out.println("Enter your Name: ");
		String name=sc.nextLine();
	 	System.out.println("Enter your Gender: ");
		char gender=sc.next().charAt(0);
	 	System.out.println("Enter your Roll no: ");
		int rollno=sc.nextInt();
	 	System.out.println("Enter your Department: ");
		String dept=sc.next();
	 	System.out.println("Enter your CGPA: ");
		float cgpa=sc.nextFloat();
	 	System.out.println("Name: "+name+" Gender: "+gender+" Roll no: "+rollno+" Deaprtment: "+dept+" CGPA: "+cgpa);
	}
}
/*
Enter your Name: 
Mareena Fernandes
Enter your Gender: 
F
Enter your Roll no: 
8669
Enter your Department: 
InfoTech
Enter your CGPA: 
7.0
Name: Mareena Fernandes Gender: F Roll no: 8669 Deaprtment: InfoTech CGPA: 7.0
*/
