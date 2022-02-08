package functionalinterfaces;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;

public class LambdaPractice {

	public static void main(String[] args) {

		// 1. compute the cube of a number
		IntFunction<Integer> computeCube = (num) -> num * num * num;
		int computeCubeAnswer = computeCube.apply(4);
		
		System.out.println("The cube of 4 is: " + computeCubeAnswer);
		
		System.out.println("*********************************************");
		
		// 2. compute the base power number
		BiFunction<Integer, Integer, Integer> computePower = (num, toThePower) -> (int)Math.pow(num, toThePower);
		int computePowerAnswer = computePower.apply(5, 4);
		
		System.out.println("The result of 5 to the power of 4 is: " + computePowerAnswer);
		
		System.out.println("*********************************************");
		
		// 3. check if number is even
		Predicate<Integer> isNumberEven = (num) -> num % 2 == 0 ? true: false ;
		boolean isNumberEvenAnswer = isNumberEven.test(5);
		
		System.out.println("Is the number 5 even? " + isNumberEvenAnswer);
		
		boolean isNumberEvenAnswer2 = isNumberEven.test(8);
		
		System.out.println("Is the number 8 even? " + isNumberEvenAnswer2);
		
		System.out.println("*********************************************");
		
		// 4. generate a random number
		Supplier<Double> randomNumGenerator = () -> Math.random() * 10;
		Double randomNumGeneratorAnswer = randomNumGenerator.get();
		
		System.out.println("Here is a random number: " + randomNumGeneratorAnswer);
		
		System.out.println("*********************************************");
		
		// 5. print elements of an array
		Consumer<Integer[]> printArrayElems = (intArray) -> {
				for(int i = 0; i< intArray.length; i++) System.out.println(intArray[i]);
		};
		
		Integer[] intArray = {10, 20, 45, 22, 55};
		System.out.println("The elements of my intArray are: ");
		printArrayElems.accept(intArray);
		
		System.out.println("*********************************************");
		
		// 6. add two matrices
		Integer[][] firstMatrix = { {2, 3, 4}, {5, 6, 7}, {2, 3, 4} };
		Integer[][] secondMatrix = { {5, 6, 7}, {7, 8, 9}, {4, 5, 6} };
		
		BinaryOperator<Integer[][]> addMatrices = (mOne, mTwo) -> {
			Integer[][] resultMatrix = new Integer[mOne.length][mTwo.length];
			
			if(mOne.length == mTwo.length) {
			for(int i = 0; i < mOne.length; i++) {
				for(int j = 0; j < mTwo.length; j++) {
					resultMatrix[i][j] = mOne[i][j] + mTwo[i][j];
					}
				}
			}
			
			return resultMatrix;
		};
		
		Integer[][] result = addMatrices.apply(firstMatrix, secondMatrix);
		
		System.out.println("The result of adding " + Arrays.deepToString(firstMatrix) + " and " + Arrays.deepToString(secondMatrix) + " is: ");
		System.out.println(Arrays.deepToString(result));
		
		System.out.println("*********************************************");
		
		// 7. find the factorial of a number
		ToIntFunction<Integer> calculateFactorial = (number) -> {
			int factorialResult = 1;
			
			if(number == 0) {
				return factorialResult;
			} else {
				for(int i = 1; i <= number; i++) {
					factorialResult *= i; 
				}
			}
			return factorialResult;
		};
		
		int factorialResult = calculateFactorial.applyAsInt(8);
		
		System.out.println("The factorial of 8 is: " + factorialResult);
		
		System.out.println("*********************************************");
		
		// 8. check if first string is substring of a second string
		String sOne = "I love pizza";
		String sTwo = "pizza";
		
		BiPredicate<String, String> isSubstring = (stringOne, stringTwo) -> stringOne.contains(stringTwo);
		
		boolean isSubstringAnswer = isSubstring.test(sOne, sTwo);
		
		System.out.println("Is " + sTwo + " a substring of " + sOne + "? " + isSubstringAnswer);
			
		}
		
	}


