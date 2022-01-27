
public class MultipleMethodDemo {
	// method to find cube of number
	public static int findCubeOfNumber(int num) {
		int cubed = num * num * num;
		
		return cubed;
	}
	
	// method to divide a number in half
	public static double divideByHalf(double num) {
		double half = num / 2;
		
		return half;
	}
	
	// method to find the ascii value of a character
	public static int findAscii(char letter) {
		int asciiValue = letter;
		
		return asciiValue;
	}
	
	// method to convert C to F 
	public static double covertToFarenheight(double temperature) {
		double farenheight = (temperature * (9 / 5)) + 32;
		
		return farenheight;
	}
	
	// method to convert km to m
	public static int kilometerToMeter(int kilometer) {
		int meter = kilometer * 1000;
		
		return meter;
	}

	
	public static void main(String[] args) {
		// input
		int numToCube = 40;
		double numToHalf = 25;
		char charToAscii = 'd'; 
		double celsius = 0;
		int km = 200;
		
		// method calls
		int numCubed = findCubeOfNumber(numToCube);
		double half = divideByHalf(numToHalf);
		int asciiChar = findAscii(charToAscii);
		double farenheight = covertToFarenheight(celsius);
		int meters = kilometerToMeter(km);
		
		
		// output
		System.out.println("The cube of " + numToCube + " is " + numCubed);
		
		System.out.println("Half of " + numToHalf + " is " + half);
		
		System.out.println("The ASCII value of " + charToAscii + " is " + asciiChar);
		
		System.out.println(celsius + " converted to farenheight is " + farenheight);
		
		System.out.println(km + " converted to meters is " + meters);
		

	}

}
