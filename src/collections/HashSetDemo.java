package collections;

import java.util.HashSet;
import java.util.Set;

import classesandobjects.RoomToPaint;

public class HashSetDemo {

	public static void main(String[] args) {
		
		Set myHashSet = new HashSet();
		
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
		
		// Update
		myHashSet.add("CA");
		System.out.println(myHashSet);
		
		// Delete
		
		
		// Read
		System.out.println(myHashSet);

	}

}
