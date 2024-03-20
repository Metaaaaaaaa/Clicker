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
	private static int tier;
	
	static Random random = new Random();
	
	public enemy() {
		level = 1;
		tier = 0;
	}
	
	public static int getLevel() {
		return level;
	}
	public static void setLevel(int level) {
		enemy.level += level;	
		if (enemy.level >= (1000 * tier) + 1000) {
			tier += 1;
			System.out.println(tier);
		}
		if (tier != 0) {
			if (enemy.level < 1000 * tier) {
				tier -= 1;
				System.out.println(tier);
			}
		}
	}
	
	public static int getTier() {
		return tier;
	}
	public static void setTier(int tier) {
		enemy.tier += tier;
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
	public static void setHealt(double dmg, String type) {  //damage calculation 
		//crit,critchance,armor,buffs,currenthealth,maxhealt,armor stripping,
	
		health -= dmg;
		
	}
	public static double getMaxHealth() {
		return maxHealth;
	}
	public static void setMaxHealth() {
		
		double lv = level;
		
		maxHealth = 0.5 * Math.pow(lv, 2.5) +9; //health scaling
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
		goldDrop = 0.7 * Math.pow(lv, 2.5) + 1; //gold scaling
	}
	public static double getDrops() {
		return drops;
	}
	public static void setDrops(double drops) {
		enemy.drops = drops;
	}


}
