package functionalinterfaces;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaPractice {

	public static void main(String[] args) {

		// 1. compute the cube of a number
		IntFunction<Integer> computeCube = (num) -> num * num * num;
		int computeCubeAnswer = computeCube.apply(4);
		
		System.out.println("The cube of 4 is: " + computeCubeAnswer);
		
		// 2. compute the base power number
		BiFunction<Integer, Integer, Integer> computePower = (num, toThePower) -> (int)Math.pow(num, toThePower);
		int computePowerAnswer = computePower.apply(5, 4);
		
		System.out.println("The result of 5 to the power of 4 is: " + computePowerAnswer);
		
		// 3. check if number is even
		Predicate<Integer> isNumberEven = (num) -> num % 2 == 0 ? true: false ;
		boolean isNumberEvenAnswer = isNumberEven.test(5);
		
		System.out.println("Is the number 5 even? " + isNumberEvenAnswer);
		
		boolean isNumberEvenAnswer2 = isNumberEven.test(8);
		
		System.out.println("Is the number 8 even? " + isNumberEvenAnswer2);
		
		// 4. generate a random number
		Supplier<Double> randomNumGenerator = () -> Math.random() * 10;
		Double randomNumGeneratorAnswer = randomNumGenerator.get();
		
		System.out.println("Here is a random number: " + randomNumGeneratorAnswer);
		
		
		// 5. print elements of an array
		Consumer<Integer[]> printArrayElems = (intArray) -> {
				for(int i = 0; i< intArray.length; i++) System.out.println(intArray[i]);
		};
		
		Integer[] intArray = {10, 20, 45, 22, 55};
		System.out.println("The elements of my intArray are: ");
		printArrayElems.accept(intArray);
		
		
	}

}
