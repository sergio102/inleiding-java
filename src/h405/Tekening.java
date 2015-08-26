package h405;

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
		setBackground(Color.blue);
		g.setColor(Color.yellow);
		g.fillArc(88, 40, 100, 100, 90, 135);
	
//g.drawLine(x1, y1, x2, y2);
		
		
	}

}
