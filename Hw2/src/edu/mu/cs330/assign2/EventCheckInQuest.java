package edu.mu.cs330.assign2;

public class EventCheckInQuest extends AbstractQuest {
	String eventName;
	
	public EventCheckInQuest(String eventName, String title, int basePoints) {
		super(title, basePoints);
		if(eventName == null || eventName == "") {
			throw new IllegalArgumentException("Parameter 'eventName' must not be blank or null.");
		}
		this.eventName = eventName;
	}
	
	public int completeFor(Student s) {
		// this quest cannot be completed twice, but does not throw error when called twice
		if(!this.completed) {
			this.completed = true;
			s.addPoints(this.basePoints);
			return this.basePoints;
		}
		return 0;
	}
}