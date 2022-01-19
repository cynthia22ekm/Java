import stanford.karel.Karel;

public class WallKarel extends Karel {

	public void run() {
		moveToWall();
	}

	public void moveToWall() {
		while (frontIsClear()) {
			move();
		}
	}
}