package flowcontrolandloops;

public class IfDemo {

	public static void main(String[] args) {
		// program to check if a number is greater than 10
		// input
		int number = 6;
		String output = "";
		
		// process - logic
		if(number > 10) {
			output = "The number " + number + " is greater than 10";
		} else {
			output = "The number " + number + " is less than 10";
		}
		
		// output
		System.out.println(output);
	}

}
