package Main;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class WorldSelection {

	JFrame frame;
	Stats stats = new Stats();
	
	/**/
	
	public WorldSelection() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(stats.sWU  - (stats.sWU / 4), 0, stats.sW / 4  , 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
