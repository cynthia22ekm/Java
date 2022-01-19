import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.GArc;
import acm.graphics.GLabel;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;


public class GraphicsTest extends GraphicsProgram{
	private GLabel lbl;
	public void run()
	{
//	GOval ring =new GOval(20, 20);
//	ring.setColor(Color.RED);
//	//ring.setFilled(true);
//	add(ring, 0, 0);
//	
//	GArc archie = new GArc(100, 500, 0, 180);
//	add(archie, 50, 50);
		
		lbl = new GLabel("");
		lbl.setFont("Arial-bold-20");
		//add(lbl, 0, 0);
		addMouseListeners();
}
	public void mouseMoved(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		lbl.setLabel("x=" + x + ",y=" + y);
		//lbl.setLocation(x, y);
		add(lbl,x,y);
		}
}