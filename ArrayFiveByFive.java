package arrayFiveByFive;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayFiveByFive {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[][] array = new int[5][5];
		System.out.println("Enter numbers.");
        for (int i = 0 ; i < 5; i++ ) {
        	for (int j = 0 ; j < 5; j++ ) {
        		array[i][j] = input.nextInt();
        	}
        }
        int sum = 0;
        int max = 0; 
        int row = 0;
        for (int i = 0 ; i < 5; i++ ) {
        	sum = 0;	
        	for (int j = 0 ; j < 5; j++ ) {
        		sum += array[i][j];
        	} 
        	System.out.println(sum);
        	
        	if (max < sum){
        		max = sum;
        		row = i;
        	}
        }
        System.out.println(Arrays.deepToString(array));
        System.out.println(row);
	}    
}
