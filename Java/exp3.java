//Mareena Fernandes 8669//
/*Write a menu driven java program which will read a number and implement the
following methods.
a. factorial() ,
b. reverse(), 
c. testArmstrong()*/
import java.util.*;
class Demo
{
static int fact(int m)
{
int i, f=1;
for(i=1; i<=m; i++)
	{
	 f=f*i;
	}
System.out.println("Factorial is "+f);
return 0;
}
static int rev(int m)
{
int r=0, d;
while(m>0)
	{
	 d=m%10;
	 r=d+(r*10);
	 m/=10;
	}
System.out.println("Reverse is "+r);
return 0;
}
static int arm(int m)
{
int r=0, tmp=m, sum=0;
while(m!=0)
	{
	 r=m%10;
	 sum+=r*r*r;
	 m/=10;
	}
if(tmp==sum)
	System.out.println("The number is Armstrong");
else
	System.out.println("The number is not Armstrong");
return 0;
}
public static void main(String args[])
	{
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter a choice: \n1.Factorial \n2.Reverse \n3.TestArmstrong");
	 int c=sc.nextInt();
	 switch(c)
		{
		 case 1:System.out.println("Enter a number: ");
		 int a=sc.nextInt();
		 int n=fact(a);
		 break;
		 case 2:System.out.println("Enter a number: ");
		 int b=sc.nextInt();
		 int p=rev(b);
		 break;
		 case 3:System.out.println("Enter a number: ");
		 int d=sc.nextInt();
		 int q=arm(d);
		 break;
		 default:System.out.println("Invalid Input");
		}
	}
}
/*Enter a choice: 
1.Factorial 
2.Reverse 
3.TestArmstrong
1
Enter a number: 
6
Factorial is 720

Enter a choice: 
1.Factorial 
2.Reverse 
3.TestArmstrong
2
Enter a number: 
6589
Reverse is 9856

Enter a choice: 
1.Factorial 
2.Reverse 
3.TestArmstrong
3
Enter a number: 
153
The number is Armstrong
*/
