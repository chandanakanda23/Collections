package com.Collections;

public class Mobile implements Comparable<Mobile> {

	String model;
	String brand;
	double price;

	@Override
	public String toString() {
		return "Mobile [model=" + model + "," + " brand=" + brand + ", " + "price=" + price + "]";
	}

	public Mobile(String model, String brand, double d) {
		super();
		this.model = model;
		this.brand = brand;
		this.price = d;
	}

	@Override
	public int compareTo(Mobile o) {
		return this.brand.compareTo(o.brand);

	}
}
