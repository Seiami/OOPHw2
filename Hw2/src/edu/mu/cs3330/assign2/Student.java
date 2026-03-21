package edu.mu.cs3330.assign2;

import java.util.Objects;

//imports


public class Student {
	private String name; //not null or blank (should this be final?)
	private int points; //never negative
	
	//constructor
	public Student(String name) {
		if(name == "" || name == null) {
			throw new IllegalArgumentException("Parameter 'name' must not be blank or null.");
		}
		
		this.name = name;
		this.points = 0;
	}
	
	//getters
	public String getName() {
		return this.name;
	}
	
	public int getPoints() {
		return this.points;
	}
	
	//since fail fast was required it is assumed that amount cannot be negative
	public void addPoints(int amount) {
		if(amount<0) {
			throw new IllegalArgumentException("Paramereter 'amount' must be non-negative.");
		}
		
		this.points += amount;
	}

	@Override
	public String toString() {
		return "Student " + name + " has " + points + " points.";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null || obj.getClass() != this.getClass()) {
			return false;
		}
		
		Student s = (Student) obj;
		return (s.getName()==this.name);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
}