package Main;

import javax.swing.JFrame;

public class Shop {
	/**/
    JFrame frame;
    
    Stats stats = new Stats();

    public Shop() {
        initialize();
    }

    /**
     * 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
     */
    
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(-10, 0, stats.sW / 4 , stats.sH - 40);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
        frame.getContentPane().setLayout(null);
    }
}