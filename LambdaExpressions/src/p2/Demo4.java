package p2;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface XYZ
{
	public List<Object> doStuff(int x,String name,boolean b);
		
}

public class Demo4 {
	
	public static void main(String[] args) {
		
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
		
	}

}
