//Mareena Fernandes 8669//
/*Write a program to create class named ‘Student’ with instance variables as roll no,
name and age . Program should demonstrate the use of
1. default constructor to initialize default values to parameters.
2. parameterized constructor to initialize two instance variables
3. demonstrate overloading by creating parameterized constructor to initialize three instance variables
4. method to print values of instance variables.
#Create objects of class Students to demonstrate the use of above constructors.*/

import java.util.*;

class Student
{
int rollno;
String name;
int age;
Student()
	{
		rollno=8669;
		name="Mareena Fernandes";
		age=18;
	}
Student(int rollno1, String name1)
	{
		rollno=rollno1;
		name=name1;
	}
Student(int rollno2, String name2, int age2)
	{
		rollno=rollno2;
		name=name2;
		age=age2;
	}
}
class Demo
{
public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Student s1 = new Student();
		System.out.println("Roll no:" + s1.rollno + "\nName: " + s1.name + "\nAge: " + s1.age);
		System.out.println("Enter Roll no, Name: ");
		int rollno1 = sc.nextInt();
		String name1 = sc.nextLine();
		Student s2 = new Student(rollno1, name1);
		System.out.println("Roll no:" + s2.rollno + "\nName: " + s2.name);
		System.out.println("Enter Roll no, Name, Age: ");
		int rollno2 = sc.nextInt();
		String name2 = sc.next();
		int age2 = sc.nextInt();
		Student s3 = new Student(rollno2, name2, age2);
		System.out.println("Roll no:" + s3.rollno + "\nName: " + s3.name + "\nAge: " + s3.age);
	}
}
/*Roll no:8669
Name: Mareena Fernandes
Age: 18
Enter Roll no, Name: 
8651 Anu Thomas
Roll no:8651
Name:  Anu Thomas
Enter Roll no, Name, Age: 
8668 Manuel 19
Roll no:8668
Name:  Manuel
Age: 19
/*
		
