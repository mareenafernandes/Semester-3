//Mareena Fernandes 8669//
import java.applet.*;
import java.awt.*;

public class hexp7 extends Applet implements Runnable
{
	int counter=1;
	Font f2=new Font("Helvetica",Font.BOLD,15);
	public void paint(Graphics g) 
	{
		g.setColor(Color.black);      
		g.fillRect(100,100,50,150);		
		g.fillRect(115,250,20,155);
		g.drawOval(100,100,48,50);     
		g.drawOval(100,150,48,50);
		g.drawOval(100,200,48,50);   
		g.setFont(f2);
		if(counter==1) 
		{   
			g.setColor(Color.red);     
			g.fillOval(100,100,48,50);
			g.drawString("STOP",155,130);
		}
		if(counter==2) 
		{        
			g.setColor(Color.YELLOW);      
			g.fillOval(100,150,48,50);
     			g.drawString("GET READY",155,180);
		}
		if(counter==3) 
		{      
			g.setColor(Color.GREEN);      
			g.fillOval(100,200,48,50);
	   		g.drawString("GO",155,230);
		}
	}
	Thread t;
	int i=0,j=0;
    	public void start() 
	{
		t=new Thread(this);
	   	t.start();
	}
	public void run()
	{
		for(int i=0;i<=20;i++) 
		{
	  		try
	    		{
	      			Thread.sleep(1000);
	    		}
			catch(Exception e)
			{
	      			System.out.println(e);
	    		}	  
	      		if(i==0 && i<10)         
	       		{
	       			counter=1;
	       			repaint();
	       		}
	      		else if(i==10 && i<15)   
	       		{
	        		counter=2;
	        		repaint();
	       		}
	      		else if(i==15)
	       		{
	         		for(j=0;j<8;j++)
	          		{
	           			counter=3;
	            			try
	             			{
	              				Thread.sleep(1000);
	             			}
	            			catch(Exception e)
	             			{
	               				System.out.println(e);
	             			}
	               			repaint();
	            		}
	       		if(j==8)
	      		{
	       			run();
	      		}
	  	}
 	}
	repaint();
	}
}

//<applet code="hexp7.class" height="1000" width="1000"></applet>//
