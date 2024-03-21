package Main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Canvas;
import javax.swing.JPanel;
import javax.swing.UIManager;
import java.awt.Rectangle;
import javax.swing.JRadioButton;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class WorldSelection {

	JFrame frame;
	Stats stats = new Stats();
	private static String currentWorld;
	boolean switchWorld = false;
	
			
	
	/**/
	
	public String getCurrentWorld() {
		return currentWorld;
	}


	public static void setCurrentWorld(String cW) {
		currentWorld = cW;
	}
	
	public boolean switchWorld() {
		return switchWorld;
	}
	

	public WorldSelection() {
		initialize();
	}

	
	private void initialize() {
		
		currentWorld = "Earth";
		
		frame = new JFrame();
		frame.setBounds(stats.sWU  - (stats.sWU / 4), 0, stats.sW / 4  , 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Earth");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { currentWorld = "Earth";
			}
		});
		btnNewButton.setBounds(32, 34, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Venus");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) { currentWorld = "Venus";
				
			
				
			}
		});
		
		btnNewButton_1.setBounds(32, 83, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
	}
}
