//Mareena Fernandes 8669//
//Check if string is palindrome//
import java.util.*;

class Demo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	 	System.out.println("Enter a word: ");
		String word1=sc.next();
		String word2="";
		for(int i=word1.length()-1; i>=0; i--)
			word2= word2+word1.charAt(i);
		if(word1.equals(word2))
			System.out.println("The word is a Palindrome");
		else
			System.out.println("The word is not a Palindrome");
	}
}
/*
Enter a word: 
hannah
The word is a Palindrome
*/
