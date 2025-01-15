package p2;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	
	public static void main(String[] args) {
		
		TreeSetDemo demo = new TreeSetDemo();
		
		TreeSet<Integer> set1 = new TreeSet<>();
		set1.add(45);
		set1.add(450);
		set1.add(5);
		set1.add(9);
		set1.add(88);
		demo.print(set1);
	
		TreeSet<String> set2 = new TreeSet<>();
		set2.add("tre");
		set2.add("ab tre");
		set2.add("aab tre");
		set2.add("aca tre");
		set2.add("abcp tre");
		set2.add("abbc tre");
		set2.add("abc tre");
		set2.add("abca tre");
		
		demo.print(set2);
	
	
	}
	
	public void print(Set<?> set)
	{
		System.out.println("-----------------");
		for (Object x: set) {

			System.out.println(x);
		}
	}
}
