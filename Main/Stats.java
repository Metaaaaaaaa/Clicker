package Main;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Stats {

	JFrame frame;
	
	counting counting = new counting();
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	int sW = screenSize.width + (screenSize.width / 25);
    int sH = screenSize.height;
    int sWU = screenSize.width; //U steht für unverändert , brauch ich weil ich sonst nicht die Tabs richtig positionieren kann
    
   
	
	public Stats() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(sWU / 4 , sH / 2, sW / 4  , sH / 2);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel counterLabel = new JLabel("0");
		counterLabel.setBounds(10, 69, 115, 14);
		frame.getContentPane().add(counterLabel);
		
		Timer timer = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double count = counting.getCounter();
                counterLabel.setText(Double.toString(count)); 
                
            } 
        });
		timer.start(); 
	}

}/**/
