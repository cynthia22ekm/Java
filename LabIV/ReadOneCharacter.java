import acm.program.ConsoleProgram;


public class ReadOneCharacter extends ConsoleProgram{
	public void run() {
		setSize(400, 200);
		setFont("Times New Roman-bold-24");

		char c = readOneChar();
		println("You entered: " + c);
	}

	private char readOneChar() {
		String s;
		while (true) {
			s = readLine("Enter a string");
			if (s.length() == 1)
				break;
			else
			println("You idiot, you must enter only one character:");
		}
		char c = s.charAt(0);
		return c;
	}
}
