package Applet_Programming;
import java.applet.*;
import java.awt.*;
import java.awt.color.*;
public class MyApplet2 extends Applet{
	public void paint(Graphics g)
	{
		g.setColor(Color.red);
		g.drawOval(100, 100, 50, 60);
	}
}

/*
  <applet code="MyApplet2.class" width"1000px" height="500px">
  </applet>
 
*/