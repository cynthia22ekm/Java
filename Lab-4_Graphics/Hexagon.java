import acm.graphics.GPolygon;
import acm.program.GraphicsProgram;

/**
 * MIT License (http://choosealicense.com/licenses/mit/)
 * 
 * Graphics: Hexagon
 * 
 * Draw a hexagon using a polygon.
 * 
 * @see http://www.VariationenZumThema.de/
 * @author Ralph P. Lano
 */
public class Hexagon extends GraphicsProgram {

	public void run() {
		setSize(600, 600);
		createHexagon();
		}

	private void createHexagon() {
		GPolygon hexagon=new GPolygon();
		hexagon.addVertex(100, 100);
		hexagon.addVertex(150,100);
		hexagon.addVertex(200,150);
		hexagon.addVertex(150,200);
		hexagon.addVertex(100,200);
		hexagon.addVertex(50,150);
		add(hexagon,100,100);
		
	}

}
