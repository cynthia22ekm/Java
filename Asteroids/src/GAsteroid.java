import acm.graphics.GRect;
import acm.util.RandomGenerator;

public class GAsteroid extends GRect implements Constants {
	// instance variables
	private int vx;
	private int vy;
	
	private RandomGenerator rgen =  RandomGenerator.getInstance();

	public GAsteroid() {
		super(ASTEROID_SIZE, ASTEROID_SIZE);
		this.vx = rgen.nextInt(-2,+2);
		this.vy = rgen.nextInt(-2,+2);
	}
	
	public void move() {
		super.move(vx, vy);
	}
}
