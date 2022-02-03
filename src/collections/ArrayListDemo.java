package collections;

import java.util.ArrayList;
import java.util.List;

import classesandobjects.RoomToPaint;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		// indexed
		// duplicates allowed
		// maintains order
//		ArrayList myList = new ArrayList(); // not recommended
		
		// recommended
		List<Object> myList = new ArrayList<>(); // using a generic
		
		
		String str1 = "Hello";
		String str2 = "Welcome";
		RoomToPaint room = new RoomToPaint(15, 25);
//		Integer number = new Integer(10); // deprecated
		Integer number = 10;
		int numInt = 5;
		
		// Create
		myList.add(str1);
		myList.add(str2);
		myList.add(room.toString());
		myList.add(number);
		myList.add(str1);
		myList.add(numInt); // auto boxing, converted to wrapper class
		
		// Read
		System.out.println(myList);
		System.out.println(myList.get(1));
		
		// Update
		myList.set(0, "Mario");
		System.out.println(myList);
		
		// Delete
		myList.remove(2);
		
		System.out.println(myList);
		
	}

}
