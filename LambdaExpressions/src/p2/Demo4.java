package p2;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface XYZ
{
	public List<Object> doStuff(int x,String name,boolean b);
	// only declaring the method body , no need to provide implementation 
	// that's why it is an abstract method 

}

public class Demo4 {
	
	public static void main(String[] args) {
		
		// temp body of doStuff()
		XYZ ref = (x,name,b)->{
			if(b!=true)
			{
				List<Object> list = new ArrayList<>();
				list.add(x);
				list.add(name);
				list.add(b);
				
				return list;
			}
			else return null;
			
		};
		
		// manually have to call doStuff
		List<Object> list = ref.doStuff(10,"Ramesh",true);
		
		for (Object obj : list) {
			System.out.println(obj);
		}
		
	}

}
