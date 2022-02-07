package PracticeProblems;

import java.util.ArrayList;
import java.util.Arrays;

public class PracticeSolutions {

	// Fibonacci
	static void Fibonacci(int N) {
		int num1 = 0;
		int num2 = 1;
		
		int counter = 0;
		
		while(counter < N) {
			System.out.print(num1 + " ");
			
			// swap
			int num3 = num2 + num1;
			num1 = num2;
			num2 = num3;
			counter += 1;
		}
	}
	
	static void evenNumbers() {
		
		int x = 10;
		int y = 20;
		
		int count = x;
		
		while(count <= y) {
			if(count % 2 == 0) {
				System.out.println(count);
			}
			count++;
		}
		
	}
	
	static int factorial(int N) {
		int num = N;
		
		int answer = 1;
		
		if(N == 0) {
			return answer;
		}
		
		for(int i = 1; i <= num; i++) {
			answer *= i;
		}
		
		return answer;
	}
	
	
	static void printArray(int[] intArray) {
		
		for(int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
	}
	
	static void arrayListEx() {
		ArrayList<Integer> intArray = new ArrayList<>();
		
		for(int i = 0; i < 10; i++) {
			intArray.add((int)(Math.random() * 10));
		}
		
		System.out.println(intArray);
		
	}
	
	static void array2dEx() {
		int[][] array2D = new int[3][3];
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				array2D[i][j] = (int)(Math.random() * 10);
			}
		}
		
		System.out.println(Arrays.deepToString(array2D));
	}
	

	
	public static void main(String[] args) {

		int N = 10;
		
		Fibonacci(N);
		
		System.out.println();
		System.out.println("Even numbers are: ");
		evenNumbers();
		
		System.out.println(factorial(5));
		
		int[] array = {10, 30, 49, 55};
		
		printArray(array);
		
		arrayListEx();
		
		array2dEx();

	}

}
