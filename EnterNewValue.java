package arayEnterValue;

import java.util.Arrays;
import java.util.Scanner;

public class EnterNewValue {

	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
	
			int[] array ={ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	        
			int position = 0;
			System.out.println("On what position do you want to enter a number?");
			position = input.nextInt();
			
			int number = 0;
			System.out.println("What number do you want to enter?");
			number = input.nextInt();
			
			for(int j = array.length - 1; j > position - 1; j--){     
		        		array[j] = array[j-1];  
		        		System.out.println(Arrays.toString(array));
		            }         
	        array[position] = array[position - 1];
			array[position - 1] = number;
			
	        System.out.println(Arrays.toString(array));
	}
}
