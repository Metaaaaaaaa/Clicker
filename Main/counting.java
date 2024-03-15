package Main;

public class counting {

	private static double counter;
	private static double CD;
	private static double DPS;
	private static double buffs;
	
	public counting(){
		counter = 0;
		CD = 1;
		DPS = 0;
	}
	/**/
	
	public static double getCounter() {
		return counter;
	}
	public static void addCounter(double clicks) {
		counter += clicks;
	}
	public static double getCD() {
		return CD;
	}
	public static void addCD(double CDIncrease) {
		CD += CDIncrease;
	}
	public static double getDPS() {
		return DPS;
	}
	public static void addDPS(double DPSIncrease) {
		DPS += DPSIncrease;
	}
	
	
}
