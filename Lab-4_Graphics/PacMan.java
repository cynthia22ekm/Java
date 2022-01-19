import java.awt.Color;

import acm.graphics.*;
import acm.program.GraphicsProgram;


public class PacMan extends GraphicsProgram {

	public void run() {
		GArc archie=new GArc(200,150,45,270);
		//200 is the width and 150 is the height
		add(archie,100,100);
		archie.setFilled(true);
		archie.setColor(Color.YELLOW);
	}

}
