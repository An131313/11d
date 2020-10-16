package arrTest;

import java.util.Scanner;

public class ArrayTest {
	public static void main(String[] args) {
		final int NUMBER_STUDENTS = 3;
		final int NUMBER_QUESTIONS = 3;
		char[][] answers = new char[NUMBER_STUDENTS][NUMBER_QUESTIONS];
		char[] key = new char[NUMBER_QUESTIONS];
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < NUMBER_QUESTIONS; i++) {
			System.out.println ("Enter answer for question " + (i + 1));
			key[i] = sc.nextLine().charAt(0);
		}
		//read answers for each student
		for (int i = 0; i < NUMBER_STUDENTS; i++) {
			for (int j = 0; j < NUMBER_QUESTIONS; j++) {
				System.out.println("Enter answer for question " + ( j + 1) + " for student " + ( i + 1));
				answers[i][j] = sc.nextLine().charAt(0);
				}
			}
		//grade all answ
		for (int i = 0; i < NUMBER_STUDENTS; i++) {
			//grade each student
			int correctAnswers = 0;
			for (int j = 0; j < NUMBER_QUESTIONS; j++) {
				if (answers[i][j] == key[j]) {
					correctAnswers++;
				}
			}
				System.out.println("Student " + i + " has " + correctAnswers + " correct answers.");
		}
		
	}
}
