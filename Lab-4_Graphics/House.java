import java.awt.Color;

//public GLine(double x0,
//        double y0,
//        double x1,
//        double y1)
//Constructs a line segment from its endpoints. The point (x0, y0) defines the start of the line and the point (x1, y1) defines the end.
//Parameters:
//x0 - The x-coordinate of the start of the line
//y0 - The y-coordinate of the start of the line
//x1 - The x-coordinate of the end of the line
//y1 - The y-coordinate of the end of the line

import acm.graphics.*;
import acm.program.GraphicsProgram;

public class House extends GraphicsProgram {

	public void run() {
		
		createTree();
		createHouse();
		createSun();
		
	}
	
	private void createSun() {
		GOval sun=new GOval(60,60);
		sun.setColor(Color.YELLOW);
		sun.setFilled(true);
		add(sun,300,60);
	}

	private void createHouse() {
		GRect house=new GRect(60,80);
		house.setColor(Color.PINK);
		house.setFilled(true);
		add(house,150,370);
		
		GLine roof1=new GLine(180,320,220,380);
		add(roof1);
		GLine roof2=new GLine(180,320,140,380);
		add(roof2);
	}

	private void createTree() {
		GRect fritz=new GRect(20,50);
		fritz.setColor(Color.ORANGE);
		fritz.setFilled(true);
		add(fritz,50,400);
		
		
		GOval foilage=new GOval(60,80);
		foilage.setColor(Color.GREEN);
		foilage.setFilled(true);
		add(foilage,30,320);
		
	}

	public static void main( String[] args ) {
        new House().start(args);
    }

}
