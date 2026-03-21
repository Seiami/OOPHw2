package edu.mu.cs3330.assign2;

public class VolunteerQuest extends AbstractQuest {
	int hours;
	
	public VolunteerQuest(int hours, String title, int basePoints, int id) {
		super(title, basePoints, id);
		if(hours <= 0) {
			throw new IllegalArgumentException("Parameter 'hours' must be positive.");
		}
		this.hours = hours;
	}
	
	
	
	public int completeFor(Student s) {
		if (this.completed) {
			throw new IllegalStateException("Cannot complete a quest twice!");
		}
		this.completed = true;
		s.addPoints(this.basePoints * this.hours);
		return this.basePoints * this.hours;
	}
}
