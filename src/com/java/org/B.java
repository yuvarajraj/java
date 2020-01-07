package com.java.org;

import java.util.ArrayList;
import java.util.List;

public class B extends pojobase {
	public static void main(String[] args) {

		List<B> a = new ArrayList<B>();
		B a1 = new B();
		a1.setId(10);
		a1.setName("arub");
		a1.setEmial("uv");

		B a2 = new B();
		a2.setId(20);
		a2.setName("bon");
		a2.setEmial("ram");

		a.add(a1);
		a.add(a2);

		for (B b : a) {
			System.out.println(b.getId());

			System.out.println(b.getName());
			System.out.println(b.getEmial());

		}

	}

}
