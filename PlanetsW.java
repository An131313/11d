package planets;
import java.util.Scanner;

public class PlanetsW {
	public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int earthWeight, planet;
        double planetWeight = 0.0;
        System.out.print("Please enter your current earth weight: ");
        earthWeight = keyboard.nextInt();
        System.out.println();
        System.out.println("1. Mercury   2. Venus   3. Mars    4. Jupiter 5. Saturn  6. Uranus  7. Neptune");
        System.out.println();
        System.out.print("On which planet would you like to find out your weight? ");
        planet = keyboard.nextInt();
        System.out.println();
        if (planet == 1) {
            planetWeight = earthWeight * 0.38;
        } else if (planet == 2) {
            planetWeight = earthWeight * 0.91;
        } else if (planet == 3) {
            planetWeight = earthWeight * 0.38;
        } else if (planet == 4) {
            planetWeight = earthWeight * 2.36;
        } else if (planet == 5) {
            planetWeight = earthWeight * 0.92;
        } else if (planet == 6) {
            planetWeight = earthWeight * 0.89;
        } else if (planet == 7) {
            planetWeight = earthWeight * 1.13;
        } else {
            System.out.println("Not a valid planet.");
        }
        System.out.println("Your weight would be " + planetWeight + " kg on that planet.");
    }
}
