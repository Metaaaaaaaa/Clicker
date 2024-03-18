package Main;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.Timer;
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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;

public class mainScreen {

	private JFrame frame;
	
    Shop shopWindow = new Shop();
    WorldSelection worldSelection = new WorldSelection();
    Stats stats = new Stats();
    Inventory inventory = new Inventory();
    counting counting = new counting();
    enemy enemy = new enemy();

	
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
        frame.setBounds(stats.sWU / 4 , 0, 501  , 540);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        shopWindow.frame.setVisible(true);
        stats.frame.setVisible(true);
        inventory.frame.setVisible(true);
        worldSelection.frame.setVisible(true);
        
        JButton Enemie = new JButton("Ellu");
        Enemie.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        Enemie.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		enemy.setHealt(counting.getCD());
        		
        	}
        });
        
        JLabel HPLabel = new JLabel("0 / 0");
        HPLabel.setHorizontalAlignment(SwingConstants.CENTER);
        HPLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        HPLabel.setBounds(117, 409, 240, 14);
        frame.getContentPane().add(HPLabel);
        Enemie.setBounds(185, 128, 89, 160);
        frame.getContentPane().add(Enemie);
        
        JButton levelDown = new JButton("-");
        levelDown.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		enemy.setLevel(-1);
        		
        	}
        });
        levelDown.setBounds(123, 24, 37, 23);
        frame.getContentPane().add(levelDown);
        
        JButton levelUp = new JButton("+");
        levelUp.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		enemy.setLevel(+1);
        		
        	}
        });
        levelUp.setBounds(302, 24, 41, 23);
        frame.getContentPane().add(levelUp);
        
        JPanel currentHP = new JPanel();
        currentHP.setBackground(new Color(0, 255, 0));
        currentHP.setBounds(117, 405, 240, 23);
        frame.getContentPane().add(currentHP);
        
        JPanel maxHP = new JPanel();
        maxHP.setBackground(new Color(255, 0, 0));
        maxHP.setBounds(117, 405, 240, 23);
        frame.getContentPane().add(maxHP);
        
        JLabel StageLabel = new JLabel("World: 0 Stage: 0");
        StageLabel.setHorizontalAlignment(SwingConstants.CENTER);
        StageLabel.setBounds(170, 24, 122, 23);
        frame.getContentPane().add(StageLabel);
        
        JButton worldDown = new JButton("--");
        worldDown.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
    			enemy.setLevel(-10);	
        	}
        });
        worldDown.setBounds(64, 24, 49, 23);
        frame.getContentPane().add(worldDown);
        
        JButton worldUp = new JButton("++");
        worldUp.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        			enemy.setLevel(+10);	
        	}
        });
        worldUp.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        worldUp.setBounds(353, 24, 49, 23);
        frame.getContentPane().add(worldUp);
        
        Timer timer = new Timer(17, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	int IntHealth = (int) enemy.getHealth();
            	double health = enemy.getHealth();
            	double maxhealth = enemy.getMaxHealth();
            	if (IntHealth <= 0) {
            		enemy.setMaxHealth();
            		counting.addCounter(enemy.getGoldDrop());
            	}
            	
            	
            	int healthbar = (int) (240 *  health / maxhealth);
            	
	
            	enemy.setHealt(counting.getDPS() / 30);
            	
            	HPLabel.setText(Double.toString(Math.round(health)) + "/" + Double.toString(Math.round(maxhealth))); 
            	StageLabel.setText("Stage: " + Integer.toString(enemy.getLevel()));
            	currentHP.setBounds(117, 405 ,healthbar, 23);
                
               
            } 
        });
        timer.start(); 
    }
    }

