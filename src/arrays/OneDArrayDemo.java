package arrays;

public class OneDArrayDemo {

	public static void main(String[] args) {
		// declare int variable
		int mark1;
		mark1 = 20;
		
		// declare int array
		int[] myMarks;
		myMarks = new int[5];
		
		myMarks[0] = 45;
		myMarks[1] = 89;
		myMarks[2] = 5;
		myMarks[3] = 37;
		myMarks[4] = 8;
		
		for(int i = 0; i < myMarks.length; i++) {
			System.out.println(myMarks[i]);
		}
		
		// initialize an array
		int[] scores = { 50, 30, 40, 70 };

	}

}
