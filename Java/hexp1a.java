import java.util.*;
class Demo
  {
     public static void main(String args[]) 
     {
         Scanner sc=new Scanner(System.in);
	 System.out.println("Enter values of a,b,c: ");
         double a=sc.nextDouble();
	 double b=sc.nextDouble();
	 double c=sc.nextDouble();
         double root1, root2;
         double det = b * b - 4 * a * c;
         if(det > 0) 
	    {
                root1 = (-b + Math.sqrt(det)) / (2 * a);
                root2 = (-b - Math.sqrt(det)) / (2 * a);
                System.out.println("Root1= "+root1+" Root2= "+root2);
            }
          else if(det == 0) {
                root1 = root2 = -b / (2 * a);
                System.out.println("Root1 = Root2= "+root1);
            }
            else 
	    {
                System.out.println("Imaginary roots");
            }
        }
    }
