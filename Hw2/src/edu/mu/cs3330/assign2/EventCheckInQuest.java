package edu.mu.cs3330.assign2;

public class EventCheckInQuest extends AbstractQuest {
	String eventName;
	
	public EventCheckInQuest(String eventName, String title, int basePoints, int id) {
		super(title, basePoints, id);
		if(eventName == null || eventName == "") {
			throw new IllegalArgumentException("Parameter 'eventName' must not be blank or null.");
		}
		this.eventName = eventName;
	}
	
	public int completeFor(Student s) {
		// this quest cannot be completed twice; throw exception when called twice
		if(this.completed) {
			throw new IllegalStateException("Cannot complete a quest twice!");
		}
		this.completed = true;
		s.addPoints(this.basePoints);
		return this.basePoints;
	}
}