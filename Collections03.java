package com.Collections;

import java.util.ArrayList;
import java.util.Collection;

public class Collections03 {

	public static void main(String[] args) {
		
		Collection<String> fruits = new ArrayList<>();
		fruits.add("Orange");
		fruits.add("Grapes");
		fruits.add("Apple");
		fruits.add("Banana");
		
		for(String f: fruits) {
			System.out.println(fruits.add("Banana"));
			System.out.print(f+"  ");
		}
	}

}
