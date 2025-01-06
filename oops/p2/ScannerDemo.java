package p2;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Scanner scStr = new Scanner(System.in);
		

		System.out.println("Enter Int");
		int x = sc.nextInt();
		System.out.println("int value x : " + x);

		System.out.println("Enter String : ");
		String name = scStr.nextLine();
		System.out.println("String :- " + name);

		System.out.println("Enter float : - ");
		float abc = sc.nextFloat();
		System.out.println("float value : - "+abc);
		

	}

}
