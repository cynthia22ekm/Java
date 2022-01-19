import stanford.karel.SuperKarel;

public class WritingKarel extends SuperKarel {

	public void run() {
		for (int i=0;i<3;i++)
		{
			move();
		}
		
		moveUpAndPutBeepr();
		turnRightAndPutBeeper();
		putBeeperFirstDiagon();
		putBeeperSecondDiagon();
	   }

	private void putBeeperSecondDiagon() {
		for(int j=0;j<3;j++)
		 {
		 turnLeft();
		 move();
		 putBeeper();
		 turnRight();
		 move();
		 }
		turnRight();
		
	}

	private void putBeeperFirstDiagon() {
	 turnRight();
	 move();
	 for(int i=0;i<3;i++)
	 {
	 turnRight();
	 move();
	 putBeeper();
	 turnLeft();
	 move();
	 }
	 
	}

	private void turnRightAndPutBeeper() {
		turnRight();
		for(int k=0;k<4;k++)
		{
			move();
		}
		putBeeper();
				
	}

	private void moveUpAndPutBeepr() {
		turnLeft();
		
		for(int j=0;j<7;j++)
		{
			move();
			putBeeper();
			
			
		}
		
	}
}