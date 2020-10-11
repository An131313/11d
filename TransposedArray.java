package transposedArray;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class TransposedArray {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		int rows = rand.nextInt(5);
		int columns = rand.nextInt(5);
		
		int[][] array = new int[rows][columns];
		System.out.println(rows + ";" + columns);
		
        for (int i = 0 ; i < rows; i++ ) {
        	for (int j = 0 ; j < columns; j++ ) {
        		array[i][j] = rand.nextInt(25);
        	}
        }
		System.out.println(Arrays.deepToString(array));
		
        int transpArray[][] = new int[columns][rows];
        for (int i = 0 ; i < rows; i++ ) {
        	for (int j = 0 ; j < columns; j++ ) {
        		transpArray[j][i] = array[i][j];
        	}
        }
        System.out.println(Arrays.deepToString(transpArray));
	}
}