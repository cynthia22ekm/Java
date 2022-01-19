import java.awt.Color;
import java.util.List;

import acm.graphics.GCanvas;
import acm.graphics.GLabel;
import acm.graphics.GLine;
import acm.graphics.GOval;
import acm.graphics.GRect;

public class StockCanvas extends GCanvas {
	public StockCanvas() {
		super();
		setBackground(Color.LIGHT_GRAY);
	}

	public void drawGraph(StockEntry entry) {
		System.out.println(entry);
		removeAll();
		drawGrid();
		drawEntry(entry);
	}

	private void drawEntry(StockEntry entry) {
		List<Double> data = entry.getData();       //why we need to get data from entry .Already entry has data right?
		int size = data.size();
		double max = getMax(data);

		// scaling business:
		int w = getWidth();
		int h = getHeight();
		double scaleX = w / size;
		double scaleY = h / max;

		// drawing business
		double x0 = 0;
		double y0 = 0;
		for (int i = 0; i < size; i++) {
			double x = i * scaleX;
			double y = data.get(i) * scaleY;   //doubt why multiplied by sizeY
			GOval dot = new GOval(2, 2);
			add(dot, x, y);
			GLine ln = new GLine(x0, y0, x, y);
			add(ln);
			x0 = x;
			y0 = y;
		}

	}

	private double getMax(List<Double> data) {
		double max = 0;
		for (double value : data) {
			if (value > max) {
				max = value;
			}
		}
		return max;
	}

	private void drawGrid() {
		int w = getWidth();
		int h = getHeight();

		// draw x-axis
		int stepY = h / 10;
		for (int i = 0; i < 10; i++) {
			GLine ln = new GLine(0, stepY * i, w, stepY * i);
			add(ln);
		}

		// draw y-axis
		int stepX = w / 10;
		for (int i = 0; i < 10; i++) {
			GLine ln = new GLine(stepX * i, 0, stepX * i, h);
			add(ln);
		}
	}
}
