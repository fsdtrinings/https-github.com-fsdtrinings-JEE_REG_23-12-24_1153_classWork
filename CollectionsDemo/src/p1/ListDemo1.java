package p1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class Dog{}
public class ListDemo1 {

	public static void main(String[] args) {
		
		Collection list = new ArrayList();
		list.add("Hello");
		list.add(45);
		list.add(new NullPointerException());
		list.add(new Dog());
		list.add(9);
		
		
		System.out.println(list);
		
		for (Object object : list) {
			
			if(object instanceof Integer)
			{
				Integer x = (Integer)object;
				int y = x+x;
				System.out.println(y);
			}
			
		}
		
	}
}
