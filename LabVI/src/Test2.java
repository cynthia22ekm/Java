import acm.program.ConsoleProgram;


public class Test2 extends ConsoleProgram {
	
	public void run()
	{
		int seconds=readInt("Enter a number:");
		String word =formatNumericString(seconds) ;
		println(word);
		
	}

	private String formatNumericString(int seconds) {
		int hours = seconds/3600;
		int minutes=(seconds-(hours*3600))/60;
		int secondss=seconds-((minutes*60)+(hours*3600));
	//	int secondss=seconds%60;
		
		return (String)(hours+":"+minutes+":"+secondss);
	}

}
