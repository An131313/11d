package casting01;

public class casting01 {
	public static void main(String[] args) {
        //Declare and initialize a byte with a value of 128
        //Observe NetBeans' complaint
		//byte testByte = 128;
        
        //Declare and initialize a short with a value of 128
        //Create a print statement that casts this short to a byte
		short testCast = 128;
		System.out.println ((byte)testCast);
        
        
        //Declare and initialize a byte with a value of 127
        //Add 1 to this variable and print it
        //Add 1 to this variable again and print it again
		byte testByte = 127;
		testByte ++;
		System.out.println(testByte);
		testByte ++;
		System.out.println(testByte); 
    }    
}
