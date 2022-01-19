import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import acm.graphics.GLabel;
import acm.graphics.GOval;


// Inheritance
public class GEightBallI extends GOval {

	public GEightBallI(double width, double height) {
		super(width, height);
		setFilled(true);
		setColor(Color.BLUE);
	}
//we are mentioning GOval as super
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		
		g.setColor(Color.YELLOW);
		g.setFont(new Font("SansSerif",Font.PLAIN,24));
		g.drawString("8", (int)this.getX()+8, (int)this.getY()+24);
	}
}
