import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;
import acm.program.ConsoleProgram;

public class StopWords extends ConsoleProgram {
	private final String DATA_FILE = "src/StopWordsFile.txt";
	private Set<String> stopWords = new HashSet<String>();

	public void run() {
		setSize(400, 200);
		setFont("Times New Roman-bold-24");
		try {
			readTextFromFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void readTextFromFile() throws IOException {
		try {
			FileReader fr = new FileReader(DATA_FILE);
			BufferedReader br = new BufferedReader(fr);
			readLines(br);
			br.close();
			fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	private void readLines(BufferedReader br) throws IOException {
		while (true) {
			String line = br.readLine();
			if (line == null) {
				break;
			}
			String[] wordsAfterSplit = line.split(" ");
			for (int i = 0; i < wordsAfterSplit.length; i++) {
				stopWords.add(wordsAfterSplit[i]);
			}
			String sentence = readLine("Enter a sentence: ");
			StringTokenizer st = new StringTokenizer(sentence);
			while (st.hasMoreTokens()) {
				String word = st.nextToken().toLowerCase();
				if (!stopWords.contains(word)) {
					print(word + " ");
				}
			}
		}
	}
}
