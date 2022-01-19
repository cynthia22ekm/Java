import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import acm.program.ConsoleProgram;

public class ButtonProgram_NormalClass extends ConsoleProgram implements ActionListener {

	// instance variables (almost like global variables)
	private JTextField tf;
	private JButton btn;

	public void init() {
		// for testing
		setFont("Arial-bold-32");
		println("hi there");

		createGUI();
	}

	private void createGUI() {
		JLabel name = new JLabel("Name:");
		add(name, SOUTH);
		tf = new JTextField(10);
		add(tf, SOUTH);
		btn = new JButton("Graph");

		btn.addActionListener(new MyListener());
		add(btn, SOUTH);
	}
}

// normal class
class MyListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		System.out.println("button was pressed");
	}
}
