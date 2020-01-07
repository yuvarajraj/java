package com.java.org;

public class Array {
	public static void main(String[] args) {
		int a[] = new int[5];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		a[2]=100;
		System.out.println(a[2]);
		System.out.println(a.length);
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(i);
		}
		
		for (int k : a) {
			System.out.println(k);
		}
		
		System.out.println(a[0]);
		
		
		
		
		
	}

}
