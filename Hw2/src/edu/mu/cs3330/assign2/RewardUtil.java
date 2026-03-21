package edu.mu.cs3330.assign2;

import java.util.List;

public class RewardUtil {
	/*
	 * Generic method to print each item in List items using toString()
	 */
	public static <T> void printAll(List<T> items) {
		for (T item : items) {
			item.toString();
		}
	}
	
	/*
	 * Wild card method to sum the points across list of students or student subclasses.
	 * Returns the sum of points.
	 */
	public static int sumPoints(List<? extends Student> students) {
		int sum = 0;
		for (Student s : students) {
			sum += s.getPoints();
		}
		return sum;
	}
}
