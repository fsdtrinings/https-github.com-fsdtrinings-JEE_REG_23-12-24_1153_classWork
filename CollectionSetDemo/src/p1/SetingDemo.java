package p1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetingDemo {

	
	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<>(); // 
		
		set.add(12);
		set.add(612);
		set.add(102);
		set.add(125);
		
		System.out.println(set.size());
		for (Integer x : set) {
			System.out.println(x);
		}
		
	}
}
