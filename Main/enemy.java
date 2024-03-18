package Main;

import java.util.Random;

public class enemy {
	private static int level;
	private static int world;
	private static String type;
	private static double health;
	private static double maxHealth;
	private static double goldDrop;
	private static double drops;
	
	static Random random = new Random();
	
	public enemy() {
		level = 1;
		world = 1;
	}
	
	public static int getLevel() {
		return level;
	}
	public static void setLevel(int level) {
		enemy.level += level;
	}
	public static int getWorld() {
		return world;
	}
	public static void setWorld(int world) {
		enemy.world += world;
	}
	public static double getHealth() {
		return health;
	}
	public static void setHealt(double CD) {
		health -= CD;
		
	}
	public static double getMaxHealth() {
		return maxHealth;
	}
	public static void setMaxHealth() {
		
		double lv = level;
		
		maxHealth = 10 * Math.pow(lv, lv / 10 + 1);
		health = maxHealth;
	}
	public static double getGoldDrop() {
		setGoldDrop();
		int randomMultiplier = random.nextInt(2) + 1;
		goldDrop *= randomMultiplier;
		return goldDrop;
	}
	public static void setGoldDrop() {
		double lv = level;
		goldDrop = 1 * Math.pow(lv, lv / 10 + 1);
	}
	public static double getDrops() {
		return drops;
	}
	public static void setDrops(double drops) {
		enemy.drops = drops;
	}


}
