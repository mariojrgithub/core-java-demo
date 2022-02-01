package arraypractice;

public class SumOfNNumbers {
	
	int[] numbersToSum = { 5, 60, 6, 20, 11 };
	
	
	public int calculateTotal() {
		int total = 0;
		
		for(int i = 0; i < numbersToSum.length; i++) {
			total += numbersToSum[i];
		}
		
		return total;
	
	}

}
