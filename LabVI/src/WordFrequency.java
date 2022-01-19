import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

import acm.program.ConsoleProgram;


public class WordFrequency extends ConsoleProgram{
	private final String DATA_FILE = "src/Bible.txt";
	private LineEntry entry;
	private WordDatabase db;
	public void init() {
		try {
			readDataFromFile();
				
			} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void readDataFromFile() throws IOException {
		db = new WordDatabase();
		try {
			FileReader fr = new FileReader(DATA_FILE);
			BufferedReader br = new BufferedReader(fr);
			readLines(br);
			br.close();
			fr.close();
		}

		catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
	
	private void readLines(BufferedReader br) throws IOException {
		while (true) {
			int i=1;
			String line = br.readLine();
			if (line == null) {
				break;
			}
			entry = new LineEntry(line,i);
			db.addEntry(entry);
			println(db.find(String.valueOf(i)));
			i++;
			
	}
}
}
