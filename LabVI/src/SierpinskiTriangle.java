import java.awt.Color;

import acm.graphics.GPolygon;
import acm.program.GraphicsProgram;

public class SierpinskiTriangle extends GraphicsProgram {
	private int x = 200; // Position of triangle at x position
	private int y = 100; // Position of triangle at x position
	private int w = 400; // Width of the triangle
	private int h = 400; // Height of the triangle

	public void run() {
		setSize(400, 200);
		drawSierpinski(200, 100, 400, 300);
	}

	void drawSierpinski(double x, double y, double w, double h) {
		drawTriangle(x, y, w, h);
		if ((w < 0.2) || (h < 0.2)) {
			return;
		}
		double h2 = h / 2;
		double w2 = w / 2;
		drawSierpinski(x, y, w2, h2);
		drawSierpinski(x + w2 / 2, y + h2, w2, h2);
		drawSierpinski(x + w2, y, w2, h2);
	}

	private void drawTriangle(double x, double y, double w, double h) {

		GPolygon triangle = new GPolygon();
		triangle.addVertex(x, y);
		triangle.addVertex(x + (w / 2), y);
		triangle.addVertex(x + w, y);
		triangle.addVertex(x + (w / 2), y + h);
		add(triangle, x, y);
		triangle.setColor(Color.RED);

	}
}