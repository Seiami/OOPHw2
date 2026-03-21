package edu.mu.cs3330.assign2;

public class StreakQuest extends AbstractQuest {
	int days;
	int id;
	
	
	public StreakQuest(int days, String title, int basePoints, int id) {
		super(title, basePoints, id);
		if(days <= 0) {
			throw new IllegalArgumentException("Parameter 'days' must be positive.");
		}
		this.days = days;
	}
	
	public int completeFor(Student s) {
		// this quest cannot be completed twice; throw error when called twice
		if(this.completed) {
			throw new IllegalStateException("Cannot complete a quest twice!");
		}
		this.completed = true;
		s.addPoints(this.basePoints + (2 * this.days)); // Linear bonus
		return this.basePoints + (2 * this.days);
	}
}
