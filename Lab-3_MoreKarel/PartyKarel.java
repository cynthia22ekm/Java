import stanford.karel.SuperKarel;

/**
 * MIT License (http://choosealicense.com/licenses/mit/)
 * 
 * Karel: PartyKarel
 * 
 * Karel has to clean up his place after a party.  
 * 
 * @see http://www.VariationenZumThema.de/
 * @author Ralph P. Lano
 */
public class PartyKarel  extends SuperKarel {

	public void run() {
		for(int i=0;i<3;i++){
		    moveEast();	
			moveWest();
		}
		
		}
	

	private void moveWest() {
while(frontIsClear()){
			
			
			if(beepersPresent())
			{
				pickBeeper();
			}
			move();
		}
		turnRight();
		
		if(frontIsClear() || beepersPresent()){
			move();
		turnRight();
		}
	
	}

	private void moveEast() {
	
		while(frontIsClear()){
			
			
			if(beepersPresent())
			{
				pickBeeper();
			}
			move();
		}
		turnLeft();
		move();
		
			turnLeft();	
		
		
		
	}
}