package Main;

import javax.swing.JFrame;

public class Shop {

    JFrame frame;

    /**
     */
    public Shop() {
        initialize();
    }

    /**
     * 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
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Schließe nur dieses Fenster
        frame.getContentPane().setLayout(null);
    }
}