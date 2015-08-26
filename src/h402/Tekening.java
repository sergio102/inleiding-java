package h402;

import java.applet.Applet;
/*
 * Made by
 * Sergio Dasai
 */
import java.awt.Graphics;
@SuppressWarnings("serial")
public class Tekening extends Applet {

	public void init() {
		setSize(400, 400);
		
	}
	public void paint(Graphics g) {
		g.drawRect(40, 120, 200, 200);
		g.drawRect(50, 140, 80, 80);
		g.drawRect(175, 200, 60, 120);
		g.drawLine(40, 120, 150, 80);
		g.drawLine(240, 120, 150, 80);
//g.drawLine(x1, y1, x2, y2);
		
		
	}

}
