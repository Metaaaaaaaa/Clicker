package Main;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class Crafting {

	JFrame frame;
	
	Stats stats = new Stats();

	/**/
	public Crafting() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
