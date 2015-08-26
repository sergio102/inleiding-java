package h406;

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
		g.drawOval(20, 20, 150, 300);
		g.setColor(Color.red);
		g.fillOval(70, 50, 50, 50);
		g.setColor(Color.orange);
		g.fillOval(70, 130, 50, 50);
		g.setColor(Color.green);
		g.fillOval(70, 210, 50, 50);
		
//g.drawLine(x1, y1, x2, y2);
		
		
	}

}
