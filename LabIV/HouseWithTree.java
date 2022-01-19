import java.awt.Color;

import acm.graphics.*;
import acm.program.GraphicsProgram;

public class HouseWithTree extends GraphicsProgram {

	public void run() {
		GRect fritz = new GRect(50, 50);
		fritz.setColor(Color.BLUE);
		fritz.setFilled(true);
		fritz.setFillColor(Color.GREEN);
		add(fritz, 100, 100);

		GOval lisa = new GOval(20, 100);
		add(lisa, 200, 100);

		GPolygon poly = new GPolygon();
		poly.addVertex(0, 0);
		poly.addVertex(100, 0);
		poly.addVertex(0, 100);
		poly.setFilled(true);
		poly.setColor(Color.PINK);
		add(poly, 300, 100);

		GImage georg = new GImage("Ohm.jpeg");
		georg.scale(0.5);
		add(georg, 400, 100);

		GLabel gameOverText = new GLabel("Game Over");
		gameOverText.setFont("SansSerif-36");
		gameOverText.setColor(Color.RED);
		add(gameOverText, 100, 200);
	}
}
