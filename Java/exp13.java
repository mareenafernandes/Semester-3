//Mareena Fernandes 8669//

import java.applet.*;
import java.awt.*;

public class exp13 extends Applet 
{
	public void paint(Graphics g)
	{
		g.setColor(Color.yellow);
		g.fillOval(20,20,150,150);
		g.setColor(Color.black);
		g.fillOval(50,60,25,40); 
		g.fillOval(120,60,25,40);   
		g.fillRect(95, 100,2,20);    
		g.setColor(Color.red);
		g.fillRect(70,130,50,10); 
		g.setColor(Color.black);
		g.fillRect(70,135,50,1);
	}
}

/*<applet code="exp13.class" height="1000" width="1000"></applet>*/
