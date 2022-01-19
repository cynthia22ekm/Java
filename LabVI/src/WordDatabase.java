import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


public class WordDatabase {
	private Map<String, LineEntry> dataBase;
	public WordDatabase() {
		dataBase = new TreeMap<String, LineEntry>();
	}

	public void addEntry(LineEntry entry) {
		dataBase.put(entry.getLineNumber(), entry);
	}

	public LineEntry find(String symbol) {
		return dataBase.get(symbol);
	}

}
