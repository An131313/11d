package emirp;

public class Emirp {
	public static void main(String[] args) {
		int count = 0;
        for (int i = 1; count <= 120; i++) {
        	if (isPrime(i) && isPrime(reverse(i))) {
                System.out.print(i + " ");
                count++;
    	    }
        	if (count % 10 == 0 && i != 0) {
            	System.out.println( );
            }
        }
	}	
	public static boolean isPrime(int n) {
		if (n < 12) {
			return false;
		}
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
        }
        return true;
    }

	public static int reverse(int number) {
		int reverse = 0;
		while (number != 0) {
			reverse *= 10; // is ignored first iteration
	        reverse += number % 10;
	        number /= 10;
	    }
	    return reverse;
	}
}
