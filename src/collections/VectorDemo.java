package collections;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		// VectorSet implements an array that can grow
		
		Vector<String> vec1 = new Vector<>();
		
		// add objects
		vec1.add("John");
		vec1.add("Mark");
		vec1.add("Sally");
		
		System.out.println("vec1 contains: " + vec1);
		
		// read first element
		String first = vec1.firstElement();
		// read last element
		String last = vec1.lastElement();
		
		System.out.println("The first element is: " + first + " and the last element is: " + last);
		
		// update vector
		vec1.add(1, "Mario");
		
		System.out.println("After adding an element at index 1, vec1 contains: " + vec1);
		
		// delete
		vec1.remove("Sally");
		
		// check if the vector contains "Sally"
		System.out.println("Is Sally still in the vector? " + vec1.contains("Sally"));
		
	}

}
