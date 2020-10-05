package pattern;

public class Pattern {
	public static void main(String[] args) {
		int numberOfLines = 7;
		for (int rows = numberOfLines; rows >= 1; rows--){
		    	for (int spaces = numberOfLines; spaces > rows; spaces--){
		    		System.out.print(" ");
		    	}
		    		for (int stars = 1; stars <= rows ; stars++){
		    			System.out.print("*");
		    		}
		   System.out.println("");
		}	  
	}
}

