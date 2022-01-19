import java.awt.Color;

import acm.graphics.GLabel;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class Billiards extends GraphicsProgram {
	private final int DELAY = 20;
	private final int BALL_SIZE = 30;
	private final int WIDTH = 600;
	private final int HEIGHT = 800;

	//GEightBall ball;	// composition
	GEightBallI ball;	// inheritance
	int vx = 1;
	int vy = 3;

	public void run() {
		setup();
		gameLoop();
	}

	private void gameLoop() {
		// game loop
		while (true) {
			moveBall();
			checkForCollissionInY();
			checkForCollisionInX();
			pause(DELAY);
		}
	}

	private int checkForCollisionInX() {
		if (ball.getX() > HEIGHT) {
			vx = -vx;
		} else if (ball.getX() < 0) {
			vx = -vx;
		}
		return vx;
	}

	private int checkForCollissionInY() {
		if (ball.getY() > WIDTH) {
			vy = -vy;
		} else if (ball.getY() < 0) {
			vy = -vy;
		}
		return vy;
	}

	private void moveBall() {
		ball.move(vx, vy);
	}

	private void setup() {
		setSize(HEIGHT, WIDTH);
		setBackground(Color.GREEN);
		createBall();
	}

	private void createBall() {
		//ball = new GEightBall();
		ball = new GEightBallI(BALL_SIZE, BALL_SIZE);
		add(ball, HEIGHT / 2 - BALL_SIZE / 2, WIDTH / 2 - BALL_SIZE / 2);
	}

}
