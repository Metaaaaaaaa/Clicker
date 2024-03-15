package Main;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class Inventory {

	JFrame frame;
	/**/
	Stats stats = new Stats();

	public Inventory() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(stats.sW / 2, 0, stats.sW / 4 , stats.sH - 40);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
