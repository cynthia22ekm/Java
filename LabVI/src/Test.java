
import acm.graphics.GOval;
import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;


public class Test extends ConsoleProgram{
	public void run()
	{
		permute("a","bcd");
	}

	private void permute(String picked, String remaining) {
		// base case
		if (remaining.length() == 1) {
		System.out.println(picked + remaining + ", ");
		}
		// recursive case
		for (int i = 0; i < remaining.length(); i++) {
			System.out.println(i);	
		char pick = remaining.charAt(i); // pick a letter
		System.out.println(pick);	
		System.out.println(remaining.substring(1, 1));
		String front = remaining.substring(0, i);
		System.out.println(front);	
		String back = remaining.substring(i + 1);
		System.out.println(back);	
		permute(picked + pick, front + back);
		}
}
}
