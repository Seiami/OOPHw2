package edu.mu.cs330.assign2;

public class StreakQuest extends AbstractQuest {
	int days;
	
	public StreakQuest(int days, String title, int basePoints) {
		super(title, basePoints);
		if(days <= 0) {
			throw new IllegalArgumentException("Parameter 'days' must be positive.");
		}
		this.days = days;
	}
	
	public int completeFor(Student s) {
		// this quest cannot be completed twice, but does not throw error when called twice
		if(!this.completed) {
			this.completed = true;
			s.addPoints(this.basePoints + (2 * this.days));
			return this.basePoints + (2 * this.days);
		}
		return 0;
	}
}
