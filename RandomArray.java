package tenArray;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomArray {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] array = new int[10];
		System.out.println("Enter the 10 numbers now.");
        for (int i = 0 ; i < array.length; i++ ) {
           array[i] = input.nextInt();
        }
        Random rand = new Random();
		
		for (int i = 0; i < array.length; i++) {
			int randomIndexToSwap = rand.nextInt(array.length);//random number from 0 to 9 including
			int change = array[randomIndexToSwap];
			array[randomIndexToSwap] = array[i];
			array[i] = change;
		}
        System.out.println(Arrays.toString(array));
        
	}
}
