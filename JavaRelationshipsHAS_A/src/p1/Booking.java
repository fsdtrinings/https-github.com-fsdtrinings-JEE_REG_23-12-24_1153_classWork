package p1;

public class Booking {
	
	private String foodname;
	private int cost;
	private DeliveryPartner dp;
	private String date;// Localdate
	
	
	
	
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Booking(String foodname, int cost, String date) {
		super();
		this.foodname = foodname;
		this.cost = cost;
		this.date = date;
	}



	public String getFoodname() {
		return foodname;
	}
	public void setFoodname(String foodname) {
		this.foodname = foodname;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public DeliveryPartner getDp() {
		return dp;
	}
	public void setDp(DeliveryPartner dp) {
		this.dp = dp;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	

}
