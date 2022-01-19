import acm.graphics.GRect;
import acm.program.GraphicsProgram;


public class Wall extends GraphicsProgram {

	public void run()
	{
		for(int i=100;i<=130;i=i+15)
		{
		drawOneRowOfStones(i);
		
	}
	}
	
	private void drawOneRowOfStones(int y) {
		int x = 50; // beginning x position of wall
		for (int i = 0; i < 5; i++) {
		GRect brick = new GRect(30, 15);
		add(brick, x, y);
		x = x + 30;
		}
		}
}
