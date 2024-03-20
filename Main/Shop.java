package Main;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;

public class Shop {
	/**/
    JFrame frame;
    boolean maxBuy = false;
    
    Stats stats = new Stats();
    // double DPSvalue, double CDvalue, double costBase, double costCurveY,double costCurveExponent
    ShopItem training = new ShopItem(0 ,1 ,1 , 2, 1.2);
    ShopItem varsall = new ShopItem(5 ,0.5 , 0, 2, 2);

    public Shop() {
        initialize();
    }
    
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(0, 0, stats.sW / 4  , stats.sH - 40);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
        frame.getContentPane().setLayout(null);
        
        JButton Varsall = new JButton("Varsall");
        Varsall.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		varsall.buyProgress(maxBuy);
        		
        	}
        });
        Varsall.setBounds(10, 97, 89, 50);
        frame.getContentPane().add(Varsall);
        
        JButton maxBuyButton = new JButton("max buy");
        maxBuyButton.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		if (maxBuy) {
        			maxBuy = false;
        		} else {
        			maxBuy = true;
        		}
        	}
        });
        maxBuyButton.setBounds(10, 0, 89, 23);
        frame.getContentPane().add(maxBuyButton);
        
        JButton btnNewButton = new JButton("New button");
        btnNewButton.setBounds(10, 158, 89, 50);
        frame.getContentPane().add(btnNewButton);
        
        JButton btnNewButton_1 = new JButton("New button");
        btnNewButton_1.setBounds(10, 280, 89, 50);
        frame.getContentPane().add(btnNewButton_1);
        
        JButton btnNewButton_2 = new JButton("New button");
        btnNewButton_2.setBounds(10, 707, 89, 50);
        frame.getContentPane().add(btnNewButton_2);
        
        JButton btnNewButton_3 = new JButton("New button");
        btnNewButton_3.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btnNewButton_3.setBounds(10, 219, 89, 50);
        frame.getContentPane().add(btnNewButton_3);
        
        JButton btnNewButton_4 = new JButton("New button");
        btnNewButton_4.setBounds(10, 341, 89, 50);
        frame.getContentPane().add(btnNewButton_4);
        
        JButton btnNewButton_5 = new JButton("New button");
        btnNewButton_5.setBounds(10, 829, 89, 50);
        frame.getContentPane().add(btnNewButton_5);
        
        JButton btnNewButton_6 = new JButton("New button");
        btnNewButton_6.setBounds(10, 890, 89, 50);
        frame.getContentPane().add(btnNewButton_6);
        
        JLabel lblNewLabel_1 = new JLabel("New label");
        lblNewLabel_1.setBounds(231, 194, 46, 14);
        frame.getContentPane().add(lblNewLabel_1);
        
        JLabel lblNewLabel_3 = new JLabel("New label");
        lblNewLabel_3.setBounds(345, 101, 46, 14);
        frame.getContentPane().add(lblNewLabel_3);
        
        JButton btnNewButton_7 = new JButton("New button");
        btnNewButton_7.setBounds(10, 951, 89, 50);
        frame.getContentPane().add(btnNewButton_7);
        
        JButton btnNewButton_8 = new JButton("New button");
        btnNewButton_8.setBounds(10, 402, 89, 50);
        frame.getContentPane().add(btnNewButton_8);
        
        JButton btnNewButton_9 = new JButton("New button");
        btnNewButton_9.setBounds(10, 524, 89, 50);
        frame.getContentPane().add(btnNewButton_9);
        
        JButton btnNewButton_10 = new JButton("New button");
        btnNewButton_10.setBounds(10, 585, 89, 50);
        frame.getContentPane().add(btnNewButton_10);
        
        JButton btnNewButton_11 = new JButton("New button");
        btnNewButton_11.setBounds(10, 768, 89, 50);
        frame.getContentPane().add(btnNewButton_11);
        
        JButton btnNewButton_12 = new JButton("New button");
        btnNewButton_12.setBounds(10, 646, 89, 50);
        frame.getContentPane().add(btnNewButton_12);
        
        JButton btnNewButton_13 = new JButton("New button");
        btnNewButton_13.setBounds(10, 463, 89, 50);
        frame.getContentPane().add(btnNewButton_13);
        
        JPanel panel = new JPanel();
        panel.setBounds(10, 34, 463, 50);
        frame.getContentPane().add(panel);
        panel.setLayout(null);
        
        JButton Training = new JButton("Trainings");
        Training.setBounds(0, 0, 86, 50);
        panel.add(Training);
        
        JLabel lblNewLabel = new JLabel("New label");
        lblNewLabel.setBounds(99, 0, 174, 50);
        panel.add(lblNewLabel);
        
        JLabel lblNewLabel_2 = new JLabel("New label");
        lblNewLabel_2.setBounds(283, 0, 180, 50);
        panel.add(lblNewLabel_2);
        Training.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        Training.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		if (maxBuy) {
        			double stacks = counting.getCounter() / training.getCost();
        			counting.addCD(stacks * training.getCDvalue());
        			counting.removeCounter(counting.getCounter());
        			
        		} else {
        		if (counting.getCounter() >= training.getCost()) {
        			counting.addCD(training.getCDvalue());
        			counting.removeCounter(training.getCost());
        		}}
        	}
        });
    }
}