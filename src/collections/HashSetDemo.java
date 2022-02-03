package collections;

import java.util.HashSet;
import java.util.Set;

import classesandobjects.RoomToPaint;

public class HashSetDemo {

	public static void main(String[] args) {
		
		Set<Object> myHashSet = new HashSet<>();
		
		String str1 = "Hello";
		String str2 = "Welcome";
		RoomToPaint room = new RoomToPaint(20, 30);
//		Integer number = new Integer(10); // deprecated
		Integer number = 10;
		
		// Create
		myHashSet.add(str1);
		myHashSet.add(str2);
		myHashSet.add(room.toString());
		myHashSet.add(number);
		myHashSet.add(str1); // not allowed
		System.out.println(myHashSet);
		
		// Update
		myHashSet.add("pizza");
		System.out.println(myHashSet);
		
		// Delete
		myHashSet.remove(str2);
		
		// check if an element is in the set
		System.out.println("Is " + str2 + " in the set? " + myHashSet.contains(str2));
		
		// Read
		System.out.println(myHashSet);

	}

}
