package p1.process;

import p1.Booking;
import p1.Customer;
import p1.DeliveryPartner;

public class FoodApp {

	public static void main(String[] args) {
		
		FoodApp app = new FoodApp();
		
		Customer c ;
		
		c = app.getLoginCustomerInfo();
		c.setB(app.getBookingInfoFromCart());
		
		// after booking status : statusChange
		
		c.getB().setDp(app.allocateDeliveryPartner());
		
		
		///-----------------------------------------
		long phone = c.getB().getDp().getContactNumber();
		System.out.println("Phone "+phone);
		
		int newTipAmount = 50;
		DeliveryPartner dp = c.getB().getDp();
		int totalvalue = dp.getTotalTip();
		int newValue = totalvalue+newTipAmount;
		dp.setTotalTip(newValue);
		
		System.out.println("Total Tip Earned "+dp.getTotalTip());
		
	}
	
	public DeliveryPartner allocateDeliveryPartner()
	{
		DeliveryPartner dp = new DeliveryPartner();
		dp.setDpName("Suresh");
		dp.setContactNumber(147852369);
		dp.setTotalTip(1000);
		
		return dp;
		
	
	}
	
	public Booking getBookingInfoFromCart()
	{
		
		// ---- 
		
		return new Booking("Pizza",500,"7 jan 2025");
	}
	
	public Customer getLoginCustomerInfo()
	{
		// code to get login info
		
		return new Customer("Ramesh","Banglore"); // coming from Login/ front end
		
	}
}
