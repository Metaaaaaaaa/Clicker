package Main;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class Tabs {

	JFrame frame;

	/**/
	public Tabs() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
