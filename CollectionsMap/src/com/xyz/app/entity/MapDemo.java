package com.xyz.app.entity;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new Hashtable();
		
		map.put(1, "Java");
		map.put(2, "Spring");
		map.put(3, "AngulAR");
		map.put(1, "J2EE");
		
		//System.out.println(map);
		
		for (Map.Entry<Integer, String> entry : map.entrySet())
		{
			int key = entry.getKey();
			String value = entry.getValue();
			if(value.equalsIgnoreCase("angular"))
			{
				System.out.println(key+" = "+value);
			}
				
		}
		
		
	}
}













