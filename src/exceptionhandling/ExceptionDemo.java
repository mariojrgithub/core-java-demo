package exceptionhandling;

public class ExceptionDemo {

	public static void main(String[] args) {
		
		int num1 = 5;
		int num2 = 5;
		int result = 0;
		
		System.out.println("Going to divide......");
		
		// 1. JVM identifies the type of exception - ArithmeticException
		// 2. JVM creates an object of ArithmeticException
		// 3. JVM throws the exception object
		
		try {
			
			result = num1 / num2;
		
		} catch (ArithmeticException ae) {
			
			System.out.println("Cannot divide by zero... Changing it to 1...");
			num2 = 1;
			result = num1 / num2;
		
		}
		
		System.out.println("Result is: " + result);
		System.out.println("Division is over.....");

	}

}
