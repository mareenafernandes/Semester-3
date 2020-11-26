//Mareena Fernandes 8669//
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class exp15 extends Applet implements Runnable
{
	String str,str1,str2,str3,str4;
	Thread t ;
	Font f2;
	Image fair;
  	Font f1;
 	String link;
   	Button b,submit;
   	TextField name,email,message;
   	Label name1,email1,message1;
	public void init() 
	{
		str = "TEAM VAAYUSHASTRA";
		str1 = "DREAM..BUILD..FLY!!";				
		str2 = "Ever looked at that aeroplane flying overhead and wondered how such a tiny species reached such great heights?";			      
		str3 = "Have you ever wanted to build soomething bigger than a paper plane?";
		str4 = "Now you can join the team too--";
		setBackground(Color.BLUE);
		setForeground(Color.WHITE);
		f2=new Font("Helvetica",Font.BOLD,15);
		f1=new Font("Courier",Font.ITALIC,12);
		name1=new Label("Name :",Label.CENTER);
		email1=new Label("Email :",Label.CENTER);
		message1=new Label("Message :",Label.CENTER);
		name=new TextField(10);
		email=new TextField(10);
		message = new TextField(20);
		fair = getImage(getCodeBase(), "vaayu.png");
		prepareImage(fair, 450, 300, this);
		b = new Button("Join now");
		submit = new Button("Submit");
		t = new Thread(this);    
		t.start();
		add(name);
		add(email);
		add(message);
		add(b);
		add(name1);
		add(email1);
		add(message1);
		add(submit);
		name.setVisible(false);
		email.setVisible(false);
		message.setVisible(false);
		name1.setVisible(false);
		email1.setVisible(false);
		message1.setVisible(false);
		submit.setVisible(false);
	}
	public void paint(Graphics g) 
	{
		g.drawRect(1,1,1000,800);
		g.setColor(Color.WHITE);
		g.fillRect(1,1,1000,800);
		g.setColor(Color.BLACK);
		g.setFont(f2);
		g.drawString(str,20, 150);
		g.drawImage(fair, 10, 10,280,130,this);
		g.setColor(Color.GRAY);
		g.setFont(f2);
		g.drawString(str1, 20, 220);
		g.drawString(str2, 50, 240);
		g.drawString(str3, 70, 260);
		g.drawString(str4, 50,300);
		b.setLocation(360,285);
		name.setLocation(360,320);
		email.setLocation(360,360);
		message.setLocation(360,400);
		submit.setLocation(360,430);
		name1.setLocation(280,320);
		email1.setLocation(280,360);
		message1.setLocation(280,400);
		b.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				name.setVisible(true);
				email.setVisible(true);
				message.setVisible(true);
				name1.setVisible(true);
				email1.setVisible(true);
				message1.setVisible(true);
				submit.setVisible(true);
				repaint();
			}
		});
				      
				      
	}
	public void run () 
	{			    
		char ch;
		while(true)
		{
			try 
			{
				repaint();
				Thread.sleep(150);
				ch = str.charAt(0);
				str = str.substring(1, str.length());
				str = str + ch;
			}
			catch(InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
}

//<applet code="exp15.class" height="1000" width="1000"></applet>//
