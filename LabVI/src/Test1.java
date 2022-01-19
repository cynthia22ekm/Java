import acm.program.ConsoleProgram;


public class Test1 extends ConsoleProgram {
	
	public void run()
	{
		int cent=readInt("Enter a number:");
		String word =formatNumericString(cent) ;
		println(word);
		
	}

	private String formatNumericString(int money) {
		int euros = money / 100;
		int cents = money % 100;
		int firstthousand=euros/1000;
		int secondthousand=euros%1000;
		int first=firstthousand%1000;
		println("The amount is " +euros + "," + cents + " Euro.");
		println(firstthousand);
		println(secondthousand);
		println(first);
		return (String)(first+"."+firstthousand+"."+secondthousand+","+cents);
	}

}
