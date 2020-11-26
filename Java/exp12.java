//Mareena Fernandes 8669//
package exp11.java;
public class Exp11Java 
{
    public static void main(String[] args) 
    {
        My_Thread t1=new My_Thread();
        My_Thread t2=new My_Thread();
        My_Thread t3=new My_Thread();
        t1.setName("Mareena");
        t2.setName("Fernandes");
        System.out.println(t1.getName());
        System.out.println(t2.getName());
        t1.start();
        try 
        {
            t1.join(5000);
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
        t2.setPriority(1);
        t3.setPriority(10);
        System.out.println("t2s Priority is : " + t2.getPriority());
        System.out.println("t3s Priority is : " + t3.getPriority());
        t2.start();
        Thread.yield();              
        t3.start();
    }
}
class My_Thread extends Thread{
public void run() 
{
    System.out.println("Running!!");
    for(int i=1;i<5;i++)
    {
        try 
        {
            Thread.sleep(500);
            System.out.println(i);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
}
/*
Mareena
Fernandes
Running!!
1
2
3
4
t2s Priority is : 1
t3s Priority is : 10
Running!!
Running!!
1
1
2
2
3
3
4
4
*/
