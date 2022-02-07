package exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionDemo3 {

	public static void main(String[] args) {

		// finally block is executed whether an exception is thrown or not thrown
		// finally block has closing of the resources that were opened in the try block
		// a new variation of try block - try with resources
		
		try {
			// open a resource
			//
			
		} catch (ArithmeticException ae) {
			//
			//
			
		} finally {
			// close the resource
			//
			
		}

		//
		//
		try {
			FileInputStream fls = new FileInputStream("D:\\test.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}

// 2 categories of exceptions
// checked exception - are siblings of RuntimeExceptions
//				     - these exceptions are handled using try/catch
//					 - FileNotFountException, IOException, SQLException
//					 - compiler enforced exception = the compiler makes sure these exceptions are handled

// unchecked exceptions - are sub classes of RuntimeException
//						- these exceptions should be programmatically handled
// 						- these occur due to developer error
//						- ArithmeticException, NullPointerException
//						- are not enforced by the compiler to be handled by try/catch

// correct way to handle ArithmeticException would be
// if(num2 != 0)
// result == num1 / num2;


// correct way to handle NullPointerException would be
// Room room = null;

// correct way to handle ClassCastException would be 
// Animal animal = new Dog();

//if( animal instanceof Cat) {
//	Cat cat = (Cat)animal; ---------> will throw ClassCastException, if not checked with instanceof operator
//} else if(animal instanceof Dog) {
//	Dog dog = (Dog)animal
//}

