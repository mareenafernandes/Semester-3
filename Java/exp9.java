//Mareena Fernandes 8669//
import java.util.*;
class Demo
{
	public static void main(String args[])
		{
			Instrument[] ins = new Instrument[10];
			for(int i=0; i<10; i++)
			{
				if(i==0 || i==3 || i==7)
					ins[i] = new Piano();
				else if(i==1 || i==5 || i==9)
					ins[i] = new Flute();
				else
					ins[i] = new Guitar();
				ins[i].play();
				if(ins[i] instanceof Piano)
					System.out.println("tan tan tan tan");
				if(ins[i] instanceof Flute)
					System.out.println("toot toot toot toot");
				if(ins[i] instanceof Guitar)
					System.out.println("tin  tin  tin");
			}
		}
}
abstract class Instrument
{
	abstract void play();
}
class Piano extends Instrument
{
	void play()
	{
	 System.out.print("Piano is playing ");
	}
}
class Guitar extends Instrument
{
	void play()
	{
	 System.out.print("Guitar is playing ");
	}
}
class Flute extends Instrument
{
	void play()
	{
	 System.out.print("Flute is playing ");
	}
}
/*
Piano is playing tan tan tan tan
Flute is playing toot toot toot toot
Guitar is playing tin  tin  tin
Piano is playing tan tan tan tan
Guitar is playing tin  tin  tin
Flute is playing toot toot toot toot
Guitar is playing tin  tin  tin
Piano is playing tan tan tan tan
Guitar is playing tin  tin  tin
Flute is playing toot toot toot toot
*/			
