import acm.graphics.GRect;
import acm.program.GraphicsProgram;


public class Stairs extends GraphicsProgram  {
private int count=1;
	public void run()
	{
		for(int i=100;i<=160;i=i+15)
		{
		
		drawOneRowOfStones(i,count);
		count++;
		
	}
	}
	
	private void drawOneRowOfStones(int y,int count) {
		int x = 50;
		for (int i = 1; i <= count; i++) {
			
		GRect brick = new GRect(30, 15);
		add(brick, x, y);
		x = x + 30;
				}
		}
	
}
