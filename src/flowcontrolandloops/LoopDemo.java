package flowcontrolandloops;

public class LoopDemo {

	public static void main(String[] args) {
		// while loop
		// print hello java 10 times to the console
		
		int i = 1;
		
		System.out.println("While loop:");
		
		while(i <= 10) {
			System.out.println(i + " Hello Java");
			i++;
		}
		
		// do..while loop
		//print first n natural numbers
		
		// input 
		int number = 8;
		
		int j = 1;
		
		System.out.println("\n" + "Do-While loop:");
		
		do {
			System.out.println(j);
			j++;
		} while(j <= number);
		
		// for loop
		// print all even numbers up to n
		
		// input
		int num = 30;
		
		System.out.println("\n" + "For loop:");
		
		for(int k = 1; k <= num; k++) {
			if(k % 2 == 0) {
				System.out.println(k);
			}
		}
		
	}

}
