import java.util.*;

public class StockDatabase extends HashMap<String, StockEntry> {
	//private Map<String, StockEntry> dataBase;

	public StockDatabase() {
		//dataBase = new HashMap<String, StockEntry>();
	}

	public void addEntry(StockEntry entry) {
		put(entry.getSymbol().toLowerCase(), entry);
	}

	public StockEntry find(String symbol) {
		return get(symbol);
	}

}
