package arraypractice;

import java.util.Arrays;

public class ArrayPractice {

	public static void main(String[] args) {
		// problem 1
		SumOfNNumbers total = new SumOfNNumbers();
		
		int sumOfNums = total.calculateTotal();
		
		System.out.println("The sum of " + Arrays.toString(total.numbersToSum) + " is " + sumOfNums);

		// problem 2
		NumberCount countOfNums = new NumberCount();
		
		countOfNums.countRepeats();
		
		
	}

}
