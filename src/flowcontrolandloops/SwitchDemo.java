package flowcontrolandloops;

public class SwitchDemo {

	public static void main(String[] args) {
		// program to check if a char is a vowel or not
		
		// input
		char letter = 'u';
		String output = "";
		
		// logic
		switch(letter) {
			case 'a', 'e', 'i', 'o', 'u':
				output ="Vowel";
				break;
//			case 'e':
//				output ="Vowel";
//				break;
//			case 'i':
//				output ="Vowel";
//				break;
//			case 'o':
//				output ="Vowel";
//				break;
//			case 'u':
//				output ="Vowel";
//				break;
			default:
				output = "Not a vowel";
		}
		
		// output
		System.out.println(output);
		
	}

}
