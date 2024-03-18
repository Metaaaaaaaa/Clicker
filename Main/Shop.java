package Main;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Shop {
	/**/
    JFrame frame;
    boolean maxBuy = false;
    
    Stats stats = new Stats();
    
    ShopItem training = new ShopItem(1,0,1,0);
    ShopItem varsall = new ShopItem(1,1,0,0);

    public Shop() {
        initialize();
    }
    
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(0, 0, stats.sW / 4  , stats.sH - 40);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
        frame.getContentPane().setLayout(null);
        
        JButton Training = new JButton("Trainings");
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
        
        
        Training.setBounds(10, 63, 89, 23);
        frame.getContentPane().add(Training);
        
        JPanel TrainingCost = new JPanel();
        TrainingCost.setBounds(109, 63, 79, 23);
        frame.getContentPane().add(TrainingCost);
        
        JPanel TrainingValue = new JPanel();
        TrainingValue.setBounds(198, 63, 67, 23);
        frame.getContentPane().add(TrainingValue);
        
        JPanel VarsallCost = new JPanel();
        VarsallCost.setBounds(109, 97, 79, 23);
        frame.getContentPane().add(VarsallCost);
        
        JPanel VarsallValue = new JPanel();
        VarsallValue.setBounds(198, 97, 67, 23);
        frame.getContentPane().add(VarsallValue);
        
        JButton Varsall = new JButton("Varsall");
        Varsall.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		varsall.buyProgress(maxBuy);
        		
        	}
        });
        Varsall.setBounds(10, 97, 89, 23);
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
        maxBuyButton.setBounds(384, 11, 89, 23);
        frame.getContentPane().add(maxBuyButton);
    }
}