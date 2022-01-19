import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import acm.graphics.GCanvas;
import acm.graphics.GLabel;
import acm.graphics.GLine;
import acm.graphics.GOval;
import acm.graphics.GRect;

public class NameSurferCanvas extends GCanvas {
	private double dataDisplayPostion = 60;

	public NameSurferCanvas() {
		super();
		setBackground(Color.LIGHT_GRAY);
	}

	public void drawGraph(NameSurferEntry entry) {
		removeAll();
		drawGrid();
		drawEntry(entry);
	}

	public void drawEntry(NameSurferEntry entry) {
		List<Double> data = entry.getData();
		System.out.println(data);
		int size = data.size();
		double max = getMax(data);
		int w = getWidth();
		int h = getHeight();
		double scaleX = w / size;
		double scaleY = h / max;
		double x0 = 0;
		double y0 = 0;
		for (int i = 0; i < size; i++) {
			double x = i * scaleX;
			double y = data.get(i) * scaleY;
			GOval dot = new GOval(2, 2);
			add(dot, x, y);
			GLabel name = new GLabel(entry.getSymbol(), x0, y0);
			add(name);
			GLabel value = new GLabel(String.valueOf(data.get(i)), x0
					+ dataDisplayPostion, y0);
			add(value);
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
