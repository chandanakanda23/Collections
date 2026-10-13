package com.Collections;

import java.util.ArrayList;
import java.util.Collection;

public class Collections01 {

	public static void main(String[] args) {

		Collection<Object> c1 = new ArrayList<>();

		c1.add(100);
		c1.add(200);
		c1.add("Chandana");

		System.out.println(c1);

		Collection<Object> c2 = new ArrayList<>();

		c2.add(300);
		c2.add(400);
		c2.add(500);

		System.out.println(c2);

		Collection<Object> c3 = new ArrayList<>();

		c3.addAll(c1);
		c3.addAll(c2);

		System.out.println(c3);
		
		c1.clear();
		
		System.out.println(c1.contains("Chandana"));
		
		System.out.println(c3.containsAll(c2));
	}

}
