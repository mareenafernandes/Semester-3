//Mareena Fernandes 8669//
import frcrce.it.SEB.ITL3048669.Mareena.Greeter;
import frcrce.it.SEB.ITL3048669.Mareena.Advisor;
import java.util.*;

class Demo
{
 public static void main(String args[])
	{
	 Greeter greet= new Greeter(args[0]);
	 greet.sayHello(greet.name);
	 greet.sayGoodBye(greet.name);
	 Advisor advice = new Advisor();
	 advice.getAdvice();
	}
}
/*
Hello Mareena!
Goodbye Mareena!
Advice: Never say No
*/


//Mareena Fernandes 8669//
package frcrce.it.SEB.ITL3048669.Mareena;
import java.util.*;

public class Advisor
{
 public static String[] message = new String[5];
 public Advisor()
	{
	 message[0] = new String("Never say No");
	 message[1] = new String("Exam Time!!");
	 message[2] = new String("Work hard");
	 message[3] = new String("Study well");
	 message[4] = new String("Do not Cheat");
	}
 public static void getAdvice()
	{
	 Random randomGenerator = new Random();
	 int r = randomGenerator.nextInt(5);
	 System.out.println("Advice: " + message[r]);
	}
}


//Mareena Fernandes 8669//
package frcrce.it.SEB.ITL3048669.Mareena;
import java.util.*;

public class Greeter
{
 public String name = new String();
 public Greeter(String aName)
	{
	 name = aName;
	}
 public static void sayHello(String name)
	{
	 System.out.println("Hello " + name + "!");
	}
 public static void sayGoodBye(String name)
	{
	 System.out.println("Goodbye " + name + "!");
	}
}
