package com.java.org;

public class Stringbasic {
	public static void main(String[] args) {
		String s = "yuvaraj";
		System.out.println(s);

		// to print particular value
		char charAt = s.charAt(2);
		System.out.println(charAt);

		// to check given value equals true r false
		boolean equals = s.equals("yuvaraj");
		System.out.println(equals);

		// to split word or character
		String s1 = "yuvi";
		String[] split = s1.split("v");

		System.out.println(split.length);

		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
		}

		for (String string : split) {
			System.out.println(string);

		}

		char a = 'b';
		int x = a;
		System.out.println(x);
		String s2 = "h";
		int compareTo = s2.compareTo("t");

		System.out.println(compareTo);
		
		
		String r="hello world";
		int length = r.length();
				
		System.out.println(length);
//	for (int i = length-1; i >=0; i--) {
//			char st = r.charAt(i);
//			System.out.println(st);
			
			
			
		
			
			
			
			
			
			
			
			
			
			
		}
			
		

	}






















