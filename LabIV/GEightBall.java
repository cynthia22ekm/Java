import java.awt.Color;

import acm.graphics.GCompound;
import acm.graphics.GLabel;
import acm.graphics.GOval;

// Composition
public class GEightBall extends GCompound {
	private final int BALL_SIZE = 30;

	public GEightBall() {
		GOval ball = new GOval(BALL_SIZE, BALL_SIZE);
		ball.setColor(Color.BLUE);
		ball.setFilled(true);
		add(ball, 0, 0);

		GLabel eight = new GLabel("8");
		eight.setColor(Color.YELLOW);
		eight.setFont("SansSerif-24");
		add(eight, 8, 24);
	}
}
