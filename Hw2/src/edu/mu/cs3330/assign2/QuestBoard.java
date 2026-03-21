package edu.mu.cs3330.assign2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class QuestBoard {
	private Map<Integer, Quest> questsById;
	private Map<Student, List<Quest>> assignments;
	
	/*
	 * Function to add a quest to the quest board.
	 * Rejects duplicate quest IDs by throwing exception.
	 * Takes a quest to be added and returns nothing.
	 */
	public void addQuest(Quest q) {
		int id = q.getID();
		// Check for duplicate IDs
		if (questsById.containsKey(id)) {
			throw new IllegalArgumentException("Attempted to add already included quest.");
		}
		questsById.put(id, q);
		
		return;
	}
	
	/*
	 * Function to find a quest given its ID.
	 * Returns the quest or null if it does not exist on the board.
	 */
	public Quest findQuest(int id) {
		if (questsById.containsKey(id)) {
			return questsById.get(id);
		}
		return null;
	}
	
	/*
	 * Function to a assign a quest to a student.
	 * Takes an existing student and the ID of the quest to be assigned.
	 * The same quest CANNOT be assigned multiple times to the same student.
	 */
	public void assignQuest(Student s, int questID) {
		Quest q = findQuest(questID);
		// Ensure quest is in list
		if (q == null) {
			throw new IllegalArgumentException("Attempted to assign unregistered quest ID.");
		}
		
		// Check if student is in assignments
		if (!assignments.containsKey(s)) {
			assignments.put(s, new ArrayList<Quest>());
			assignments.get(s).add(q);
			return;
		}
		// Check if student has already been assigned this quest
		if (assignments.get(s).contains(q)) {
			throw new IllegalArgumentException("Student has already been assigned this quest.");
		}
		else {
			assignments.get(s).add(q);
		}
		
		return;
	}
	
	/*
	 * Function to complete a quest given its ID and the student it is assigned to.
	 * Finds the quest among the student's assignments and calls Quest's completeFor()
	 * Returns the awarded points (integer).
	 */
	public int completeQuest(Student s, int questID) {
		// Check if student is registered
		if (!assignments.containsKey(s)) {
			throw new IllegalArgumentException("Tried to complete quest, but student is not registered with any quests on the board.");
		}
		Quest q = findQuest(questID);
		// Check if quest is assigned
		if (!assignments.get(s).contains(q)) { 
			throw new IllegalArgumentException("Tried to complete quest for student, but student is not assigned the quest.");
		}
		return q.completeFor(s);
	}
	
	/*
	 * Function to print all quests on the quest board.
	 */
	public void printAllQuests() {
		for (Map.Entry<Integer, Quest> entry : questsById.entrySet()) {
			entry.getValue().toString(); // Print Quest
		}
		return;
	}
	
	/*
	 * Function to print all assignments of a given student.
	 * Takes a student s.
	 */
	public void printAssignmentsFor(Student s) {
		if (assignments.containsKey(s)) {
			System.out.println(s.getName() + "'s Quests:");
			List<Quest> list = assignments.get(s);
			for (Quest q : list) {
				q.toString();
			}
		}
		return;
	}
}
