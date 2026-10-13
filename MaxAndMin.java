package com.Collections;

import java.util.ArrayList;
import java.util.Collections;

public class MaxAndMin {

	public static void main(String[] args) {

		ArrayList<Integer> a = new ArrayList<>();

		a.add(25);
		a.add(10);
		a.add(45);
		a.add(5);
		a.add(30);

		int max = Collections.max(a);

		int min = Collections.min(a);

		System.out.println("Max : " + max);
		System.out.println("Min : " + min);

	}

}
