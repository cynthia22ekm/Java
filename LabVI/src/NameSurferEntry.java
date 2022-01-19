import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class NameSurferEntry {
	private String symbol;
	private List<Double> data = new ArrayList<Double>();

	public NameSurferEntry(String line) {
		StringTokenizer toki = new StringTokenizer(line, " ");
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
		return "Graph: " + symbol + " " + data;
	}

	public List<Double> getData() {
		return data;
	}
	public void clear() {
		data.clear();
		
    }
	
}
