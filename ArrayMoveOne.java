package arrayChangeOnePosition;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMoveOne {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] array = new int[10];
		System.out.println("Enter the 10 numbers now.");
        for (int i = 0 ; i < array.length; i++ ) {
           array[i] = input.nextInt();
        }
        for (int i = 0 ; i < 1; i++ ) {
        	int last = array[9];
        	for(int j = array.length - 1; j > 0; j--){    
                //Shift element of array by one    
        		array[j] = array[j-1];  
        		//System.out.println(Arrays.toString(array));
            }    
            //Last element of array will be added to the start of array.    
        	array[0] = last;    
        }    
          
        System.out.println(Arrays.toString(array));
	}    
}
