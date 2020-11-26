//Mareena Fernandes 8669//
package hexp4b.java;
import java.util.*;
public class Hexp4bJava 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int choice;
        int c = 0;
        Vector<String> v = new Vector<String>(20);
        System.out.println("Enter the number to elements to be added: ");
        int size = sc.nextInt();
        System.out.println("Enter elements: "); 
        for( int j = 0; j < size; j ++)
        {     
            v.add(sc.next());
        } 
        System.out.println("Size of the vector is " + v.size());
        String[] array = v.toArray(new String[v.size()]);
        System.out.println("Enter element to check frequency: ");
        String s=sc.next();
        for(int i = 0;i < v.size(); i++) 
        {
            if(array[i].equals(s)) 
            {
                c++;
            }
        }
        System.out.println("Frequency is: " + c);
    }
}

/*
Enter the number to elements to be added: 
5
Enter elements: 
1
3
2
1
56
Size of the vector is 5
Enter element to check frequency: 
1
Frequency is: 2
*/
