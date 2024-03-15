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
    
    Stats stats = new Stats();
    
    ShopItem training = new ShopItem(1,1,0,0);
    ShopItem vassall = new ShopItem(1,0,1,0);

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
        		if (counting.getCounter() >= training.getCost()) {
        			counting.addCD(training.getCDvalue());
        			counting.removeCounter(training.getCost());
        		}
        	}
        });
        
        
        Training.setBounds(10, 37, 89, 23);
        frame.getContentPane().add(Training);
        
        JPanel TrainingCost = new JPanel();
        TrainingCost.setBounds(109, 37, 79, 23);
        frame.getContentPane().add(TrainingCost);
        
        JPanel TrainingValue = new JPanel();
        TrainingValue.setBounds(198, 37, 67, 23);
        frame.getContentPane().add(TrainingValue);
        
        JPanel VarsallCost = new JPanel();
        VarsallCost.setBounds(109, 82, 79, 23);
        frame.getContentPane().add(VarsallCost);
        
        JPanel VarsallValue = new JPanel();
        VarsallValue.setBounds(198, 82, 67, 23);
        frame.getContentPane().add(VarsallValue);
        
        JButton Varsall = new JButton("New button");
        Varsall.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        	}
        });
        Varsall.setBounds(10, 82, 89, 23);
        frame.getContentPane().add(Varsall);
    }
}