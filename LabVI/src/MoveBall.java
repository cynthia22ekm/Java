import java.awt.Color;

import acm.graphics.GLabel;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class MoveBall extends GraphicsProgram {
	EightBall ball;
	private int vx = 5;
	private int vy = 6;

	public void run() {
		setup();
		while (true) {
			moveBall();
			checkForCollisionsWithWall();
			pause(40);
		}
	}
		private void checkForCollisionsWithWall() {
		double x = ball.getX();
		double y = ball.getY();
		if (x < 0 || x > 600) {
			vx = -vx;
		}
		if (y < 0 || y > 600) {
			vy = -vy;
		}
	}

	private void moveBall() {
		ball.move(vx, vy);
	}

	private void setup() {
		setSize(600,600);
        createBall();
		setSize(600, 600);
		
		
	}
	private void createBall() {
		ball=new EightBall();
		add(ball,0,0);
		
	}
}
