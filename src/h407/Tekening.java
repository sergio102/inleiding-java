package h407;

import java.applet.Applet;
import java.awt.Color;
/*
 * Made by
 * Sergio Dasai
 */
import java.awt.Graphics;
@SuppressWarnings("serial")
public class Tekening extends Applet {

	public void init() {
		setSize(600, 400);
		
	}
	public void paint(Graphics g) {
		g.drawRoundRect(20, 20, 150, 150, 20, 20);
		g.setColor(Color.black);
		g.fillOval(40, 50, 25, 25);
		g.setColor(Color.black);
		g.fillOval(120, 50, 25, 25);
		g.setColor(Color.black);
		g.fillOval(40, 120, 25, 25);
		g.setColor(Color.black);
		g.fillOval(120, 120, 25, 25);
		
//g.drawLine(x1, y1, x2, y2);
		
		
	}

}
