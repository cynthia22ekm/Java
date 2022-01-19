import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import acm.program.ConsoleProgram;

public class ButtonProgram_This extends ConsoleProgram implements ActionListener {

	// instance variables (almost like global variables)
	private JTextField tf;
	private JButton btn;

	public void init() {
		// for testing
		setFont("Arial-bold-32");
		println("hi there");

		createGUI();
		addActionListeners();
	}

	private void createGUI() {
		JLabel name = new JLabel("Name:");
		add(name, SOUTH);
		tf = new JTextField(10);
		add(tf, SOUTH);
		btn = new JButton("Graph");
		btn.addActionListener(this);
		add(btn, SOUTH);
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btn) {
			println(tf.getText());
		} 
	}
}


