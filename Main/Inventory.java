package Main;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.Timer;

import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class Inventory {

	JFrame frame;
	/**/
	Stats stats = new Stats();
	
	public Map<String, Integer> resources;
	
	
	
	

	public Inventory() {
		
			this.resources = new HashMap<>();
			initialize();
	    }
	
	    // Methode zum Hinzufügen einer bestimmten Anzahl von Ressourcen
	    public void addResource(String resource, int quantity) {
	        resources.put(resource, resources.getOrDefault(resource, 0) + quantity);
	    }
	
	    // Methode zum Entfernen einer bestimmten Anzahl von Ressourcen
	    public void removeResource(String resource, int quantity) {
	        int currentQuantity = resources.getOrDefault(resource, 0);
	        if (currentQuantity >= quantity) {
	            resources.put(resource, currentQuantity - quantity);
	        } else {
	            System.out.println("Not enough " + resource + " in inventory.");
	        }
	    }
	
	    // Methode zum Überprüfen, ob eine bestimmte Menge einer Ressource im Inventar vorhanden ist
	    public boolean hasEnoughResource(String resource, int quantity) {
	        return resources.getOrDefault(resource, 0) >= quantity;
	    }
	
	    // Methode zum Abrufen der Anzahl einer bestimmten Ressource im Inventar
	    public int getResourceQuantity(String resource) {
	        return resources.getOrDefault(resource, 0);
	    }
	
	    // Methode zum Anzeigen des gesamten Inventars
	    public void displayInventory() {
	        System.out.println("Inventory:");
	        for (Map.Entry<String, Integer> entry : resources.entrySet()) {
	            System.out.println(entry.getKey() + ": " + entry.getValue());
	        }
	    }
	    public String setText() {
	    	String labelText = "";
        	
    	    
            boolean flag = false;
            // Durchlaufen der Ressourcen und Hinzufügen von JLabels für jede Ressource
            for (Map.Entry<String, Integer> entry : resources.entrySet()) {
                labelText += entry.getKey();
                labelText += ": ";
                labelText += entry.getValue();
                flag = true;
            }
            if (flag == true) {
            
            
            // JLabel-Text aktualisieren
            labelText = "resources.entrySet()";
            
            
            System.out.println(labelText);
            
	    }return labelText;}
 
	
	public void initialize() {
		frame = new JFrame();
	    frame.setBounds(stats.sWU / 2 , 0, stats.sW / 4 , stats.sH - 40);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.getContentPane().setLayout(null);
	    
	    
	    
	    JLabel lblInventory = new JLabel("f");
	    lblInventory.setBounds(5, 5, 418, 412);
	    frame.getContentPane().add(lblInventory);
	    
	    
	    
	    Timer timer = new Timer(1000, new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	
	            lblInventory.setText("cc");
	            
	        
	            }
	    });
	    timer.start(); 
	    
	}
}
