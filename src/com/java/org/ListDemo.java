package com.java.org;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		List<Integer> li=new ArrayList<Integer>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		li.add(60);
		System.out.println(li);
		
//		int size = li.size();
//		System.out.println(size);
//		
//		Integer integer = li.get(2);
//		System.out.println(integer);
//		
//		for (int i = 0; i < li.size(); i++) {
//			System.out.println(li.get(i));
//			
//			
//			}
			
  for (Integer integer : li) {
	  System.out.println(integer);
	
}
		}
	}


