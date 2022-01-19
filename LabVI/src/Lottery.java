import java.util.HashSet;
import java.util.Random;
import acm.program.ConsoleProgram;


public class Lottery extends ConsoleProgram {
	private int uniqueNumber;
	public void init() {
		setFont("Arial-bold-24");
		println("Lottery System");
		HashSet<Integer> randnumber = new HashSet<Integer>();
		Random rand = new Random();
		for (int i = 1; i < 6; i++) {
			uniqueNumber = rand.nextInt(49) + 1;
			if (!randnumber.contains(uniqueNumber)) {
				randnumber.add(uniqueNumber);
			}

		}
		println(randnumber);
	}
}
