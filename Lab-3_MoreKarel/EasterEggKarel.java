import stanford.karel.SuperKarel;

public class EasterEggKarel extends SuperKarel {

	public void run() {
//		for(int i=0;i<6;i++){
			moveEast();	
//		}
		
		}

	private void moveEast() {
	
		while(frontIsClear()){
			
			move();
			if(beepersPresent())
			{
				pickBeeper();
			}
		}
		turnRight();
		move();
		turnLeft();
		
	}

	
}