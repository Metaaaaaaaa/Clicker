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
import javax.swing.JPanel;
import com.jgoodies.forms.factories.DefaultComponentFactory;


public class Stats {

	JFrame frame;
	
	counting counting = new counting();
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	int sW = screenSize.width + (screenSize.width / 25);
    int sH = screenSize.height;
    int sWU = screenSize.width; 
	
	public Stats() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(sWU / 4 , sH / 2 - 10, sW / 4  , sH / 2);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel counterLabel = new JLabel("0");
		counterLabel.setBounds(83, 31, 386, 24);
		frame.getContentPane().add(counterLabel);
		
		JLabel Goldtxt = DefaultComponentFactory.getInstance().createLabel("Gold");
		Goldtxt.setBounds(10, 31, 67, 24);
		frame.getContentPane().add(Goldtxt);
		
		JLabel CDtxt = new JLabel("CD:");
		CDtxt.setBounds(10, 66, 46, 14);
		frame.getContentPane().add(CDtxt);
		
		JLabel CDLabel = new JLabel("0");
		CDLabel.setBounds(83, 66, 386, 26);
		frame.getContentPane().add(CDLabel);
		
		JLabel DPStxt = new JLabel("DPS:");
		DPStxt.setBounds(10, 103, 46, 14);
		frame.getContentPane().add(DPStxt);
		
		JLabel DPSLabel = new JLabel("0");
		DPSLabel.setBounds(83, 103, 386, 26);
		frame.getContentPane().add(DPSLabel);
		
		Timer timer = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double count = counting.getCounter();
                counterLabel.setText(Double.toString(Math.round(count))); 
                DPSLabel.setText(Double.toString(counting.getDPS())); 
                CDLabel.setText(Double.toString(counting.getCD())); 
                
                
                
            } 
        });
		timer.start(); 
	}
}/**/
