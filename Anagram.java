package anagram;

import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input1 = sc.nextLine();
		String input2 = sc.nextLine();
		sc.close();
		
		boolean isAnAnagram = true;
		String copyInput2 = input2;
		int lengthInput1 = input1.length();
		
		for (int i = 0; i < lengthInput1; i++) {
			char charInInput1 = input1.charAt(i);
			if (charInInput1 >= 'a' && charInInput1 <= 'z'	 ||    charInInput1 >= 'A' && charInInput1 <= 'Z') {
				int positionInInput2 = copyInput2.indexOf(charInInput1);
				if (positionInInput2 == -1) {
					isAnAnagram = false;
					break;
				} else {
					copyInput2 = copyInput2.substring(0, positionInInput2) + copyInput2.substring(positionInInput2 + 1);
				}
			}
		}
		if (isAnAnagram) {
			int charsLeftInInput2 = copyInput2.length();
			
			for (int i = 0; i < charsLeftInInput2; i++) {
				char currentChar = copyInput2.charAt(i);
				if (currentChar >= 'a' && currentChar <= 'z'	 ||    currentChar >= 'A' && currentChar <= 'Z') {
					isAnAnagram = false;
					break;
				}
			}
		}
		
		System.out.println(isAnAnagram ? "is anagram" : "isn't an anagram");
	}
}
