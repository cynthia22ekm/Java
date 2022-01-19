import java.awt.Color;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class BilliardsTD extends GraphicsProgram {
	
	// instance variables
	GOval ball;
	int vx = 2;
	int vy = 3;
	
	public void run() {
		setup();
		gameLoop();
	}

	private void setup() {
		setSize(600, 400);
		setBackground(Color.GREEN);
		createBall();
	}
	
	private void createBall() {
		ball = new GOval(30, 30);
		ball.setFilled(true);
		add(ball, 300, 200);
	}
	
	private void moveBall() {
		ball.move(vx,vy);
	}

	private void gameLoop() {
		while (true) {
			moveBall();
			checkForCollissionsWithWall();
			pause(20);
		}
	}

	private void checkForCollissionsWithWall() {
		if (ball.getY() > 400) {
			vy = -vy;
		} else if (ball.getY() < 0) {
			vy = -vy;
		}
		if (ball.getX() > 600) {
			vx = -vx;
		} else if (ball.getX() < 0) {
			vx = -vx;
		}
	}

}
