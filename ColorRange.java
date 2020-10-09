package colorRange;
import java.util.Scanner;

public class ColorRange {
	public static void main(String[] args) {
		 
		//Set scanner to get user input
		Scanner scanner1 = new Scanner(System.in);
		//Ask for wavelwength
		System.out.println("Enter a color code:");
		//Assigns a value to colorcode variable
		double colorcode = scanner1.nextDouble();
		String colorIs = "Color is ";
		 
		if(colorcode>=380 && colorcode<450)
		//here we used shorthand += operator to concatenate string
		// OR you can use a simple method like msg = msg + "Violet"; also
		colorIs += "Violet";
		else if(colorcode>=450 && colorcode<495)
		colorIs += "Blue";
		else if(colorcode>=495 && colorcode<570)
		colorIs += "Green";
		else if(colorcode>=570 && colorcode<590)
		colorIs += "Yellow";
		else if(colorcode>=590 && colorcode<620)
		colorIs += "Orange";
		else if(colorcode>=620 && colorcode<750)
		   colorIs += "Red";
		else
		// If no conditions meet criteria then show this msg
		   colorIs = "The entered wavelength is not a part of the visible spectrum";
		 
		//print message
		System.out.println(colorIs);
		}
}
