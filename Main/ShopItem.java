package Main;

public class ShopItem {
	private static double cost;
	private static double DPSvalue;
	private static double buyBuffs;
	private static double buyThreshole;
	private static String type;
	private static double CDvalue;
	
	public ShopItem(double cost, double DPSvalue, double CDvalue, double buyThreshole){
		ShopItem.cost = cost;
		ShopItem.DPSvalue = DPSvalue;
		ShopItem.CDvalue = CDvalue;
		ShopItem.buyThreshole = buyThreshole;
	}

	public static double getCost() {
		return cost;
	}

	public static void setCost(double cost) {
		ShopItem.cost = cost;
	}

	public static double getDPSvalue() {
		return DPSvalue;
	}

	public static void setDPSvalue(double dPSvalue) {
		DPSvalue = dPSvalue;
	}

	public static double getBuyBuffs() {
		return buyBuffs;
	}

	public static void setBuyBuffs(double buyBuffs) {
		ShopItem.buyBuffs = buyBuffs;
	}

	public static double getBuyThreshole() {
		return buyThreshole;
	}

	public static void setBuyThreshole(double buyThreshole) {
		ShopItem.buyThreshole = buyThreshole;
	}

	public static String getType() {
		return type;
	}

	public static void setType(String type) {
		ShopItem.type = type;
	}

	public static double getCDvalue() {
		return CDvalue;
	}

	public static void setCDvalue(double cDvalue) {
		CDvalue = cDvalue;
	}
	
	

		
}
