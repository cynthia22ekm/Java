import java.awt.Color;

import acm.graphics.GOval;

public class GBullet extends GOval implements Constants {
	// instance variables
	private double vx;
	private double vy;

	public GBullet(double angle) {
		super(BULLET_SIZE, BULLET_SIZE);
		super.setFilled(true);
		super.setColor(Color.RED);

		double rads = Math.toRadians(angle);
		this.vy = BULLET_SPEED * -Math.sin(rads);
		this.vx = BULLET_SPEED * Math.cos(rads);
	}

	public void move() {
		super.move(vx, vy);
	}
}
