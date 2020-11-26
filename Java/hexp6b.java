//Mareena Fernandes 8669//
package hexp6b.java;
import java.time.Duration;
import java.time.Instant;
public class Hexp6bJava 
{
    public static void main(String[] args) 
    {
        Prime_thread prime = new Prime_thread();
        prime.start();
        Fibo_thread fibo = new Fibo_thread();
        fibo.start();
    }
}
class Prime_thread extends Thread
{
    int c=0,n=0,i=1,j=1;{
    Instant start = Instant.now();
    System.out.println("First 20 prime numbers are :");
    while(n<20)  
    {  
        j=1;  
        c=0;  
        while(j<=i)  
        {  
            if(i%j==0)  
                c++;  
            j++;  
        }  
        if(c==2)  
        {  
            System.out.printf("%d ",i);  
            n++;  
        }  
        i++;  
    }
    Instant end = Instant.now();
    System.out.println("\nTime Elapsed: ");
    System.out.println(Duration.between(start, end).getNano() + " nano seconds");
}
}
class Fibo_thread extends Thread
{
    int n1=0,n2=1,n3;  
    {
        Instant start=Instant.now();
        System.out.println("Fibonacci series upto 15 terms is :");
        System.out.print(n1+" "+n2);
        for(int i=2;i<15;i++)
        {
            n3=n1+n2;    
            System.out.print(" "+n3);    
            n1=n2;    
            n2=n3;    
        }
        Instant end=Instant.now();
        System.out.println("\nTime Elapsed: ");
        System.out.println(Duration.between(start, end).getNano() + " nano seconds");
    }
}

/*
First 20 prime numbers are :
2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 
Time Elapsed: 
16000000 nano seconds
Fibonacci series upto 15 terms is :
0 1 1 2 3 5 8 13 21 34 55 89 144 233 377
Time Elapsed: 
0 nano seconds
*/