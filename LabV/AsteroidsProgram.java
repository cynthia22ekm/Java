import java.awt.event.KeyEvent;

import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class AsteroidsProgram extends GraphicsProgram implements Constants {

	// instance variables
	private boolean gameOver = false;
	private GAsteroid[] asti;
	private GSpaceShip ship;
	private GBullet bullet;

	private RandomGenerator rgen = RandomGenerator.getInstance();

	public void run() {
		setup();
		gameLoop();
	}

	private void gameLoop() {
		while (!gameOver) {
			moveAsteroids();
			moveSpaceShip();
			moveBullet();
			checkForCollissionWithWall();
			pause(DELAY);
		}
	}

	private void moveBullet() {
		if (bullet != null) {
			bullet.move();
		}
	}

	private void moveSpaceShip() {
		ship.move();
	}

	private void checkForCollissionWithWall() {
		checkForCollissionAsteroidsWithWall();
		checkForCollissionSpaceShipWithWall();
	}

	private void checkForCollissionSpaceShipWithWall() {
		double x = ship.getX();
		double y = ship.getY();
		x = (x + _WIDTH) % _WIDTH;
		y = (y + _HEIGHT) % _HEIGHT;
		ship.setLocation(x, y);
	}

	private void checkForCollissionAsteroidsWithWall() {
		for (int i = 0; i < NR_OF_ASTEROIDS; i++) {
			double x = asti[i].getX();
			double y = asti[i].getY();
			x = (x + _WIDTH) % _WIDTH;
			y = (y + _HEIGHT) % _HEIGHT;
			asti[i].setLocation(x, y);
		}
	}

	private void moveAsteroids() {
		for (int i = 0; i < NR_OF_ASTEROIDS; i++) {
			asti[i].move();
		}
	}

	private void setup() {
		setSize(_WIDTH, _HEIGHT);
		createAsteroids();
		createSpaceShip();
		addKeyListeners();
		waitForClick();
	}

	public void keyPressed(KeyEvent e) {
		int code = e.getKeyCode();
		switch (code) {
		case 37: // left
			ship.rotate(-5);
			break;

		case 39: // right
			ship.rotate(5);
			break;

		case 38: // accelerate
			ship.accelerate();
			break;

		case 32: // fire bullet
			if (bullet == null) {
				bullet = new GBullet(ship.getAngle());
				add(bullet, ship.getX(), ship.getY());
			}
			break;

		default:
			System.out.println(code);
			break;
		}
	}

	private void createSpaceShip() {
		ship = new GSpaceShip();
		add(ship, _WIDTH / 2, _HEIGHT / 2);
	}

	private void createAsteroids() {
		asti = new GAsteroid[NR_OF_ASTEROIDS];
		for (int i = 0; i < NR_OF_ASTEROIDS; i++) {
			asti[i] = new GAsteroid();
			double x = rgen.nextDouble(0, _WIDTH);
			double y = rgen.nextDouble(0, _HEIGHT);
			add(asti[i], x, y);
		}
	}
}
