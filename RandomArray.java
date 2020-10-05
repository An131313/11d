package randomArray;

public class RandomArray {
	public static void main(String[] args) {
        int[] ar1 = new int[20];
        for(int i = 0; i < 20; i++) {
            ar1[i] = (int)(Math.random()* 100);
            System.out.print(ar1[i] + "  ");
        }
    }
}
