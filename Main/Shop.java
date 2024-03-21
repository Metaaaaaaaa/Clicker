package Main;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.Timer;

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
    ShopItem training = new ShopItem	(5 ,1 , 1, 2, 1.2);
    ShopItem varsall = new ShopItem		(5 ,0 , 50, 2, 2);
    ShopItem rhino = new ShopItem		(25 ,0 ,250, 2, 2);
    ShopItem wukong = new ShopItem		(89 ,0 , 1000, 2, 2);
    ShopItem harrow = new ShopItem		(450 ,0 , 5000, 2, 2);
    ShopItem nekros = new ShopItem		(950 ,0 , 10000, 2, 2);
    ShopItem gauss = new ShopItem		(4100 ,0 , 50000, 2, 2);
    ShopItem hildryn = new ShopItem		(9750 ,0 , 100000, 2, 2);
    ShopItem khora = new ShopItem		(39000 ,0 , 500000, 2, 2);
    ShopItem chroma = new ShopItem		(39000 ,0 , 500000, 2, 2);
    ShopItem sevagoth = new ShopItem	(89000 ,0 , 1000000, 2, 2);
    ShopItem mirage = new ShopItem		(380000 ,0 , 5000000, 2, 2);
    ShopItem saryn = new ShopItem		(870000 ,0 , 10000000, 2, 2);
    ShopItem wisp = new ShopItem		(3640000 ,0 , 50000000, 2, 2);
    ShopItem mesa = new ShopItem		(8650000 ,0 , 100000000, 2, 2);
    ShopItem voidrig = new ShopItem		(35000000 ,0 , 500000000, 2, 2);
    

    public Shop() {
        initialize();
    }
    
    public  String DTS(double text) { //Double to String
    	String newtext = Double.toString(Math.round(text));
		return newtext;
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
        btnTraining.setBounds(0, 0, 90, 50);
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
        
        JLabel VarsallValue = new JLabel("DPS: ");
        VarsallValue.setBounds(100, 26, 170, 24);
        panel_1.add(VarsallValue);

        JLabel VarsallBuyCount = new JLabel("Lv: 0");
        VarsallBuyCount.setBounds(100, 0, 170, 24);
        panel_1.add(VarsallBuyCount);
        
        VarsallBuyCount.setText(DTS(varsall.getbuyCount()));
        
        JLabel VarsallCost = new JLabel("New label");
        VarsallCost.setBounds(280, 0, 184, 50);
        panel_1.add(VarsallCost);
        
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
        		rhino.buyProgress(maxBuy);
        	}
        });
        btnRhino.setBounds(0, 0, 89, 50);
        panel_2.add(btnRhino);
        
        JLabel RhinoBuyCount = new JLabel("New label");
        RhinoBuyCount.setBounds(99, 0, 170, 24);
        panel_2.add(RhinoBuyCount);

        
        JLabel RhinoCost = new JLabel("New label");
        RhinoCost.setBounds(279, 0, 184, 50);
        panel_2.add(RhinoCost);
        
        JLabel RhinoValue = new JLabel("New label");
        RhinoValue.setBounds(99, 26, 170, 24);
        panel_2.add(RhinoValue);
        
        JPanel panel_3 = new JPanel();
        panel_3.setLayout(null);
        panel_3.setBounds(10, 219, 473, 50);
        frame.getContentPane().add(panel_3);
        
        JButton btnWukong = new JButton("Wukong");
        btnWukong.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		wukong.buyProgress(maxBuy);
        	}
        });
        btnWukong.setBounds(0, 0, 89, 50);
        panel_3.add(btnWukong);
        
        JLabel WukongBuyCount = new JLabel("New label");
        WukongBuyCount.setBounds(99, 0, 170, 24);
        panel_3.add(WukongBuyCount);
        
        JLabel WukongCost = new JLabel("New label");
        WukongCost.setBounds(279, 0, 184, 50);
        panel_3.add(WukongCost);
        
        JLabel WukongValue = new JLabel("New label");
        WukongValue.setBounds(99, 26, 170, 24);
        panel_3.add(WukongValue);
        
        JPanel panel_4 = new JPanel();
        panel_4.setLayout(null);
        panel_4.setBounds(10, 280, 473, 50);
        frame.getContentPane().add(panel_4);
        
        JButton btnHarrow = new JButton("Harrow");
        btnHarrow.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		harrow.buyProgress(maxBuy);
        	}
        });
        btnHarrow.setBounds(0, 0, 89, 50);
        panel_4.add(btnHarrow);
        
        JLabel HarrowBuyCount = new JLabel("New label");
        HarrowBuyCount.setBounds(99, 0, 170, 24);
        panel_4.add(HarrowBuyCount);
        
        JLabel HarrowCost = new JLabel("New label");
        HarrowCost.setBounds(279, 0, 184, 50);
        panel_4.add(HarrowCost);
        
        JLabel HarrowValue = new JLabel("New label");
        HarrowValue.setBounds(99, 26, 170, 24);
        panel_4.add(HarrowValue);
        
        JPanel panel_1_1_3 = new JPanel();
        panel_1_1_3.setLayout(null);
        panel_1_1_3.setBounds(10, 341, 473, 50);
        frame.getContentPane().add(panel_1_1_3);
        
        JButton btnNekros = new JButton("Nekros");
        btnNekros.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		nekros.buyProgress(maxBuy);
        	}
        });
        btnNekros.setBounds(0, 0, 89, 50);
        panel_1_1_3.add(btnNekros);
        
        JLabel NekrosBuyCount = new JLabel("New label");
        NekrosBuyCount.setBounds(99, 0, 170, 24);
        panel_1_1_3.add(NekrosBuyCount);
        
        JLabel NekrosCost = new JLabel("New label");
        NekrosCost.setBounds(279, 0, 184, 50);
        panel_1_1_3.add(NekrosCost);
        
        JLabel NekrosValue = new JLabel("New label");
        NekrosValue.setBounds(99, 26, 170, 24);
        panel_1_1_3.add(NekrosValue);
        
        JPanel panel_1_1_4 = new JPanel();
        panel_1_1_4.setLayout(null);
        panel_1_1_4.setBounds(10, 402, 473, 50);
        frame.getContentPane().add(panel_1_1_4);
        
        JButton btnGauss_1 = new JButton("Gauss");
        btnGauss_1.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		gauss.buyProgress(maxBuy);
        	}
        });
        btnGauss_1.setBounds(0, 0, 89, 50);
        panel_1_1_4.add(btnGauss_1);
        
        JLabel GaussBuyCount = new JLabel("New label");
        GaussBuyCount.setBounds(99, 0, 170, 24);
        panel_1_1_4.add(GaussBuyCount);
        
        JLabel GaussCost = new JLabel("New label");
        GaussCost.setBounds(279, 0, 184, 50);
        panel_1_1_4.add(GaussCost);
        
        JLabel GaussValue = new JLabel("New label");
        GaussValue.setBounds(99, 26, 170, 24);
        panel_1_1_4.add(GaussValue);
        
        JPanel panel_1_1_5 = new JPanel();
        panel_1_1_5.setLayout(null);
        panel_1_1_5.setBounds(10, 462, 473, 50);
        frame.getContentPane().add(panel_1_1_5);
        
        JButton btnHildryn = new JButton("Hildryn");
        btnHildryn.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		hildryn.buyProgress(maxBuy);
        	}
        });
        btnHildryn.setBounds(0, 0, 89, 50);
        panel_1_1_5.add(btnHildryn);
        
        JLabel HildrynBuyCount = new JLabel("New label");
        HildrynBuyCount.setBounds(99, 0, 170, 24);
        panel_1_1_5.add(HildrynBuyCount);
        
        JLabel HildrynCost = new JLabel("New label");
        HildrynCost.setBounds(279, 0, 184, 50);
        panel_1_1_5.add(HildrynCost);
        
        JLabel HildrynValue = new JLabel("New label");
        HildrynValue.setBounds(99, 26, 170, 24);
        panel_1_1_5.add(HildrynValue);
        
        JPanel panel_1_1_6 = new JPanel();
        panel_1_1_6.setLayout(null);
        panel_1_1_6.setBounds(10, 520, 473, 50);
        frame.getContentPane().add(panel_1_1_6);
        
        JButton btnKhora = new JButton("Khora");
        btnKhora.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		khora.buyProgress(maxBuy);
        	}
        });
        btnKhora.setBounds(0, 0, 89, 50);
        panel_1_1_6.add(btnKhora);
        
        JLabel KhoraBuyCount = new JLabel("New label");
        KhoraBuyCount.setBounds(99, 0, 170, 24);
        panel_1_1_6.add(KhoraBuyCount);
        
        JLabel KhoraCost = new JLabel("New label");
        KhoraCost.setBounds(279, 0, 184, 50);
        panel_1_1_6.add(KhoraCost);
        
        JLabel KhoraValue = new JLabel("New label");
        KhoraValue.setBounds(99, 26, 170, 24);
        panel_1_1_6.add(KhoraValue);
        
        JPanel panel_1_1_7 = new JPanel();
        panel_1_1_7.setLayout(null);
        panel_1_1_7.setBounds(10, 581, 473, 50);
        frame.getContentPane().add(panel_1_1_7);
        
        JButton btnChroma = new JButton("Chroma");
        btnChroma.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		chroma.buyProgress(maxBuy);
        	}
        });
        btnChroma.setBounds(0, 0, 89, 50);
        panel_1_1_7.add(btnChroma);
        
        JLabel ChromaBuyCount = new JLabel("New label");
        ChromaBuyCount.setBounds(99, 0, 170, 24);
        panel_1_1_7.add(ChromaBuyCount);
        
        JLabel ChromaCost = new JLabel("New label");
        ChromaCost.setBounds(279, 0, 184, 50);
        panel_1_1_7.add(ChromaCost);
        
        JLabel ChromaValue = new JLabel("New label");
        ChromaValue.setBounds(99, 26, 170, 24);
        panel_1_1_7.add(ChromaValue);
        
        JPanel panel_1_1_8 = new JPanel();
        panel_1_1_8.setLayout(null);
        panel_1_1_8.setBounds(10, 642, 473, 50);
        frame.getContentPane().add(panel_1_1_8);
        
        JButton btnSevagoth = new JButton("Sevagoth");
        btnSevagoth.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		
        		sevagoth.buyProgress(maxBuy);
        	}
        });
        btnSevagoth.setBounds(0, 0, 89, 50);
        panel_1_1_8.add(btnSevagoth);
        
        JLabel SevagothBuyCount = new JLabel("New label");
        SevagothBuyCount.setBounds(99, 0, 170, 24);
        panel_1_1_8.add(SevagothBuyCount);
        
        JLabel SevagothCost = new JLabel("New label");
        SevagothCost.setBounds(279, 0, 184, 50);
        panel_1_1_8.add(SevagothCost);
        
        JLabel SevagothValue = new JLabel("New label");
        SevagothValue.setBounds(99, 26, 170, 24);
        panel_1_1_8.add(SevagothValue);
        
        JPanel panel_1_1_9 = new JPanel();
        panel_1_1_9.setLayout(null);
        panel_1_1_9.setBounds(10, 703, 473, 50);
        frame.getContentPane().add(panel_1_1_9);
        
        JButton btnMirage = new JButton("Mirage");
        btnMirage.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		mirage.buyProgress(maxBuy);
        	}
        });
        btnMirage.setBounds(0, 0, 89, 50);
        panel_1_1_9.add(btnMirage);
        
        JLabel MirageBuyCount = new JLabel("New label");
        MirageBuyCount.setBounds(99, 0, 170, 24);
        panel_1_1_9.add(MirageBuyCount);
        
        JLabel MirageCost = new JLabel("New label");
        MirageCost.setBounds(279, 0, 184, 50);
        panel_1_1_9.add(MirageCost);
        
        JLabel MirageValue = new JLabel("New label");
        MirageValue.setBounds(99, 26, 170, 24);
        panel_1_1_9.add(MirageValue);
        
        JPanel panel_1_1_10 = new JPanel();
        panel_1_1_10.setLayout(null);
        panel_1_1_10.setBounds(10, 764, 473, 50);
        frame.getContentPane().add(panel_1_1_10);
        
        JButton btnSaryn = new JButton("Saryn");
        btnSaryn.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		saryn.buyProgress(maxBuy);
        	}
        });
        btnSaryn.setBounds(0, 0, 89, 50);
        panel_1_1_10.add(btnSaryn);
        
        JLabel SarynBuyCount = new JLabel("New label");
        SarynBuyCount.setBounds(99, 0, 170, 24);
        panel_1_1_10.add(SarynBuyCount);
        
        JLabel SarynCost = new JLabel("New label");
        SarynCost.setBounds(279, 0, 184, 50);
        panel_1_1_10.add(SarynCost);
        
        JLabel SarynValue = new JLabel("New label");
        SarynValue.setBounds(99, 26, 170, 24);
        panel_1_1_10.add(SarynValue);
        
        JPanel panel_1_1_11 = new JPanel();
        panel_1_1_11.setLayout(null);
        panel_1_1_11.setBounds(10, 825, 473, 50);
        frame.getContentPane().add(panel_1_1_11);
        
        JButton btnWisp = new JButton("Wisp");
        btnWisp.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		wisp.buyProgress(maxBuy);
        	}
        });
        btnWisp.setBounds(0, 0, 89, 50);
        panel_1_1_11.add(btnWisp);
        
        JLabel WispBuyCount = new JLabel("New label");
        WispBuyCount.setBounds(99, 0, 170, 24);
        panel_1_1_11.add(WispBuyCount);
        
        JLabel WispCost = new JLabel("New label");
        WispCost.setBounds(279, 0, 184, 50);
        panel_1_1_11.add(WispCost);
        
        JLabel WispValue = new JLabel("New label");
        WispValue.setBounds(99, 26, 170, 24);
        panel_1_1_11.add(WispValue);
        
        JPanel panel_1_1_12 = new JPanel();
        panel_1_1_12.setLayout(null);
        panel_1_1_12.setBounds(10, 886, 473, 50);
        frame.getContentPane().add(panel_1_1_12);
        
        JButton btnMesa = new JButton("Mesa");
        btnMesa.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		mesa.buyProgress(maxBuy);
        	}
        });
        btnMesa.setBounds(0, 0, 89, 50);
        panel_1_1_12.add(btnMesa);
        
        JLabel MesaBuyCount = new JLabel("New label");
        MesaBuyCount.setBounds(99, 0, 170, 24);
        panel_1_1_12.add(MesaBuyCount);
        
        JLabel MesaCost = new JLabel("New label");
        MesaCost.setBounds(279, 0, 184, 50);
        panel_1_1_12.add(MesaCost);
        
        JLabel MesaValue = new JLabel("New label");
        MesaValue.setBounds(99, 26, 170, 24);
        panel_1_1_12.add(MesaValue);
        
        JPanel panel_1_1_13 = new JPanel();
        panel_1_1_13.setLayout(null);
        panel_1_1_13.setBounds(10, 951, 473, 50);
        frame.getContentPane().add(panel_1_1_13);
        
        JButton btnVoidrig = new JButton("Voidrig");
        btnVoidrig.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		voidrig.buyProgress(maxBuy);
        	}
        });
        btnVoidrig.setBounds(0, 0, 89, 50);
        panel_1_1_13.add(btnVoidrig);
        
        JLabel VoidrigBuyCount = new JLabel("New label");
        VoidrigBuyCount.setBounds(99, 0, 170, 24);
        panel_1_1_13.add(VoidrigBuyCount);
        
        JLabel VoidrigCost = new JLabel("New label");
        VoidrigCost.setBounds(279, 0, 184, 50);
        panel_1_1_13.add(VoidrigCost);
        
        JLabel VoidrigValue = new JLabel("New label");
        VoidrigValue.setBounds(99, 26, 170, 24);
        panel_1_1_13.add(VoidrigValue);
        
        btnTraining.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		if (maxBuy) {
        			double stacks = counting.getCounter() / training.getcost();
        			counting.addCD(stacks * training.getCDvalue());
        			counting.removeCounter(counting.getCounter());
        			
        		} else {
        		if (counting.getCounter() >= training.getcost()) {
        			counting.addCD(training.getCDvalue());
        			counting.removeCounter(training.getcost());
        		}}
        	}
        });
        
        Timer timer = new Timer(200, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	VarsallBuyCount.setText(DTS(varsall.getbuyCount()));
            	VarsallValue.setText(DTS(varsall.getsumDPSvalue()));
            	VarsallCost.setText(DTS(varsall.getcost()));
            	
            	RhinoBuyCount.setText(DTS(rhino.getbuyCount()));
            	RhinoValue.setText(DTS(rhino.getsumDPSvalue()));
            	RhinoCost.setText(DTS(rhino.getcost()));
            	
            	WukongBuyCount.setText(DTS(wukong.getbuyCount()));
            	WukongValue.setText(DTS(wukong.getsumDPSvalue()));
            	WukongCost.setText(DTS(wukong.getcost()));
            	
            	HarrowBuyCount.setText(DTS(harrow.getbuyCount()));
            	HarrowValue.setText(DTS(harrow.getsumDPSvalue()));
            	HarrowCost.setText(DTS(harrow.getcost()));
            	
            	NekrosBuyCount.setText(DTS(nekros.getbuyCount()));
            	NekrosValue.setText(DTS(nekros.getsumDPSvalue()));
            	NekrosCost.setText(DTS(nekros.getcost()));
            	
            	GaussBuyCount.setText(DTS(gauss.getbuyCount()));
            	GaussValue.setText(DTS(gauss.getsumDPSvalue()));
            	GaussCost.setText(DTS(gauss.getcost()));
            	
            	HildrynBuyCount.setText(DTS(hildryn.getbuyCount()));
            	HildrynValue.setText(DTS(hildryn.getsumDPSvalue()));
            	HildrynCost.setText(DTS(hildryn.getcost()));
            	
            	KhoraBuyCount.setText(DTS(khora.getbuyCount()));
            	KhoraValue.setText(DTS(khora.getsumDPSvalue()));
            	KhoraCost.setText(DTS(khora.getcost()));
            	
            	ChromaBuyCount.setText(DTS(chroma.getbuyCount()));
            	ChromaValue.setText(DTS(chroma.getsumDPSvalue()));
            	ChromaCost.setText(DTS(chroma.getcost()));
            	
            	SevagothBuyCount.setText(DTS(sevagoth.getbuyCount()));
            	SevagothValue.setText(DTS(sevagoth.getsumDPSvalue()));
            	SevagothCost.setText(DTS(sevagoth.getcost()));
            	
            	MirageBuyCount.setText(DTS(mirage.getbuyCount()));
            	MirageValue.setText(DTS(mirage.getsumDPSvalue()));
            	MirageCost.setText(DTS(mirage.getcost()));
            	
            	SarynBuyCount.setText(DTS(saryn.getbuyCount()));
            	SarynValue.setText(DTS(saryn.getsumDPSvalue()));
            	SarynCost.setText(DTS(saryn.getcost()));
            	
            	WispBuyCount.setText(DTS(wisp.getbuyCount()));
            	WispValue.setText(DTS(wisp.getsumDPSvalue()));
            	WispCost.setText(DTS(wisp.getcost()));
            	
            	MesaBuyCount.setText(DTS(mesa.getbuyCount()));
            	MesaValue.setText(DTS(mesa.getsumDPSvalue()));
            	MesaCost.setText(DTS(mesa.getcost()));
            	
            	VoidrigBuyCount.setText(DTS(voidrig.getbuyCount()));
            	VoidrigValue.setText(DTS(voidrig.getsumDPSvalue()));
            	VoidrigCost.setText(DTS(voidrig.getcost()));
            	

            } 
        });
		timer.start(); 
    }
}