package tuition;

public class Tuition {

	public static void main(String[] args){
		
		double tuition  = 10_000;
		double payment = 0;
		
		for (int i = 0; i < 14; i++){
			tuition *= 1.06;
			if (i>9){ 
				payment += tuition;
			}
		}
		payment = (int)(payment*100)/100.0;
		System.out.println("The ammount you have to pay is " + payment);
	}
}
