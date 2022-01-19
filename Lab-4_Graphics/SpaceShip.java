import acm.graphics.GPolygon;
import acm.program.GraphicsProgram;

/**
 * MIT License (http://choosealicense.com/licenses/mit/)
 * 
 * Graphics: SpaceShip
 * 
 * Draw a space ship using a polygon.
 * 
 * @see http://www.VariationenZumThema.de/
 * @author Ralph P. Lano
 */
public class SpaceShip extends GraphicsProgram {

	public void run() {
		setSize(600, 600);
		GPolygon spaceship=new GPolygon();
		spaceship.addVertex(120, 100);
		spaceship.addVertex(200,300);
		spaceship.addVertex(120,220);
		spaceship.addVertex(50,300);
		add(spaceship,100,100);
		
	}
}
