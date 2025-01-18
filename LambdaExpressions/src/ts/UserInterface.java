package ts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@FunctionalInterface
interface EmployeeAudit {

	public ArrayList<String> fetchEmployeeDetails(double salary);
}

public class UserInterface {

	static Map<String, Double> empDetails = new HashMap<String, Double>();
	static List<String> strangeList = new ArrayList<>();
	
	public static void addEmployeeDetails(String empName,double salary)
	{
		empDetails.put(empName,salary); // adding emp in a map
	}
	
	
	public static EmployeeAudit findEmployee()
	{
		
		EmployeeAudit ea = (salaryAduitFilter)->{
			ArrayList<String> auditEmployees = new ArrayList<>(); // temporary variable 
			for (Map.Entry<String, Double> entry: empDetails.entrySet()) {
				
				String empName = entry.getKey();
				Double actualSalary = entry.getValue();
				
				if(actualSalary<=salaryAduitFilter) 
				{
					auditEmployees.add(empName);
				}
				
				
			}
			
			return auditEmployees;
		};
		return ea;
	}
	
	public static void main(String[] args) {
		
		addEmployeeDetails("A",5000);
		addEmployeeDetails("B",2000);
		addEmployeeDetails("C",7000);
		addEmployeeDetails("D",15000);
		addEmployeeDetails("E",6000);
		addEmployeeDetails("F",25000);
		addEmployeeDetails("G",12000);
		
		List<String> output = findEmployee().fetchEmployeeDetails(10000);
		
		for (String empName : output) {
			System.out.println(empName);
		}
		
	}

}//end main
