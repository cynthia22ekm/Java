import java.util.*;

public class StockEntry {
	private String symbol;
	private List<Double> data = new ArrayList<Double>();
	

	public StockEntry(String line) {
		StringTokenizer toki = new StringTokenizer(line, ",");

		symbol = toki.nextToken();

		while (toki.hasMoreTokens()) {
			String dataValue = toki.nextToken();
			if (!dataValue.equals("null")) {
				data.add(Double.parseDouble(dataValue));
			} else {
				data.add(null);
			}
		}
	}

	public String getSymbol() {
		return symbol;
	}

	@Override
	public String toString() {
		return "StockEntry [symbol=" + symbol + ", data=" + data + "]";
	}

	public List<Double> getData() {
		return data;
	}
}
