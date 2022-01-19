import java.awt.Color;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class Archery extends GraphicsProgram {

	public void run() {
	  
		drawCircle(150,Color.RED);
		drawCircle(100,Color.WHITE);
		drawCircle(50,Color.RED);
		
//		outerCircle();
//		innerCircle();
//		smallCircle();
			}

//	private void smallCircle() {
//		GOval circle1=new GOval(50,50);
//		circle1.setColor(Color.RED);
//		circle1.setFilled(true);
//		add(circle1,300,200);
//		
//	}
//
//	private void innerCircle() {
//		GOval circle1=new GOval(100,100);
//		circle1.setColor(Color.WHITE);
//		circle1.setFilled(true);
//		add(circle1,275,175);
//	}
//
//	private void outerCircle() {
//		GOval circle1=new GOval(150,150);
//		circle1.setColor(Color.RED);
//		circle1.setFilled(true);
//		add(circle1,250,150);
//		
//	}
	
	private void drawCircle(int radius, Color color) {
		GOval ring =new GOval(2 * radius, 2 * radius);
		ring.setColor(color);
		ring.setFilled(true);
		int x = 75 + 72 - radius;
		add(ring, x, x);
		}
}
