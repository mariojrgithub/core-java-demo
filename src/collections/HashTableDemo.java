package collections;

import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		
		// create
		Hashtable<Integer, String> ht1 = new Hashtable<>();
		
		// add
		ht1.put(0, "Dog");
		ht1.put(1,  "Cat");
		ht1.put(2, "Hamster");
		
		// read
		System.out.println("The Hashtable mapping is: " + ht1);
		
		// update
		ht1.replace(1, "Tiger");
		
		System.out.println("After replacing element at index 1, ht1 contains: " + ht1);
		
		// delete
		ht1.remove(2);
		
		System.out.println("After removing value at index 2, ht1 contains: " + ht1);
		
		// check if element in Hashtable
		System.out.println("Is Cat in ht1? " + ht1.contains("Cat"));


	}

}
