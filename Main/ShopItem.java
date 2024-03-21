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
	private  double sumDPSValue;
	private  double sumCDValue;
	
	private  String type;
	
	enemy enemy = new enemy();
	
	public ShopItem(double DPSvalue, double CDvalue, double costBase, double costCurveY,double costCurveExponent){
		
		this.DPSvalue = DPSvalue;
		this.CDvalue = CDvalue;
		
		this.costBase = costBase;
		this.costCurveY = costCurveY;
		this.costCurveExponent = costCurveExponent;
		this.buyCount = 0;
		this.sumDPSValue = 0;
		this.sumCDValue = this.CDvalue;
		
		
	}

	public  double getcost() {
		this.cost = this.costBase + Math.pow(this.getbuyCount(), this.costCurveExponent) * this.costCurveY;
		
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

	public  double getsumDPSvalue() {
		return this.sumDPSValue;
	}

	public  void setsumDPSvalue(double value) {
		this.sumDPSValue += value;
	}
	
	public  double getCDvalue() {
		return CDvalue;
	}

	public  void setCDvalue() {
		
	}
	
	public  double getsumCDvalue() {
		return CDvalue;
	}

	public  void setsumCDvalue(double value) {
		this.sumCDValue += value;
	}
	
	public  void setbuyCount(double count) {
		this.buyCount += count;
		
	}
	
	public double getbuyCount() {
		return buyCount;
	}
	
	public void buyProgress(boolean maxBuy) {
		if  (counting.getCounter() >= this.getcost()) {
		if (maxBuy) {
			double stacks = counting.getCounter() / this.getcost();
			counting.addDPS(stacks * this.getDPSvalue());
			this.setsumDPSvalue(stacks * this.getDPSvalue());
			counting.removeCounter(counting.getCounter());
			this.setbuyCount(1 * stacks);
			
		} else { 
			counting.addDPS(this.getDPSvalue());
			this.setsumDPSvalue(this.getDPSvalue());
			counting.removeCounter(this.getcost());
			this.setbuyCount(1);
		}}
	}}
	

		

