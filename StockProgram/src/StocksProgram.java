import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import acm.graphics.GRect;
import acm.program.Program;

public class StocksProgram extends Program {
	// constants
	private final String STOCK_DATA_FILE = "src/SP500_HistoricalStockDataMonthly.csv";

	// instance variables (almost like global variables)
	private JTextField tf;
	private JButton btn;
	
	private StockDatabase db;
	private StockCanvas canvas;

	public void init() {
		// for testing
		//setFont("Arial-bold-32");
		println("hi there");

		createGUI();
		addActionListeners();

		readDataFromFile();                   //why is it after action listeners?
	}

	private void readDataFromFile() {
		db = new StockDatabase();
		try {
			FileReader fr = new FileReader(STOCK_DATA_FILE);
			BufferedReader br = new BufferedReader(fr);

			readDates(br);

			readStockData(br);

			br.close();
			fr.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void readStockData(BufferedReader br) throws IOException {
		// loop and a half
		while (true) {
			String line = br.readLine();
			if (line == null)
				break;
			// .. do stuff with the line.
			StockEntry entry = new StockEntry(line);
			db.addEntry(entry);
		}
	}

	private void readDates(BufferedReader br) throws IOException {
		String dates = br.readLine();
		//println(dates);
	}

	private void createGUI() {
		JLabel name = new JLabel("Name:");
		add(name, SOUTH);
		tf = new JTextField(10);
		add(tf, SOUTH);
		btn = new JButton("Graph");
		add(btn, SOUTH);
		
		canvas = new StockCanvas();
		add(canvas, CENTER);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn) {
			//println(tf.getText());
			String symbol = tf.getText().toLowerCase();
			StockEntry entry = db.find(symbol);
			canvas.drawGraph(entry);
		}
	}
}
