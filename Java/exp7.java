//Mareena Fernandes 8669//
import java.util.*;
class Demo
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		Vector<String> v=new Vector<String>(20);
		System.out.println("Enter the number of strings: ");
		int n=s.nextInt();
		for(int i=0;i<n;i++) 
		{
			v.add(s.next());	
		}
        	int f=0;
		System.out.println("String: ");
		String str=s.next();
		for(int j=0;j<v.size();j++)
		{
			if((v.get(j)).equals(str)) 
			{
				v.remove(j);
				f=1;
			}
		}
		if(f==0)
		v.add(str);			
		for(int i=0;i<v.size();i++)
		{
			System.out.println(v.get(i));
		}
	}
}

/*
Enter the number of strings: 
3
HI
Hello
HEY
String: 
HI
Hello
HEY
*/
