package Applet_Programming;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;  
public class MyApplet extends Applet{  
  
public void paint(Graphics g){  
g.drawString("welcome to applet",150,150); 

g.drawLine(100, 100, 400, 100);
for(int i=100;i<=400;i++)
{
	for(int j=100;j<=102;j++)
	{
		g.setColor(Color.RED);
	}
}
}  
  
}  
/* 
<applet code="MyApplet.class" width="300" height="300"> 
</applet> 
*/  