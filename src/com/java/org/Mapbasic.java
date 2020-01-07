package com.java.org;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Mapbasic {
	public static void main(String[] args) {
		Map<Integer, String> mi=new HashMap<Integer, String>();
		mi.put(10, "ajay");
		mi.put(20, "bala");
		mi.put(30, "cat");
		mi.put(40, "dog");
		mi.put(50, "ele");
		mi.put(50, "fog");
		System.out.println(mi);
		
		String a = mi.get(30);
		System.out.println(a);
		
		Collection<String> values = mi.values();
		System.out.println(values);
		
		Set<Integer> keySet = mi.keySet();
		System.out.println(keySet);
		
		Set<Entry<Integer, String>> entrySet1 = mi.entrySet();
		for (Entry<Integer, String> entry1 : entrySet1) {
			System.out.println(entry1);
		}
		
		Set<Entry<Integer, String>> entrySet = mi.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry.getValue());
			System.out.println(entry.getKey());
		}
			
	}

}
