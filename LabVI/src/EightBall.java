import java.awt.Color;

import acm.graphics.GCompound;
import acm.graphics.GLabel;
import acm.graphics.GOval;


public class EightBall extends GCompound{
	
	public EightBall(){
	
	GOval ball = new GOval(40, 40);
	ball.setColor(Color.RED);
	ball.setFilled(true);
	add(ball, 0, 0);

	
	GLabel eight = new GLabel("8");
	eight.setColor(Color.YELLOW);
	eight.setFont("SansSerif-24");
	add(eight, 8, 24);
}
}
