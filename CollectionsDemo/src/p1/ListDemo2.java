package p1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Vector;


public class ListDemo2 {

	
	public List<Integer> getList()
	{
		List<Integer> list = new LinkedList();
		list.add(45);
		list.add(145);
		list.add(455);
		list.add(425);
	
		return list;
	}
	
	public HashSet<Integer> getSet()
	{
		HashSet<Integer> set = new HashSet<>();
		set.add(45);
		set.add(145);
		set.add(455);
		set.add(425);
	
		return set;
	}
	
	
	public void print(Collection<Integer> col)
	{
		
		Iterator<Integer> itr = col.iterator();
		
		while(itr.hasNext())
		{
			int y = itr.next();
				
			System.out.println(y);
		}
	}
	
	public static void main(String[] args) {
		
		ListDemo2 obj = new ListDemo2();
		
		List<Integer> list = obj.getList();
		obj.print(list);
		
		
		System.out.println("----------------------------");
		HashSet<Integer> set = obj.getSet();
		obj.print(set);
		
		
		System.out.println("----------------------------");
		for (Integer in : set) {
			System.out.println(in);
		}
		
	}
}
















