import java.awt.event.KeyEvent;

import acm.graphics.GPolygon;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;


public class Asteroids extends GraphicsProgram {
	GPolygon spaceship;
	GRect asteroid;
	int vx=2;
	int vy=3;

	public void run()
	{
		setup();
		}

	private void setup() {
		setSize(600, 600);
		createSpaceShip();
		addKeyListeners();
		createAsteroids();
		moveAsteroids();
		}

	private void moveAsteroids() {
		while(true)
		{
		asteroid.move(vx,vy);
		}
	}

	private void createAsteroids() {
		for(int i=0;i<10;i++)
		{
		RandomGenerator rgen=new RandomGenerator();
		asteroid=new GRect(40,40);
		double x=rgen.nextDouble(0,600);
		double y=rgen.nextDouble(0,600);
		add(asteroid,x,y);
		}
	}

	private void createSpaceShip() {
		
		spaceship=new GPolygon();
		spaceship.addVertex(120, 100);
		spaceship.addVertex(200,300);
		spaceship.addVertex(120,220);
		spaceship.addVertex(50,300);
		add(spaceship,100,100);
		
	}
	
	public void keyPressed(KeyEvent e) {
		int code = e.getKeyCode();
		
		switch (code) {
		case 37: // left
			
			spaceship.rotate(-5);
			break;

		case 39: // right
			
			spaceship.rotate(5);
			break;

		default:
			System.out.println(code);
			break;
		}
	}
	private void accelerate() {
		
	}

	private void rotate(double r) {
		
		spaceship.rotate(r);
		
		
	}
}
