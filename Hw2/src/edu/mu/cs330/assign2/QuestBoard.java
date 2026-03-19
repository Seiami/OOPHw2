package edu.mu.cs330.assign2;

import java.util.List;
import java.util.Map;

public class QuestBoard {
	private Map<Integer, Quest> questsById;
	private Map<Student, List<Quest>> assignments;
	
	// Need constructor?
//	public QuestBoard() {
//	
//	}
	
	/*
	 * Function to add a quest to the quest board.
	 * Rejects duplicate quest IDs by throwing exception.
	 * Takes a quest to be added and returns nothing.
	 */
	public void addQuest(Quest q) {
		// Return smth?
	}
	
	/*
	 * Function to find a quest given its ID.
	 * Returns the quest or NULL if it does not exist on the board.
	 */
	public Quest findQuest(int id) {
		
	}
	
	/*
	 * Function to a assign a quest to a student.
	 * Takes an existing student and the ID of the quest to be assigned.
	 * DECIDE!!! Can the same quest can be assigned multiple times to the same student?
	 */
	public void assignQuest(Student s, int questID) {
		// return smth?
	}
	
	/*
	 * Function to complete a quest given its ID and the student it is assigned to.
	 * Finds the quest among the student's assignments and calls Quest's completeFor()
	 * Returns the awarded points (integer).
	 */
	public int completeQuest(Student s, int questID) {
		
	}
	
	/*
	 * Function to print all quests on the questboard.
	 */
	public void printAllQuests() {
		
	}
	
	/*
	 * Function to print all assignments of a given student.
	 * Takes a student s.
	 */
	public void printAssignmentsFor(Student s) {
		
	}
}
