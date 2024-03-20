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
        
        JPanel panel = new JPanel();
        panel.setBounds(10, 34, 473, 50);
        frame.getContentPane().add(panel);
        panel.setLayout(null);
        
        JButton btnTraining = new JButton("Trainings");
        btnTraining.setBounds(0, 0, 86, 50);
        panel.add(btnTraining);
        
        JLabel TrainingBuyCount = new JLabel("Lv: 0");
        TrainingBuyCount.setBounds(100, 0, 170, 25);
        panel.add(TrainingBuyCount);
        
        JLabel TrainingCost = new JLabel("Cost: 0");
        TrainingCost.setBounds(283, 0, 180, 50);
        panel.add(TrainingCost);
        
        JLabel TrainingValue = new JLabel("CD: 0");
        TrainingValue.setBounds(100, 25, 170, 25);
        panel.add(TrainingValue);
        
        JPanel panel_1 = new JPanel();
        panel_1.setBounds(10, 97, 473, 50);
        frame.getContentPane().add(panel_1);
        panel_1.setLayout(null);
        
        JLabel VarsallValue = new JLabel("New label");
        VarsallValue.setBounds(100, 26, 170, 24);
        panel_1.add(VarsallValue);
        
        JLabel VarsallBuyCount = new JLabel("New label");
        VarsallBuyCount.setBounds(100, 0, 170, 24);
        panel_1.add(VarsallBuyCount);
        
        JLabel lblNewLabel_3_14 = new JLabel("New label");
        lblNewLabel_3_14.setBounds(280, 0, 184, 50);
        panel_1.add(lblNewLabel_3_14);
        
        JButton btnVarsall = new JButton("Varsall");
        btnVarsall.setBounds(0, 0, 89, 50);
        panel_1.add(btnVarsall);
        btnVarsall.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		varsall.buyProgress(maxBuy);
        		
        	}
        });
        
        JPanel panel_2 = new JPanel();
        panel_2.setLayout(null);
        panel_2.setBounds(10, 158, 473, 50);
        frame.getContentPane().add(panel_2);
        
        JButton btnRhino = new JButton("Rhino");
        btnRhino.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btnRhino.setBounds(0, 0, 89, 50);
        panel_2.add(btnRhino);
        
        JLabel RhinoBuyCount = new JLabel("New label");
        RhinoBuyCount.setBounds(99, 0, 170, 24);
        panel_2.add(RhinoBuyCount);
        
        JLabel lblNewLabel_3 = new JLabel("New label");
        lblNewLabel_3.setBounds(279, 0, 184, 50);
        panel_2.add(lblNewLabel_3);
        
        JLabel lblNewLabel_4 = new JLabel("New label");
        lblNewLabel_4.setBounds(99, 26, 170, 24);
        panel_2.add(lblNewLabel_4);
        
        JPanel panel_3 = new JPanel();
        panel_3.setLayout(null);
        panel_3.setBounds(10, 219, 473, 50);
        frame.getContentPane().add(panel_3);
        
        JButton btnWukong = new JButton("Wukong");
        btnWukong.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btnWukong.setBounds(0, 0, 89, 50);
        panel_3.add(btnWukong);
        
        JLabel WukongBuyCount = new JLabel("New label");
        WukongBuyCount.setBounds(99, 0, 170, 24);
        panel_3.add(WukongBuyCount);
        
        JLabel lblNewLabel_3_1 = new JLabel("New label");
        lblNewLabel_3_1.setBounds(279, 0, 184, 50);
        panel_3.add(lblNewLabel_3_1);
        
        JLabel lblNewLabel_4_1 = new JLabel("New label");
        lblNewLabel_4_1.setBounds(99, 26, 170, 24);
        panel_3.add(lblNewLabel_4_1);
        
        JPanel panel_1_1_2 = new JPanel();
        panel_1_1_2.setLayout(null);
        panel_1_1_2.setBounds(10, 280, 473, 50);
        frame.getContentPane().add(panel_1_1_2);
        
        JButton btnHarrow = new JButton("Harrow");
        btnHarrow.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btnHarrow.setBounds(0, 0, 89, 50);
        panel_1_1_2.add(btnHarrow);
        
        JLabel HarrowBuyCount = new JLabel("New label");
        HarrowBuyCount.setBounds(99, 0, 170, 24);
        panel_1_1_2.add(HarrowBuyCount);
        
        JLabel lblNewLabel_3_2 = new JLabel("New label");
        lblNewLabel_3_2.setBounds(279, 0, 184, 50);
        panel_1_1_2.add(lblNewLabel_3_2);
        
        JLabel lblNewLabel_4_2 = new JLabel("New label");
        lblNewLabel_4_2.setBounds(99, 26, 170, 24);
        panel_1_1_2.add(lblNewLabel_4_2);
        
        JPanel panel_1_1_3 = new JPanel();
        panel_1_1_3.setLayout(null);
        panel_1_1_3.setBounds(10, 341, 473, 50);
        frame.getContentPane().add(panel_1_1_3);
        
        JButton btnNekros = new JButton("Nekros");
        btnNekros.setBounds(0, 0, 89, 50);
        panel_1_1_3.add(btnNekros);
        
        JLabel NekrosBuyCount = new JLabel("New label");
        NekrosBuyCount.setBounds(99, 0, 170, 24);
        panel_1_1_3.add(NekrosBuyCount);
        
        JLabel lblNewLabel_3_3 = new JLabel("New label");
        lblNewLabel_3_3.setBounds(279, 0, 184, 50);
        panel_1_1_3.add(lblNewLabel_3_3);
        
        JLabel lblNewLabel_4_3 = new JLabel("New label");
        lblNewLabel_4_3.setBounds(99, 26, 170, 24);
        panel_1_1_3.add(lblNewLabel_4_3);
        
        JPanel panel_1_1_4 = new JPanel();
        panel_1_1_4.setLayout(null);
        panel_1_1_4.setBounds(10, 402, 473, 50);
        frame.getContentPane().add(panel_1_1_4);
        
        JButton btnGauss_1 = new JButton("Gauss");
        btnGauss_1.setBounds(0, 0, 89, 50);
        panel_1_1_4.add(btnGauss_1);
        
        JLabel GaussBuyCount = new JLabel("New label");
        GaussBuyCount.setBounds(99, 0, 170, 24);
        panel_1_1_4.add(GaussBuyCount);
        
        JLabel lblNewLabel_3_4 = new JLabel("New label");
        lblNewLabel_3_4.setBounds(279, 0, 184, 50);
        panel_1_1_4.add(lblNewLabel_3_4);
        
        JLabel lblNewLabel_4_4 = new JLabel("New label");
        lblNewLabel_4_4.setBounds(99, 26, 170, 24);
        panel_1_1_4.add(lblNewLabel_4_4);
        
        JPanel panel_1_1_5 = new JPanel();
        panel_1_1_5.setLayout(null);
        panel_1_1_5.setBounds(10, 462, 473, 50);
        frame.getContentPane().add(panel_1_1_5);
        
        JButton btnHildryn = new JButton("Hildryn");
        btnHildryn.setBounds(0, 0, 89, 50);
        panel_1_1_5.add(btnHildryn);
        
        JLabel HildrynBuyCount = new JLabel("New label");
        HildrynBuyCount.setBounds(99, 0, 170, 24);
        panel_1_1_5.add(HildrynBuyCount);
        
        JLabel lblNewLabel_3_5 = new JLabel("New label");
        lblNewLabel_3_5.setBounds(279, 0, 184, 50);
        panel_1_1_5.add(lblNewLabel_3_5);
        
        JLabel lblNewLabel_4_5 = new JLabel("New label");
        lblNewLabel_4_5.setBounds(99, 26, 170, 24);
        panel_1_1_5.add(lblNewLabel_4_5);
        
        JPanel panel_1_1_6 = new JPanel();
        panel_1_1_6.setLayout(null);
        panel_1_1_6.setBounds(10, 520, 473, 50);
        frame.getContentPane().add(panel_1_1_6);
        
        JButton btnKhora = new JButton("Khora");
        btnKhora.setBounds(0, 0, 89, 50);
        panel_1_1_6.add(btnKhora);
        
        JLabel KhoraBuyCount = new JLabel("New label");
        KhoraBuyCount.setBounds(99, 0, 170, 24);
        panel_1_1_6.add(KhoraBuyCount);
        
        JLabel lblNewLabel_3_6 = new JLabel("New label");
        lblNewLabel_3_6.setBounds(279, 0, 184, 50);
        panel_1_1_6.add(lblNewLabel_3_6);
        
        JLabel lblNewLabel_4_6 = new JLabel("New label");
        lblNewLabel_4_6.setBounds(99, 26, 170, 24);
        panel_1_1_6.add(lblNewLabel_4_6);
        
        JPanel panel_1_1_7 = new JPanel();
        panel_1_1_7.setLayout(null);
        panel_1_1_7.setBounds(10, 581, 473, 50);
        frame.getContentPane().add(panel_1_1_7);
        
        JButton btnChroma = new JButton("Chroma");
        btnChroma.setBounds(0, 0, 89, 50);
        panel_1_1_7.add(btnChroma);
        
        JLabel ChromaBuyCount = new JLabel("New label");
        ChromaBuyCount.setBounds(99, 0, 170, 24);
        panel_1_1_7.add(ChromaBuyCount);
        
        JLabel lblNewLabel_3_7 = new JLabel("New label");
        lblNewLabel_3_7.setBounds(279, 0, 184, 50);
        panel_1_1_7.add(lblNewLabel_3_7);
        
        JLabel lblNewLabel_4_7 = new JLabel("New label");
        lblNewLabel_4_7.setBounds(99, 26, 170, 24);
        panel_1_1_7.add(lblNewLabel_4_7);
        
        JPanel panel_1_1_8 = new JPanel();
        panel_1_1_8.setLayout(null);
        panel_1_1_8.setBounds(10, 642, 473, 50);
        frame.getContentPane().add(panel_1_1_8);
        
        JButton btnSevagoth = new JButton("Sevagoth");
        btnSevagoth.setBounds(0, 0, 89, 50);
        panel_1_1_8.add(btnSevagoth);
        
        JLabel SevagothBuyCount = new JLabel("New label");
        SevagothBuyCount.setBounds(99, 0, 170, 24);
        panel_1_1_8.add(SevagothBuyCount);
        
        JLabel lblNewLabel_3_8 = new JLabel("New label");
        lblNewLabel_3_8.setBounds(279, 0, 184, 50);
        panel_1_1_8.add(lblNewLabel_3_8);
        
        JLabel lblNewLabel_4_8 = new JLabel("New label");
        lblNewLabel_4_8.setBounds(99, 26, 170, 24);
        panel_1_1_8.add(lblNewLabel_4_8);
        
        JPanel panel_1_1_9 = new JPanel();
        panel_1_1_9.setLayout(null);
        panel_1_1_9.setBounds(10, 703, 473, 50);
        frame.getContentPane().add(panel_1_1_9);
        
        JButton btnMirage = new JButton("Mirage");
        btnMirage.setBounds(0, 0, 89, 50);
        panel_1_1_9.add(btnMirage);
        
        JLabel MirageBuyCount = new JLabel("New label");
        MirageBuyCount.setBounds(99, 0, 170, 24);
        panel_1_1_9.add(MirageBuyCount);
        
        JLabel lblNewLabel_3_9 = new JLabel("New label");
        lblNewLabel_3_9.setBounds(279, 0, 184, 50);
        panel_1_1_9.add(lblNewLabel_3_9);
        
        JLabel lblNewLabel_4_9 = new JLabel("New label");
        lblNewLabel_4_9.setBounds(99, 26, 170, 24);
        panel_1_1_9.add(lblNewLabel_4_9);
        
        JPanel panel_1_1_10 = new JPanel();
        panel_1_1_10.setLayout(null);
        panel_1_1_10.setBounds(10, 764, 473, 50);
        frame.getContentPane().add(panel_1_1_10);
        
        JButton btnGauss = new JButton("Saryn");
        btnGauss.setBounds(0, 0, 89, 50);
        panel_1_1_10.add(btnGauss);
        
        JLabel SarynBuyCount = new JLabel("New label");
        SarynBuyCount.setBounds(99, 0, 170, 24);
        panel_1_1_10.add(SarynBuyCount);
        
        JLabel lblNewLabel_3_10 = new JLabel("New label");
        lblNewLabel_3_10.setBounds(279, 0, 184, 50);
        panel_1_1_10.add(lblNewLabel_3_10);
        
        JLabel lblNewLabel_4_10 = new JLabel("New label");
        lblNewLabel_4_10.setBounds(99, 26, 170, 24);
        panel_1_1_10.add(lblNewLabel_4_10);
        
        JPanel panel_1_1_11 = new JPanel();
        panel_1_1_11.setLayout(null);
        panel_1_1_11.setBounds(10, 825, 473, 50);
        frame.getContentPane().add(panel_1_1_11);
        
        JButton btnWisp = new JButton("Wisp");
        btnWisp.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btnWisp.setBounds(0, 0, 89, 50);
        panel_1_1_11.add(btnWisp);
        
        JLabel WispBuyCount = new JLabel("New label");
        WispBuyCount.setBounds(99, 0, 170, 24);
        panel_1_1_11.add(WispBuyCount);
        
        JLabel lblNewLabel_3_11 = new JLabel("New label");
        lblNewLabel_3_11.setBounds(279, 0, 184, 50);
        panel_1_1_11.add(lblNewLabel_3_11);
        
        JLabel lblNewLabel_4_11 = new JLabel("New label");
        lblNewLabel_4_11.setBounds(99, 26, 170, 24);
        panel_1_1_11.add(lblNewLabel_4_11);
        
        JPanel panel_1_1_12 = new JPanel();
        panel_1_1_12.setLayout(null);
        panel_1_1_12.setBounds(10, 886, 473, 50);
        frame.getContentPane().add(panel_1_1_12);
        
        JButton MesaBuyCount = new JButton("Mesa");
        MesaBuyCount.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        MesaBuyCount.setBounds(0, 0, 89, 50);
        panel_1_1_12.add(MesaBuyCount);
        
        JLabel lblNewLabel_1_12 = new JLabel("New label");
        lblNewLabel_1_12.setBounds(99, 0, 170, 24);
        panel_1_1_12.add(lblNewLabel_1_12);
        
        JLabel lblNewLabel_3_12 = new JLabel("New label");
        lblNewLabel_3_12.setBounds(279, 0, 184, 50);
        panel_1_1_12.add(lblNewLabel_3_12);
        
        JLabel lblNewLabel_4_12 = new JLabel("New label");
        lblNewLabel_4_12.setBounds(99, 26, 170, 24);
        panel_1_1_12.add(lblNewLabel_4_12);
        
        JPanel panel_1_1_13 = new JPanel();
        panel_1_1_13.setLayout(null);
        panel_1_1_13.setBounds(10, 951, 473, 50);
        frame.getContentPane().add(panel_1_1_13);
        
        JButton btnOberon = new JButton("Voidrig");
        btnOberon.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btnOberon.setBounds(0, 0, 89, 50);
        panel_1_1_13.add(btnOberon);
        
        JLabel VoidrigBuyCount = new JLabel("New label");
        VoidrigBuyCount.setBounds(99, 0, 170, 24);
        panel_1_1_13.add(VoidrigBuyCount);
        
        JLabel lblNewLabel_3_13 = new JLabel("New label");
        lblNewLabel_3_13.setBounds(279, 0, 184, 50);
        panel_1_1_13.add(lblNewLabel_3_13);
        
        JLabel lblNewLabel_4_13 = new JLabel("New label");
        lblNewLabel_4_13.setBounds(99, 26, 170, 24);
        panel_1_1_13.add(lblNewLabel_4_13);
        btnTraining.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btnTraining.addMouseListener(new MouseAdapter() {
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