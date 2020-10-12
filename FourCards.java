package cards;

import java.util.Arrays;
import java.util.Random;

public class FourCards {
	public static void main(String[] args) {
		Random rand = new Random();
		
		int array[][] = new int[4][13];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				array[i][j]= j + 1;
			}
		}
		int fourArray[][] = new int[4][2];
		boolean loop = true;
		int nextCard = 0;
		
		int row = 0;
		int column = 0;
		boolean isNew = true;
		
		while (loop) {
			row = rand.nextInt(4);
			column = rand.nextInt(13);
			isNew = true;
			for(int i = 0; i < nextCard; i++) { 
				if (fourArray[i][0] == row && fourArray[i][1] == column) {
					isNew = false;
				} 
			}
			
			if (isNew) {
				fourArray[nextCard][0] = row;
				fourArray[nextCard][1] = column;
				nextCard += 1;
			}

			if(nextCard == 4) {
				loop = false;
			}
		}
	
		System.out.println(Arrays.deepToString(fourArray));
	}
}
