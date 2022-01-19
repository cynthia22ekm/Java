import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.StringTokenizer;

public class LineEntry {
	private List<String> data = new ArrayList<String>();
	private String lineNumber;
	public LineEntry(String line, Integer n) {
		
		StringTokenizer toki = new StringTokenizer(line, " ");
		lineNumber = String.valueOf(n);
		while (toki.hasMoreTokens()) {
			String dataValue = toki.nextToken();
			dataValue = dataValue.replaceAll("[-+.^:,;]","");
			data.add(dataValue);
			
		}
			}
	
	public List<String> getData() {
		return data;
	}
	
	public String getLineNumber() {
		return lineNumber;
	}
	
	@Override
	public String toString() {
		return "Line: " + lineNumber + " " + data;
	}

}
