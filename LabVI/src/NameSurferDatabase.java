import java.util.HashMap;
import java.util.Map;

public class NameSurferDatabase {
	private Map<String, NameSurferEntry> dataBase;

	public NameSurferDatabase() {
		dataBase = new HashMap<String, NameSurferEntry>();
	}

	public void addEntry(NameSurferEntry entry) {
		dataBase.put(entry.getSymbol().toLowerCase(), entry);
	}

	public NameSurferEntry find(String symbol) {
		return dataBase.get(symbol);
	}
}
