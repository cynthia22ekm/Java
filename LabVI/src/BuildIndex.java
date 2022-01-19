import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;
import acm.program.ConsoleProgram;

public class BuildIndex extends ConsoleProgram {
	private final String DATA_FILE = "src/Bible.txt";
	private Map<String, Map<String, List<Integer>>> words = new TreeMap<String, Map<String, List<Integer>>>((String.CASE_INSENSITIVE_ORDER));
	private int lineNumber = 1;
	private String Count = "Count:";
	private String LineNo = "LineNo:";

	public void run() {
		setSize(400, 200);
		setFont("monospaced-18");
		try {
			readTextAndBuildIndex();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void readTextAndBuildIndex() throws IOException {
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
			String line = br.readLine();
			if (line == null) {
				break;
			}
			String[] wordsAfterSplit = line.split(" ");

			for (int j = 0; j < wordsAfterSplit.length; j++) {
				wordsAfterSplit[j] = wordsAfterSplit[j].replaceAll("[-+.^:,;]",
						"");
			}
			for (String str : wordsAfterSplit) {

				if (words.containsKey(str)) {

					words.get(str).get(Count)
							.add(0, 1 + words.get(str).get(Count).get(0));
					words.get(str).get(Count).remove(1);
					if (words.get(str).get(LineNo)
							.get((words.get(str).get(LineNo).size()) - 1) != lineNumber) {

						words.get(str).get(LineNo).add(lineNumber);
					}

				} else {
					words.put(str, new HashMap<String, List<Integer>>());
					words.get(str).put(Count, new ArrayList<Integer>());
					words.get(str).get(Count).add(0, 1);
					words.get(str).put(LineNo, new ArrayList<Integer>());
					words.get(str).get(LineNo).add(lineNumber);
				}
			}
			lineNumber++;
		}
		println(words);
	}
}
