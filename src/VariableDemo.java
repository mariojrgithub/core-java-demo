
public class VariableDemo {

	public static void main(String[] args) {
		// 8 primitive data types
		
		// byte
		// short
		// int 
		// long
		
		// float
		// double
		
		// boolean
		
		// char
		
		// declare variable
		int englishMark;
		// assign a value to the variable
		englishMark = 20;
		
		// initialize a variable
		int mathMark = 50; // the value is a literal
		
		System.out.println("English Mark: " + englishMark);
		
		System.out.println("Math Mark: " + mathMark);
		
		short test = 4567;
		
		long longTest = 234567890;
		
		boolean flag = true;
		boolean result = false;
		
		System.out.println("Flag is: " + flag);
		System.out.println("Result is: " + result);
		
		char option = 'y'; // only one character allowed, single quotes
		System.out.println("Option is: " + option);
		
		byte data = 45;
		int myData = data; // implicit casting
		
		byte smallData = (byte) myData; // explicit casting
		
		
		// decimal literals are by default double type
		
		double socialMark = 45.67;
		
		float scienceMark = (float) 56.78;
		
		float otherScienceMark = 58.75f;
		
		

	}

}
