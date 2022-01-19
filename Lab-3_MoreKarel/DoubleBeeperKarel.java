import stanford.karel.SuperKarel;

/**
 * MIT License (http://choosealicense.com/licenses/mit/)
 * 
 * Karel: DoubleBeeperKarel
 * 
 * Karel is can do maths: his task is to double the number of beepers in the
 * pile of beepers in front of him.
 * 
 * @see http://www.VariationenZumThema.de/
 * @author Ralph P. Lano
 */
public class DoubleBeeperKarel extends SuperKarel {

	public void run() {
		move();
		movePileAndDoubleBeepers();
		movePileBack();
		moveBackToStart();
	}

	private void movePileAndDoubleBeepers() {
		while (beepersPresent()) {
			pickBeeper();
			move();
			putBeeper();			
			putBeeper();			
			turnAround();
			move();
			turnAround();
		}
		move();
	}

	private void movePileBack() {
		while (beepersPresent()) {
			pickBeeper();
			turnAround();
			move();
			putBeeper();
			turnAround();
			move();
		}
	}

	private void moveBackToStart() {
		turnAround();
		move();
		move();
		turnAround();
	}
}