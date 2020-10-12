package paint;

import java.util.Scanner;

public class RoomPaint {
	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		System.out.println("Enter width: ");
		double width = scann.nextDouble();
		System.out.println("Enter length: ");
		double length = scann.nextDouble();
		System.out.println("Enter height: ");
		double height = scann.nextDouble();
		
		int area = (int) Math.ceil(width * length + 2 * (width + length) * height);
		System.out.println("The area to be painted is " + area);
		
		int fiveLiterCoveredArea = 140;
		int oneLiterCoveredArea = 30;
		int fiveLiterBucketsNeeded = 0;
		int oneLiterBucketsNeeded = 0;
		
		fiveLiterBucketsNeeded += area / fiveLiterCoveredArea;
		int areaLeft = area % fiveLiterCoveredArea;
		oneLiterBucketsNeeded = areaLeft / oneLiterCoveredArea + ((areaLeft % oneLiterCoveredArea != 0) ? 1 : 0);
		
		int fiveLiterPrice = 15;
		int oneLiterPrice = 4;
		
		if (oneLiterBucketsNeeded * oneLiterPrice > fiveLiterPrice) {
			oneLiterBucketsNeeded = 0;
			fiveLiterBucketsNeeded++;
		}
		System.out.println("You need " + fiveLiterBucketsNeeded + " five liter buckets and " + oneLiterBucketsNeeded + " one liter buckets to paint the room.");
	}
}
