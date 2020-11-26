//Mareena Fernandes 8669//
import java.util.*;
class Demo
{
 public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String test = sc.nextLine();
		System.out.println("String is: " + test);
		count(test);
	}
	public static void count(String x)
	       {
		char[] ch = x.toCharArray();
		int letter = 0;
		int space = 0;
		int num = 0;
		int other = 0;
		for(int i = 0; i < x.length(); i++)
		     {
			if(Character.isLetter(ch[i]))
				letter ++ ;
			else if(Character.isDigit(ch[i]))
				num ++ ;
			else if(Character.isSpaceChar(ch[i]))
				space ++ ;
			else
				other ++;
		     }
		System.out.println("Letter: " + letter);
		System.out.println("Space: " + space);
		System.out.println("Number: " + num);
		System.out.println("Special Character: " + other);
	}
}
/*
Enter a string: 
Hey! How are you roll no:8669?
String is: Hey! How are you roll no:8669?
Letter: 18
Space: 5
Number: 4
Special Character: 3
*/

