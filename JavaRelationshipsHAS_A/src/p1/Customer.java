package p1;

public class Customer {
	
	private String customerName;
	private String city;
	private Booking b;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Customer(String customerName, String city) {
		super();
		this.customerName = customerName;
		this.city = city;
	}



	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Booking getB() {
		return b;
	}

	public void setB(Booking b) {
		this.b = b;
	}
	
	

}
