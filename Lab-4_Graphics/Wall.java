import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class Wall extends GraphicsProgram {
	
	public void run() {
		setSize(300, 200);
		for (int j = 108; j < 154; j=j+15) {
			drawRowOfNBricks(j);
		}
	}

	private void drawRowOfNBricks(int j) {
		 // beginning y position of wall
		int x = 70; 
		for (int i = 0; i < 5; i++) {
			GRect brick = new GRect(30, 15);
			add(brick, x, j);
			x = x + 30;
			
		}
		
	}
}
