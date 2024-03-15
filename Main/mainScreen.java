package Main;

import java.awt.EventQueue;
import java.util.HashMap;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollBar;

import java.awt.Component;
import java.awt.Scrollbar;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.event.AdjustmentListener;
import java.awt.event.AdjustmentEvent;
import java.awt.Dimension;
import java.awt.Toolkit;

public class mainScreen {

	private JFrame frame;
	
    Shop shopWindow = new Shop();
    WorldSelection worldSelection = new WorldSelection();
    Stats stats = new Stats();
    Inventory inventory = new Inventory();
    counting counting = new counting();
    Tabs tabs = new Tabs();

	
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    mainScreen window = new mainScreen();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

   
    public mainScreen() {
        initialize();
    }

   
    private void initialize() {
    	
    	
        frame = new JFrame();
        frame.setBounds(stats.sW / 4 -  (stats.sW / 75), 0, stats.sW / 4 , stats.sH / 2 - 40);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        shopWindow.frame.setVisible(true);
        stats.frame.setVisible(true);
        inventory.frame.setVisible(true);
        tabs.frame.setVisible(true);
        
        JButton btnNewButton = new JButton("New button");
        btnNewButton.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		counting.addCounter(counting.getCD());
        		
        	}
        });
        btnNewButton.setBounds(136, 174, 89, 23);
        frame.getContentPane().add(btnNewButton);
    }
    }

