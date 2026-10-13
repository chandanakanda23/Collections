package com.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee> {

	private int id;
	private String name;
	private double salary;

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee e) {
		return Double.compare(this.salary, e.salary);
	}

	@Override
	public String toString() {
		return "ID: " + id + ", Name: " + name + ", Salary: " + salary;
	}
}

public class Sorting {

	public static void main(String[] args) {

		Employee e1 = new Employee(101, "Chandana", 50000);
		Employee e2 = new Employee(102, "Anjali", 30000);
		Employee e3 = new Employee(103, "Priya", 70000);
		Employee e4 = new Employee(104, "Sravani", 40000);

		List<Employee> employees = new ArrayList<>();

		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);

		System.out.println("Before Sorting:");

		for (Employee e : employees) {
			System.out.println(e);
		}

		Collections.sort(employees);

		System.out.println("After Sorting by Salary:");

		for (Employee e : employees) {
			System.out.println(e);
		}
	}
}