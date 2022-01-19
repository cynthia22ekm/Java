import stanford.karel.SuperKarel;

/**
 * MIT License (http://choosealicense.com/licenses/mit/)
 * 
 * Karel: PyramidKarel
 * 
 * Karel is supposed to build a pyramid.
 * 
 * @see http://www.VariationenZumThema.de/
 * @author Ralph P. Lano
 */
public class PyramidKarel extends SuperKarel {

	public void run() {
		
		while (frontIsClear()) {
			putBeeper();
			move();
		}
		putBeeper();
		turnLeft();
		move();
		turnLeft();
		
			
		}

}
