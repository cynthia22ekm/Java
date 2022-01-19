import acm.graphics.GLabel;
import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.graphics.GRect;

import java.util.Random;
import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.program.GraphicsProgram;

public class Game1 extends GraphicsProgram {
	private final int WIDTH = 600;
	private final int HEIGHT = 800;
	private final int BALL_SIZE = 30;
	private final int brickWidth = 50;
	private final int brickHeight = 20;
	private int paddleWidth = 100;
	private int paddleHeight = 10;
	private int paddleSeparation=400;
	private int brickPortion=6;
	private final int DELAY = 20;
	private boolean win = false;
	private boolean gameEnd = false;
	private int messageDisplayX=100;
	private int messageDisplayY=300;
	private GRect paddle;
	GOval ball;
	int numberofBricks = 0;
	int vx = 3;
	int vy = 5;

	public void run() {
		createBricks();
		createBall();
		createPaddle();
		addMouseListeners();
		gameLoop();
	}
	// For generating random colors
	private Color getRandomColour() {
		Random rand = new Random();
		return new Color(rand.nextFloat(), rand.nextFloat(), rand.nextFloat());
	}
	public void createBricks() {
		for (int i = 20; i < HEIGHT / brickPortion; i = i + brickHeight) {
			for (int j = 0; j < (WIDTH + brickWidth); j = j + brickWidth) {
				GRect brick = new GRect(brickWidth, brickHeight);
				brick.setColor(getRandomColour());
				brick.setFilled(true);
				add(brick, j + brickWidth, i);
				numberofBricks++;
			}
		}
	}
	public void createBall() {
		ball = new GOval(BALL_SIZE, BALL_SIZE);
		ball.setColor(Color.BLUE);
		ball.setFilled(true);
		add(ball, WIDTH / 2 + BALL_SIZE, HEIGHT / 2 + (BALL_SIZE));
	}
	private void createPaddle() {

		paddle = new GRect(paddleWidth, paddleHeight);
		paddle.setColor(Color.BLACK);
		paddle.setFilled(true);
		add(paddle, WIDTH / 2 + BALL_SIZE, HEIGHT / 2 + (BALL_SIZE));
	}
	private void gameLoop() {
		// game loop
		while (!gameEnd) {
			moveBall();
			checkForCollissionInY();
			checkForCollisionInX();
			checkforCollisionwithBrick();
			pause(DELAY);
		}
		GLabel gameStatus = new GLabel("Game Over");
		if (win) {
			gameStatus.setLabel("Congratulations, You Won!!");
		} else if (gameEnd) {
			gameStatus.setLabel("You Lost the Game.Please Try Again!!");
		}
		gameStatus.setFont("Arial-bold-32");
		gameStatus.setColor(Color.BLUE);
		add(gameStatus, messageDisplayX, messageDisplayY);
	}
	private int checkForCollisionInX() {
		if (ball.getX() > WIDTH + 150 || ball.getX() < 0) {
			vx = -vx;
		}
		return vx;
	}
	private int checkForCollissionInY() {
		if (ball.getY() < 0) {
			vy = -vy;
		}
		return vy;
	}
	private void checkforCollisionwithBrick() {
		if (ball.getY() > HEIGHT - (paddleSeparation/2)) {
			gameEnd = true;
		}
		GObject obj = getElementAt(ball.getX(), ball.getY());
		if (obj != null) {
			if (obj == paddle) {
				vy = -vy;
			} else {
				remove(obj);
				vy = -vy;
				numberofBricks--;
				if (numberofBricks == 0) {
					win = true;
					gameEnd = true;
				}
			}
		}
	}
	private void moveBall() {
		ball.move(vx, vy);
	}
	public void mouseMoved(MouseEvent e) {
		int x = e.getX();
		paddle.setLocation(x, HEIGHT - paddleSeparation);
	}
}
