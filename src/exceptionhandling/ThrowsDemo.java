package exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsDemo {

	public static void method1() throws FileNotFoundException {
		
		FileInputStream fis = new FileInputStream("D:\\test.txt");
	
	}
	
	public static void method2() throws FileNotFoundException {
		//	
		//
		//
		method1();
		//
		//
		//
	}
	
//	don't do below, equal to not handling the exception
//	public static void main(String[] args) throws FileNotFoundException {
//		method2();	
//	}
	
	public static void main(String[] args) {

		try {
			method2();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
