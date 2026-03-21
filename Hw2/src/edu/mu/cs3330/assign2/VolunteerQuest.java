package edu.mu.cs3330.assign2;

public class VolunteerQuest extends AbstractQuest {
	int hours;
	
	public VolunteerQuest(int hours, String title, int basePoints) {
		super(title, basePoints);
		if(hours <= 0) {
			throw new IllegalArgumentException("Parameter 'hours' must be positive.");
		}
		this.hours = hours;
	}
	
	
	
	public int completeFor(Student s) {
		// this quest can be completed twice
		this.completed = true;
		s.addPoints(this.basePoints * this.hours);
		return this.basePoints * this.hours;
	}
}
