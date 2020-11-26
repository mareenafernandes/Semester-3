//Mareena Fernandes 8669//
import java.util.*;
class Demo
{
    public static void main(String[] args) 
	{
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter a String: ");
         String str = sc.nextLine();
         int vcount = 0, ccount = 0;
         str = str.toLowerCase();
         for(int i = 0; i < str.length(); i++) 
		{ 
			char ch = str.charAt(i); 
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
				vcount++;
			else if((ch >= 'a'&& ch <= 'z'))
                		ccount++;
                }
	System.out.println("Number of Vowels: " + vcount);
        System.out.println("Number of Consonants: " + ccount);
        }
}
/*
Enter a String: 
Mareena Fernandes
Number of Vowels: 7
Number of Consonants: 9
*/
