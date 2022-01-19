import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import acm.program.ConsoleProgram;

public class LotteryWithoutSet extends ConsoleProgram {
	private int randumPosition;
	public void run() {
		setFont("Arial-bold-24");
		println("Lottery System Without Set");
		randomNumbers();
	}

	private void randomNumbers() {
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= 49; i++) {
			list.add(i);
		}
		
		for (int j = 1; j <= 6; j++) {
			Random rand = new Random();
			randumPosition=rand.nextInt(list.size());
			println(list.get(randumPosition));
			list.remove(randumPosition);
		}
	}
}
