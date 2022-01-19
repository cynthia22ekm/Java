import acm.graphics.GRect;
import acm.program.GraphicsProgram;


public class Pyramid extends GraphicsProgram {
	private int count=1;
	private int x=500;
	public void run()
	{
		for(int i=100;i<=130;i=i+15)
		{
		
		drawOneRowOfStones(i,count,x);
		count++;
		x=x-15;
		
	}
	}
	
	private void drawOneRowOfStones(int y,int count,int x) {
		
		for (int i = 1; i <= count; i++) {
		GRect brick = new GRect(30, 15);
		add(brick, x, y);
		x = x +30;
		}
			}
	
}
