import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;


public class BrickBreaker extends GraphicsProgram {
	private final int brickWidth = 50;
	private final int brickHeight = 20;
	private int brickPortion=6;
	int numberofBricks = 0;
	private final int WIDTH = 600;
	private final int HEIGHT = 800;
	private int vx = 5;
	private int vy = 6;
	GOval ball;
	GRect paddle;
	public void run()
	{
		setUp();
		addMouseListeners();
		gameLoop();
		
		}

	private void gameLoop() {
		while(true){
			moveBall();
			checkForCollisionWithWall();
			checkForCollisionWithPaddle();
			pause(40);   //very very important
		}
		
	}

	private void checkForCollisionWithPaddle() {
		GObject obj=getElementAt(ball.getX(),ball.getY());
		if(obj!=null)
		{
		if(obj==paddle)
		{
			vy=-vy;
		}
		else
		{
			remove(obj);
			vy = -vy;
			numberofBricks--;
		}
		}
	}

	private void setUp() {
		setSize(800,800);
		createBricks();
		createPaddle();
		createBall();
		
		
	}

	private void createBall() {
		ball=new GOval(20,20);
		ball.setColor(Color.BLACK);
		ball.setFilled(true);
		add(ball,100,300);
		
	}

	private void createPaddle() {
		paddle =new GRect(100,20);
		paddle.setFilled(true);
		paddle.setColor(Color.RED);
		add(paddle,100,600);
		
	}

	private void checkForCollisionWithWall() {
		double x= ball.getX();
		double y= ball.getY();
		
		if(x<0 || x>800)
		{
			vx=-vx;
		}
		if(y<0 || y>800)
		{
			vy=-vy;
		}
		
	}

	private void moveBall() {
		ball.move(vx, vy);
	}
	private void createBricks() {
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

	private Color getRandomColour() {
		
		RandomGenerator rgen=new RandomGenerator();
		return rgen.nextColor();
	}

	public void mouseMoved(MouseEvent e)
	{
		int x=e.getX();
		paddle.setLocation(x,600);
	}
}
