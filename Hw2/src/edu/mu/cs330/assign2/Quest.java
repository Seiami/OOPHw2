package edu.mu.cs330.assign2;

public interface Quest {
	
	int getID();
	
	String getTitle();
	
	int getBasePoints();
	
	boolean isCompleted();
	
	/*
	 *	Must update the quest's completion state, award pts to student, and return number of pts awarded.
	*/
	int completeFor(Student s);
}
