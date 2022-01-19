import stanford.karel.SuperKarel;

public class WindowCleaningKarel extends SuperKarel {

	public void run() 
	{
		cleanFiveSkyscrapers();

	}

	public void cleanFiveSkyscrapers() 
	{
		for (int i = 0; i < 5; i++) {
			cleanOneSkyscraper();
		}
	}

	public void cleanOneSkyscraper() 
	{
		moveUpAndClean();
		moveOver();
		moveDownAndClean();
	}

	public void moveUpAndClean() 
	{

		turnLeft();
		while (rightIsBlocked()) {
			move();
		}

	}

	public void moveOver() {

		turnRight();
		move();
		move();

	}

	public void moveDownAndClean() {

		turnRight();
		while (frontIsClear()) {
			move();
		}
		turnLeft();
	}

}