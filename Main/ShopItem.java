package Main;

public class ShopItem {
	private  double cost;
	private  double DPSvalue;
	private  double buyBuffs;
	private  double buyThreshole;
	private  String type;
	private  double CDvalue;
	
	public ShopItem(double cost, double DPSvalue, double CDvalue, double buyThreshole){
		this.cost = cost;
		this.DPSvalue = DPSvalue;
		this.CDvalue = CDvalue;
		this.buyThreshole = buyThreshole;
	}

	public  double getCost() {
		return cost;
	}

	public  void setCost(double cost) {
		this.cost = cost;
	}

	

	public  double getBuyBuffs() {
		return buyBuffs;
	}

	public  void setBuyBuffs(double buyBuffs) {
		this.buyBuffs = buyBuffs;
	}

	public  double getBuyThreshole() {
		return buyThreshole;
	}

	public  void setBuyThreshole(double buyThreshole) {
		this.buyThreshole = buyThreshole;
	}

	public  String getType() {
		return type;
	}

	public  void setType(String type) {
		this.type = type;
	}
	
	public  double getDPSvalue() {
		return DPSvalue;
	}

	public  void setDPSvalue() {
	
	}

	public  double getCDvalue() {
		return CDvalue;
	}

	public  void setCDvalue() {
		
	}
	
	public void buyProgress(boolean maxBuy) {
		
		if (maxBuy) {
			double stacks = counting.getCounter() / this.getCost();
			counting.addDPS(stacks * this.getDPSvalue());
			counting.removeCounter(counting.getCounter());
			
		} else {
		if (counting.getCounter() >= this.getCost()) {
			counting.addDPS(this.getDPSvalue());
			counting.removeCounter(this.getCost());
		}}
	}}
	

		

