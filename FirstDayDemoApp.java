package p1;

public class FirstDayDemoApp {

	public static void main(String[] args) {
		
		int item1 = 50;
		int item2 = 60;
		int item3 = 0;

		int totalCost = item1+item2+item3;
		int discount = 0;
		int finalAmount;

		if( totalCost>100  && (item1>0 && item2>0 && item3>0))
		{

		    // write code to calculate discount
		   discount = (int) (totalCost * 0.10);  // becoz multiply by 0.10 give us float 
		   finalAmount = totalCost - discount;
		}
		else
		{
		   finalAmount = totalCost;
		}

		System.out.println("Total Cost "+totalCost);
		System.out.println("Discount "+discount);
		System.out.println("Final Amount "+finalAmount);
		
	}
}
