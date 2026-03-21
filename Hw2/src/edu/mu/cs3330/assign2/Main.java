package edu.mu.cs3330.assign2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		// Create students and store in HashSet
		Set<Student> students = new HashSet<>();
		
		Student charles = new Student("Charles");
		students.add(charles);
		Student raquel = new Student("Raquel");
		students.add(raquel);
		Student anyshya = new Student("Anyshya");
		students.add(anyshya);
		Student dupe = new Student("Charles");
		students.add(dupe);
		
		// Print items in Students HashSet
		System.out.println("\nAdded 4 students, one duplicate...\nSize of Hashset: " + students.size());
		for (Student s : students) {
			s.toString();
		}
		
		// Create quests
		System.out.println("\nCreating quests...");

		Quest hackathonCheckInQuest = new EventCheckInQuest("TigerHacks", "Check-in at TigerHacks", 10, 1);
		Quest lunchCheckInQuest = new EventCheckInQuest("Lunch with the Dean", "Check-in for Lunch", 50, 2);
		
		Quest tigerVolunteerQuest = new VolunteerQuest(36, "Volunteer at TigerHacks", 100, 3);
		Quest foodBankVolunteerQuest = new VolunteerQuest(5, "Volunteer at the Food Bank", 25, 4);
		
		Quest eatHealthyQuest = new StreakQuest(365, "Eat healthy", 100000, 5);
		Quest exerciseQuest = new StreakQuest(3, "Go to the gym", 250, 6);
		
		// Add quests to board
		System.out.println("\nAdding quests to Quest Board...\n");
		QuestBoard board = new QuestBoard();
		
		board.addQuest(hackathonCheckInQuest);
		board.addQuest(lunchCheckInQuest);
		board.addQuest(tigerVolunteerQuest);
		board.addQuest(foodBankVolunteerQuest);
		board.addQuest(eatHealthyQuest);
		board.addQuest(exerciseQuest);
		
		// Print all quests
		board.printAllQuests();
		
		// Assign quests to students
		System.out.println("\nAssigning Quests...\n");
		
		board.assignQuest(anyshya, 1);
		board.assignQuest(anyshya, 5);
		board.assignQuest(raquel, 3);
		board.assignQuest(raquel, 6);
		board.assignQuest(charles, 2);
		board.assignQuest(charles, 4);
		
		// Print all assignments
		for (Student s : students) {
			board.printAssignmentsFor(s);
		}
		
		// Complete quests
		System.out.println("\nCompleting quests...\n");

		board.completeQuest(raquel, 3);
		board.completeQuest(raquel, 6);
		board.completeQuest(charles, 2);
		board.completeQuest(charles, 4);
		board.completeQuest(anyshya, 1);

		// Reprint all assignments
		for (Student s : students) {
			board.printAssignmentsFor(s);
		}
		
		// Print final points
		System.out.println("\nFinal point totals:");
		for (Student s : students) {
			System.out.println(s.toString());
		}
		
		List<Student> studentList = new ArrayList<>();
		studentList.add(anyshya);
		studentList.add(raquel);
		studentList.add(charles);
		
		// Print total points across students using RewardUtils
		int sum = RewardUtil.sumPoints(studentList);
		System.out.println("\nSum of Student Points: " + sum);
		
		// Invalid action: duplicate quest ID
		Quest duplicate = new VolunteerQuest(1, "Volunteer", 10, 1);
		board.addQuest(duplicate);
	}

}
