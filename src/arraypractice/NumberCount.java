package arraypractice;

public class NumberCount {
	
	int[] numbers = { 10, 20, 30, 10, 40, 50, 20, 10 };
	
	void countRepeats() {
		
		for(int i = 0; i < numbers.length; i++) {
		
			int currentVal = numbers[i];
			int count = 0;
			
			for(int j = 0;j < numbers.length; j++) {
				
				if(currentVal == numbers[j]) {
					count += 1;
				}
			}
			
			System.out.println(currentVal + " is repeated " + count + " times");
		}
		
	}
	

}
