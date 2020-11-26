//Mareena Fernandes 8669//
import java.util.*;

class Overload
{
 void area(double r)
	{
	 double cr = 3.14*r*r ;
	 System.out.println("Area of the circle is: "+ cr);
	}
 void area(float l, float b)
	{
	 float rt = l*b ;
	 System.out.println("Area of the rectangle: "+ rt);
	}
 void area(double h, double bs)
	{
	 double tr = 0.5*h*bs ;
	 System.out.println("Area of the triangle: " + tr);
	}
}
class Demo
{
 public static void main(String agrs[])
	{
	 Scanner sc = new Scanner(System.in);
	 Overload ol = new Overload();
	 System.out.println("Enter the figure: \n1)Circle \n2)Rectangle \n3)Triangle");
	 int ch = sc.nextInt();
	 switch(ch)
		{
		 case 1: System.out.println("Enter the radius of the circle: ");
			 double r = sc.nextDouble();
			 ol.area(r);
			 break;
		 case 2: System.out.println("Enter the length and breadth of the rectangle: ");
			 float l = sc.nextFloat();
			 float b = sc.nextFloat();
			 ol.area(l,b);
			 break;
		 case 3: System.out.println("Enter the height and base of the triangle: ");
			 double h = sc.nextDouble();
			 double bs = sc.nextDouble();
			 ol.area(h,bs);
			 break;
		 default: System.out.println("Invalid Input");
		}
	}
}
/*
Enter the figure: 
1)Circle 
2)Rectangle 
3)Triangle
1
Enter the radius of the circle: 
5
Area of the circle is: 78.5

Enter the figure: 
1)Circle 
2)Rectangle 
3)Triangle
2
Enter the length and breadth of the rectangle: 
2
6
Area of the rectangle: 12.0

Enter the figure: 
1)Circle 
2)Rectangle 
3)Triangle
3
Enter the height and base of the triangle: 
2.5
3.7
Area of the triangle: 4.625
*/
