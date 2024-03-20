package Main;

public class ShopItem {
	
	
	private  double DPSvalue;
	private  double CDvalue;
	
	private  double buyBuffs;
	private  double buyThreshole;
	private  double buyCount;
	
	private  double cost;
	private  double costBase;
	private  double costCurveY;
	private  double costCurveExponent;
	
	private  String type;
	
	enemy enemy = new enemy();
	
	public ShopItem(double DPSvalue, double CDvalue, double costBase, double costCurveY,double costCurveExponent){
		
		this.DPSvalue = DPSvalue;
		this.CDvalue = CDvalue;
		
		this.costBase = costBase;
		this.costCurveY = costCurveY;
		this.costCurveExponent = costCurveExponent;
		
	}

	public  double getCost() {
		this.cost = this.costBase + Math.pow(enemy.getLevel(), this.costCurveExponent) * this.costCurveY;
		
		return this.cost;
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
			this.buyCount += 1 * stacks;
			
		} else {
		if (counting.getCounter() >= this.getCost()) {
			counting.addDPS(this.getDPSvalue());
			counting.removeCounter(this.getCost());
			this.buyCount++;
		}}
	}}
	

		

