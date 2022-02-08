package functionalinterfaces;

public class Demo {

	public static void main(String[] args) {

		Operation add = new Addition();
		int answer = add.operate(5, 7);
		System.out.println("The answer using Addition class is: " + answer);
		
		
		Operation multiply = new Multiplication();
		int answer2 = multiply.operate(2, 8);
		System.out.println("The answer using Multiplication class is: " + answer2);
		
		// Anonymous classes
		// not creating an object for an interface
		// creating an object of a class that implements the interface
		// class has no name
		Operation add1 = new Operation() {
			@Override
			public int operate(int num1, int num2) {
				return num1 + num2;
			}
		};
		
		int answer3 = add1.operate(10, 20);
		System.out.println("The answer using an anonymous (addition) class is: " + answer3);
		
		
		Operation multiply1 = new Operation() {
			@Override
			public int operate(int num1, int num2) {
				return num1 * num2;
			}
		};
		
		int answer4 = multiply1.operate(10, 20);
		System.out.println("The answer using an anonymous (multiply) class is: " + answer4);
		
		// Lambda
		// can only be used with functional interfaces!
		Operation add3 = (num1, num2) -> num1 + num2;
		
		int answer5 = add3.operate(50, 100);
		System.out.println("The answer using lambda (addition) is: " + answer5);
		
		Operation multiply2 = (num1, num2) -> num1 * num2;
		
		int answer6 = multiply2.operate(50, 50);
		System.out.println("The answer using lambda (multiply) is: " + answer6);
		
		
		
	}

}
