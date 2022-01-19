import java.awt.Color;

import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class Flag extends GraphicsProgram {

	public void run() {
		
		generateBlackRect();	
		generateRedRect();
		generateYellowRect();
		
		}

	private void generateYellowRect() {
		GRect fritz=new GRect(200,30);
		fritz.setColor(Color.YELLOW);
		fritz.setFilled(true);
		add(fritz,200,160);
		
	}

	private void generateRedRect() {
		GRect fritz=new GRect(200,30);
		fritz.setColor(Color.RED);
		fritz.setFilled(true);
		add(fritz,200,130);
		
	}

	private void generateBlackRect() {
		GRect fritz=new GRect(200,30);
		fritz.setColor(Color.BLACK);
		fritz.setFilled(true);
		add(fritz,200,100);
		
	}
		
		
	

	}
