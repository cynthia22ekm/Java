import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import acm.program.ConsoleProgram;
import acm.program.Program;

public class NameSurfer extends Program {
	private JTextField tf;
	private JButton btn1;
	private JButton btn2;
	private final String NAMES_DATA_FILE = "src/NamesData.txt";
	private NameSurferDatabase db;
	private NameSurferCanvas canvas;
	private NameSurferEntry entry;

	public void init() {
		createGUI();
		addActionListeners();
		try {
			readDataFromFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void readDataFromFile() throws IOException {
		db = new NameSurferDatabase();
		try {
			FileReader fr = new FileReader(NAMES_DATA_FILE);
			BufferedReader br = new BufferedReader(fr);
			readDates(br);
			readNamesData(br);
			br.close();
			fr.close();
		}

		catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	private void readNamesData(BufferedReader br) throws IOException {
		String Dates = br.readLine();
	}

	private void readDates(BufferedReader br) throws IOException {
		while (true) {
			String line = br.readLine();
			if (line == null) {
				break;
			}
			entry = new NameSurferEntry(line);
			db.addEntry(entry);
		}
	}

	private void createGUI() {
		JLabel name = new JLabel("Name:");
		add(name, SOUTH);
		tf = new JTextField(10);
		add(tf, SOUTH);
		btn1 = new JButton("Graph");
		add(btn1, SOUTH);
		btn2 = new JButton("Clear");
		add(btn2, SOUTH);
		canvas = new NameSurferCanvas();
		add(canvas, CENTER);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn1) {
			String symbol = tf.getText().toLowerCase();
			NameSurferEntry entry = db.find(symbol);
			canvas.drawGraph(entry);
		} else if (e.getSource() == btn2) {
			tf.setText(" ");
			entry.clear();
			canvas.drawGraph(entry);
		}
	}
}
