package Applet_Programming;
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.color.*;
public class MyApplet3 extends Applet{
	public void paint(Graphics g)
	{
		
		g.drawOval(100, 100, 150, 100); 
		g.drawString("Sudip", 100, 100);
	}
}

/*
 
 <applet code="MyApplet3.class" height="300" width="300">
 </applet>
*/