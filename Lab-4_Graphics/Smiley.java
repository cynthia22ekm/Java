import java.awt.Color;

import acm.graphics.GArc;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class Smiley extends GraphicsProgram {

	public void run() {
		setSize(600, 600);
		drawFace();
		drawLeftEye();
		drawRightEye();
		drawMouth();
		
	}

	private void drawMouth() {
	
		GArc mouth=new GArc(50,50,225,90);
		add(mouth,185,200);
	}

	private void drawRightEye() {
		
		GOval eye1=new GOval(20,20);
		add(eye1,250,150);
	}

	private void drawLeftEye() {
		
		GOval eye2=new GOval(20,20);
		add(eye2,150,150);
	}

	private void drawFace() {
		GOval face=new GOval(200,200);
		add(face,110,110);
		
	}
}
