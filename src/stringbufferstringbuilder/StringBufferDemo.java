package stringbufferstringbuilder;

import java.util.Arrays;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		// String
		String str1 = "";
		str1 = str1 + "Welcome";
		str1 = str1 + " xyz";
		System.out.println("String: " + str1);
		
		// StringBuffer
		StringBuffer sb1 = new StringBuffer();
		
		sb1.append("Hello");
		sb1.append(" abc");
		System.out.println("String Buffer: " + sb1);
		
		// String to primitive data types
		String data1 = "45.67";
		double data2 = Double.parseDouble(data1);

		System.out.println(++data2);
		
		String data3 = "80";
		int data4 = Integer.parseInt(data3);
		System.out.println(++data4);
		
		// primitive types to String
		int data5 = 89;
		String data6 = data5 + "";
		System.out.println(data6);
		
		System.out.println(String.valueOf(data5));
		
		System.out.println("********************************");
		
		// explore at least 10 methods for String
		String words1 = "Hello, my name is";
		String words2 = "mario sanchez";
		String words3 = "1983";
		int bday = 1983;
		String extraSpaces = "    this sentence        has the    wrong   spacing   ";
		
		// concat all words 
		String sentence = words1 + " " + words2 + " " + words3;
		System.out.println(sentence);
		
		// Capitalize first letter of words2
		String firstName = words2.substring(0, 1).toUpperCase() + words2.substring(1, 5);
		String lastName = words2.substring(6, 7).toUpperCase() + words2.substring(7);
		
		System.out.println(firstName + " " + lastName);
		
		// check if values are equal, no conversion
		System.out.println("Is words3 equal to bday as is? " + words3.equals(bday));
		// with conversion to string
		System.out.println("After converting bday to a string, is it equal to " + words3 + "? " + words3.equals(String.valueOf(bday)));
		
		// print original with improper spacing
		System.out.println(extraSpaces);
		
		// replace multiple spaces with one space and trim white space from front and back
		System.out.println(extraSpaces.replaceAll("\\s+", " ").trim());
		
		// find the index of the number 8 in words3
		System.out.println("The index of 8 in " + words3 + " is " + words3.indexOf("8"));
		
		// add a middle name with replace
		System.out.println(words2.replace(" ", " John "));
		
		
		// explore at least 5 methods for StringBuffer
	}

}
