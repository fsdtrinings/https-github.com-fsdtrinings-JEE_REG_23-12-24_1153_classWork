package p1;

import java.util.Iterator;

public class StringDemo {

	public static void main(String[] args) {
		
		String carNumbers [] = {
				"KA123", "TN234","AP654","DL324534","MH3453","345KA535"
		};
		
		for (String carNumber : carNumbers) {
			
			String stateCode = carNumber.substring(0,2);
			System.out.println(stateCode);
			
			switch (stateCode) {
			case "KA":
				System.out.println("karnataka");
				break;
			case "TN":
				System.out.println("Tamil Naidu");
				break;
			case "AP":
				System.out.println("Andra");
				break;
			case "DL":
				System.out.println("Delhi");
				break;
				

			default:
				System.out.println("Not a valid car number");
				break;
			}
			
		}
		
		
		
	}
}
