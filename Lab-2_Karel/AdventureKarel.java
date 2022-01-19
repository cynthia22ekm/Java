import stanford.karel.SuperKarel;


public class AdventureKarel extends SuperKarel {

	public void run() {
		
		while(rightIsBlocked())
		{
			move();
		}
		turnAround();
		move();
		turnAround();
		
		
			
	}
}