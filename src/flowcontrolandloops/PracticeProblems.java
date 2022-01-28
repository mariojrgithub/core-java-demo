package flowcontrolandloops;

public class PracticeProblems {

	// print the greater of two numbers
	public static int greaterOfTwoNumbers(int num1, int num2) {
		if(num1 > num2) {
			return num1;
		} else {
			return num2;
		}
	}
	
	// print the greater of 3 numbers
	public static int greaterOfThreeNumbers(int num1, int num2, int num3) {
		if(num1 > num2 && num1 > num3) {
			return num1;
		} else if(num2 > num1 && num2 > num3) {
			return num2;
		} else {
			return num3;
		}
	}
	
	// print if the number is even or odd
	public static void evenOrOdd(int num) {
		if(num % 2 == 0) {
			System.out.println(num + " is even");
		} else {
			System.out.println(num + " is odd");
		}
	}
	
	// print odd numbers up to N
	public static void printOddNumbers(int num) {
		for(int i = 1; i <= num; i++) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}
	}
	
	// print the factorial of a number
	public static int calculateFactorial(int num) {
		int result = 1;
		for(int i = 1; i <= num; i++) {
			result *= i;
		}
		
		return result;
	}
	
	// print if the number is prime or not
	public static void findIfPrime(int num) {
		int factors = 0;
		
		for(int i = 1; i <= num; i++) {
			if(num % i == 0) {
				factors += 1;
			}
		}
		
		if(factors > 2) {
			System.out.println(num + " is not a prime number");
		} else {
			System.out.println(num + " is a prime number");
		}
		
	}
	
	// print sum of the digits of a number
	public static int sumOfDigits(int num) {
		// initialize 
		int number = num;
		int digit = 0;
		int sum = 0;
		
		while(number > 0) {
			// get last digit 
			digit = number % 10;
			// add above to the sum
			sum += digit;
			// remove the last digit of number 
			number /= 10;
		}
		
		return sum;
	}
	
//	public static String printFibonacci(int num) {
//		
//	}
	
	public static void main(String[] args) {
		// input
		int methodOneNum1 = 3;
		int methodOneNum2 = 5;
		
		int methodTwoNum1 = 5;
		int methodTwoNum2 = 60;
		int methodTwoNum3 = 45;
		
		int evenOrOddNum = 33;
		
		int maxNValue = 30;
	
		int factorialNum = 5;
		
		int possiblePrimeNum = 10;
		
		int numForSum = 1253;
		
		//method calls
		int methodOneLargerNum = greaterOfTwoNumbers(methodOneNum1, methodOneNum2);
		
		int methodTwoLargerNum = greaterOfThreeNumbers(methodTwoNum1, methodTwoNum2, methodTwoNum3);
		
		int factorialResult = calculateFactorial(factorialNum);
		
		int digitSum = sumOfDigits(numForSum);
		
		
		// output
		System.out.println("The largest number of the two entered is " + methodOneLargerNum);
		
		System.out.println("The largest number of the three entered is " + methodTwoLargerNum);
		
		evenOrOdd(evenOrOddNum);
		
		printOddNumbers(maxNValue);
		
		System.out.println("The factorial of " + factorialNum + " is " + factorialResult);
		
		findIfPrime(possiblePrimeNum);
		
		System.out.println("The sum of each digit of " + numForSum + " is " + digitSum);
	}

}
