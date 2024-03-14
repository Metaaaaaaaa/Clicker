package Main;

import java.awt.EventQueue;

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

public class mainScreen {

	private JFrame frame;

	
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
        frame.setBounds(100, 100, 1107, 550);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        
        JButton btnOpenShop = new JButton("Open Shop");
        btnOpenShop.setBounds(10, 10, 150, 30);
        btnOpenShop.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                openShopWindow();
            }
        });
        frame.getContentPane().add(btnOpenShop);
    }

    
    private void openShopWindow() {
        Shop shopWindow = new Shop();
        shopWindow.frame.setVisible(true);
    }
}
