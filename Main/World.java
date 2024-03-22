package Main;

public class World {
	private int nextStage;
	private int peakStage;
	private int maxStage;
	private int drops;
	private double difficulty;
	
    enemy enemy = new enemy();
    Inventory inventory = new Inventory();
	
    public World(double difficulty){
		this.difficulty =  difficulty;

	}
    public double getDifficulty() {
		return difficulty;
	}

	public int getNextStage() {
		return this.nextStage;
	}

	public void setNextStage(int nextStage) {
		this.nextStage += nextStage;
	}
	
	

	public int getPeakStage() {
		return peakStage;
	}

	public void setPeakStage(int peakStage) {
		this.peakStage += peakStage;
	}

	public int getMaxStage() {
		return this.maxStage = 10 + enemy.getTier();
	}


	public int getDrops() {
		return drops;
	}

	public void setDrops(int drops) {
		this.drops = drops;
	}
	public void progression() {
		if (this.getPeakStage() < enemy.getLevel()) {
			this.setNextStage(1);
			inventory.addResource("wood", 1);
			
		}
		
		if (this.getNextStage() == this.getMaxStage()) {
			enemy.setLevel(1);
			this.setNextStage( -this.getMaxStage());
			this.setPeakStage(1);
			
			
		}
		
	}
    
    

}
