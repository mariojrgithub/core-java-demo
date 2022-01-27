// write a program to find the square of a number
// input 
// process
// output

public class MethodDemo {
	
	// method definition
	public static int squareOfANumber(int num) {
		// process
		int answer = num * num;
		
		return answer;
	}

	public static void main(String[] args) {
		// input
		int number = 30;
		
		// method invocation
		int myAnswer = squareOfANumber(number);
				
		// output
		System.out.println("Square of " + number + " is " + myAnswer);
		
	}

}
