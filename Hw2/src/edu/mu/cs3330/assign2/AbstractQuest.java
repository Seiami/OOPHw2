package edu.mu.cs3330.assign2;

public abstract class AbstractQuest implements Quest{
	protected String title;
	protected int basePoints;
	protected final int id;
	protected boolean completed;
	private static int idGenerator;
	
	protected AbstractQuest(String title, int basePoints) {
		throw new IllegalArgumentException("Error: unimplemented function.");
	}
	
	public int getID() {
		
	}
	
	public String getTitle() {
		
	}
	
	public int getBasePoints() {
		
	}
	
	public boolean isCompleted() {
		
	}	
	
	 abstract public int completeFor(Student s);
	
	@Override
	public String toString() {
		return "";
	}
}
