package edu.mu.cs3330.assign2;

public abstract class AbstractQuest implements Quest{
	protected String title;
	protected int basePoints;
	protected final int id;
	protected boolean completed;
	
	protected AbstractQuest(String title, int basePoints, int id) {
		if (id <= 0) {
			throw new IllegalArgumentException("QuestID must be greater than zero.");
		}
		this.id = id;
		
		if (title == "" || title == null) {
			throw new IllegalArgumentException("Quest title cannot be null or empty.");
		}
		this.title = title;
		
		if (basePoints <= 0) {
			throw new IllegalArgumentException("Base points must be greater than zero.");
		}
		this.basePoints = basePoints;
		this.completed = false;
		}
	
	public int getID() {
		return id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public int getBasePoints() {
		return basePoints;
	}
	
	public boolean isCompleted() {
		return completed;
	}	
	
	abstract public int completeFor(Student s);
	
	@Override
	public String toString() {
		String str = "";
		str = str + "Title: " + this.title + " -- ID: " + this.id + "\n\t Base Points: " 
				+ this.basePoints + "\n\t Complete Status: " + this.completed + "\n";
		return str;
	}
}
