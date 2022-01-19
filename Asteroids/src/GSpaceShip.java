import acm.graphics.GPolygon;


public class GSpaceShip extends GPolygon implements Constants {
	//Inheritance is used here as they are using GPolygon
	// instance variables
	private double vx;
	private double vy;
	private double angle = -90;

	public double getAngle() {
		return angle;
	}

	public GSpaceShip() {
		super();
		super.addVertex(0, SPACESHIP_SIZE);
		super.addVertex(SPACESHIP_SIZE/2, -SPACESHIP_SIZE/2);
		super.addVertex(0, 0);
		super.addVertex(-SPACESHIP_SIZE/2, -SPACESHIP_SIZE/2);
		
		this.vx = 0;
		this.vy = 0;
	}
	
	public void move() {
		super.move(vx, vy);
	}

	public void rotate(double delta) {
		super.rotate(delta);
		angle += delta;
	}
	
	public void accelerate() {
		double rads = Math.toRadians(angle);
		vy += -Math.sin(rads);
		vx += Math.cos(rads);
	}
}
