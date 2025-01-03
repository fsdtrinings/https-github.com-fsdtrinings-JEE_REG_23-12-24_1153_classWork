
public class IfElseDemo
{
	public static void main(String args[])
	{
		String name = "Ramesh";
		String designation = "manager"; // should be entered by user
		String employeeType = "contractualEmployee";
		int basicSalary = 25000;        // have to enter through user
		int annualBasicSalary = 0;
		int netAnnualSalary = 0;
		int hra=0,da=0,ta = 0;
		int tax=0;
		int perDayCost = 5000;
		int extraDayCost=0;
		int totalWorkingDays = 24;
		int totalContractualPayment = 0;
		int netContractualPayment=0;

			

		if(employeeType.equals("regularEmployee"))
		{
			annualBasicSalary = basicSalary*12;

			hra = percentageAmount(annualBasicSalary,17);
			da = percentageAmount(annualBasicSalary,10);
			ta= percentageAmount(annualBasicSalary+da,5);

			netAnnualSalary = annualBasicSalary+hra+da+ta;
			
			tax = calculateTax(netAnnualSalary);
		}

		else if(employeeType.equals("contractualEmployee"))
		{
			if(totalWorkingDays>22)
			{
				int basicDays = 22;
				int extraDays = totalWorkingDays - basicDays;   // #1

				int payment1 = basicDays*perDayCost;
				extraDayCost = (int)(extraDays * (perDayCost*1.60));  // #2

				totalContractualPayment = payment1+extraDayCost;
				tax = percentageAmount(totalContractualPayment,10);
					
				netContractualPayment = totalContractualPayment - tax; //#3
			}
		}
		

		System.out.println("Employee Name \t"+name);
		System.out.println("Employee Type \t"+employeeType+" Designation : "+"");
		System.out.println("Total Working Days \t"+totalWorkingDays);
		System.out.println("Gross Payment \t"+totalContractualPayment);
		System.out.println("- TDS @10%  \t"+tax);
		System.out.print("\n---------------------------------------------");
		System.out.println("\nNet Payment \t"+netContractualPayment);
		System.out.print("\n---------------------------------------------");


	}//end main

	
	public static int percentageAmount(int amount , int percent)
	{
		return (int)(amount*percent)/100;
	}
	
	public static int calculateTax(int amount)
	{
		int tax = 0;
		if(amount<250000)
		{
			tax = 0;
		}
		else if(amount > 250000 && amount<=700000)
		{
			tax = (int)(amount*0.10);
		}
		else if(amount > 700000 && amount<=1200000)
		{
			tax = (int)(amount*0.20);
		}
		else
		{
			tax = (int)(amount*0.30);

		}

		return tax;

	}





}//end class